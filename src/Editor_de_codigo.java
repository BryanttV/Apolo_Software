
import GUI.SimpleWebBrowser;
import com.Ostermiller.Syntax.HighlightedDocument;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static judge.CompileAndRun.*;

public class Editor_de_codigo extends javax.swing.JFrame implements ClipboardOwner {

    SimpleWebBrowser s = new SimpleWebBrowser();
    JFileChooser seleccion = new JFileChooser();
    File archivo_abrir, codigo_modificado;
    FileInputStream entrada, in;
    FileOutputStream salida, out;

    public Editor_de_codigo() {
        initComponents();
        this.setLocationRelativeTo(null);
        plantilla();
    }

    private void plantilla() {
        Txp_Codigo.setText("public class Main {\n"
                + "    public static void main(String[] args) {\n"
                + "       System.out.println(\"Hello World\");\n"
                + "    } \n"
                + "}");
    }

    public String openFile(File archivo) {

        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                documento += caracter;
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al abrir" + e);
        }
        return documento;
    }

    public String saveFile(File archivo, String documento) {
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "Codigo Guardado exitosamente";
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar" + e);
        }
        return mensaje;
    }

    public void clipBoard(String texto) {
        StringSelection txt = new StringSelection(texto);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(txt, this);
    }

    private void guardar() {
        if (seleccion.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo_abrir = seleccion.getSelectedFile();
            if (archivo_abrir.getName().endsWith(".java")) {
                String documento = Txp_Codigo.getText();
                String mensaje = saveFile(archivo_abrir, documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar Codigo Java");
            }
        }
    }

    public int compilar(String ruta) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("javac", ruta);
        pb.redirectError();

        String[] partesRuta = ruta.split("\\\\");

        String rutaNueva = "";

        for (int i = 0; i < partesRuta.length - 1; i++) {
            if (i < partesRuta.length - 2) {
                rutaNueva += partesRuta[i] + "\\\\";
            } else {
                rutaNueva += partesRuta[i];
            }
        }

        pb.directory(new File(rutaNueva));
        Process p = pb.start();
        InputStreamConsumer consumer = new InputStreamConsumer(p.getInputStream());
        consumer.start();
        int result = p.waitFor();
        consumer.join();
        System.out.println(consumer.getOutput());
        return result;
    }

    public int ejecutar(String clase, String ruta) throws IOException, InterruptedException {

        List<String> cmds = new ArrayList<>();
        cmds.add("java");
        cmds.add(clase);

        ProcessBuilder pb = new ProcessBuilder(cmds);
        pb.redirectError();
        pb.redirectInput(new File(System.getProperty("user.dir") + "\\src\\editor", "output.txt"));

        pb.directory(new File("src"));

        Process p = pb.start();
        InputStreamConsumer consumer = new InputStreamConsumer(p.getInputStream());
        consumer.start();
        int result = p.waitFor();
        consumer.join();

        String writteable = consumer.getOutput().toString();

        Txa_Salida.setText(writteable);

        try (FileWriter fw = new FileWriter(System.getProperty("user.dir") + "\\src\\editor\\output.txt")) {
            fw.write(writteable);
            // System.out.println("Archivo de salida correctamente creado");
        }

        return result;
    }

    private void entrada() {
        String documento = Txa_Entrada.getText();
        try {
            out = new FileOutputStream(System.getProperty("user.dir") + "\\src\\editor\\input.txt");
            byte[] bytxt = documento.getBytes();
            out.write(bytxt);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar" + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Principal = new javax.swing.JPanel();
        Pnl_Botones = new javax.swing.JPanel();
        Btnguardar = new javax.swing.JButton();
        BtnCopiar = new javax.swing.JButton();
        BtnEjecutar = new javax.swing.JButton();
        BtnAbrir = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnPlantilla = new javax.swing.JButton();
        Pnl_Codigo = new javax.swing.JPanel();
        Scp_Codigo = new javax.swing.JScrollPane();
        Txp_Codigo = new javax.swing.JTextPane();
        Pnl_Salida = new javax.swing.JPanel();
        Scp_Entrada = new javax.swing.JScrollPane();
        Txa_Entrada = new javax.swing.JTextArea();
        Scp_Salida = new javax.swing.JScrollPane();
        Txa_Salida = new javax.swing.JTextArea();
        Btn_Entrada = new javax.swing.JButton();
        Lbl_Salida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(580, 610));
        setMinimumSize(new java.awt.Dimension(580, 610));
        setPreferredSize(new java.awt.Dimension(580, 610));

        Pnl_Principal.setMaximumSize(new java.awt.Dimension(570, 580));
        Pnl_Principal.setMinimumSize(new java.awt.Dimension(570, 580));
        Pnl_Principal.setPreferredSize(new java.awt.Dimension(570, 580));
        Pnl_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Botones.setBackground(new java.awt.Color(255, 255, 204));
        Pnl_Botones.setMaximumSize(new java.awt.Dimension(560, 60));
        Pnl_Botones.setMinimumSize(new java.awt.Dimension(560, 60));
        Pnl_Botones.setPreferredSize(new java.awt.Dimension(560, 60));
        Pnl_Botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btnguardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btnguardar.setText("Guardar");
        Btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnguardarActionPerformed(evt);
            }
        });
        Pnl_Botones.add(Btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 30));

        BtnCopiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnCopiar.setText("Copiar");
        BtnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCopiarActionPerformed(evt);
            }
        });
        Pnl_Botones.add(BtnCopiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 80, 30));

        BtnEjecutar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnEjecutar.setText("Ejecutar");
        BtnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjecutarActionPerformed(evt);
            }
        });
        Pnl_Botones.add(BtnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 80, 30));

        BtnAbrir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnAbrir.setText("Abrir");
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });
        Pnl_Botones.add(BtnAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 80, 30));

        BtnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        Pnl_Botones.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 80, 30));

        BtnPlantilla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnPlantilla.setText("Plantilla");
        BtnPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlantillaActionPerformed(evt);
            }
        });
        Pnl_Botones.add(BtnPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 80, 30));

        Pnl_Principal.add(Pnl_Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 60));

        Pnl_Codigo.setBackground(new java.awt.Color(204, 255, 255));
        Pnl_Codigo.setMaximumSize(new java.awt.Dimension(560, 340));
        Pnl_Codigo.setMinimumSize(new java.awt.Dimension(560, 340));
        Pnl_Codigo.setPreferredSize(new java.awt.Dimension(560, 340));
        Pnl_Codigo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txp_Codigo.setStyledDocument(new HighlightedDocument());
        Scp_Codigo.setViewportView(Txp_Codigo);

        Pnl_Codigo.add(Scp_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 320));

        Pnl_Principal.add(Pnl_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 560, 340));

        Pnl_Salida.setBackground(new java.awt.Color(153, 255, 153));
        Pnl_Salida.setMaximumSize(new java.awt.Dimension(560, 130));
        Pnl_Salida.setMinimumSize(new java.awt.Dimension(560, 130));
        Pnl_Salida.setPreferredSize(new java.awt.Dimension(560, 130));
        Pnl_Salida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txa_Entrada.setColumns(20);
        Txa_Entrada.setRows(5);
        Scp_Entrada.setViewportView(Txa_Entrada);

        Pnl_Salida.add(Scp_Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, 120));

        Txa_Salida.setColumns(20);
        Txa_Salida.setRows(5);
        Scp_Salida.setViewportView(Txa_Salida);

        Pnl_Salida.add(Scp_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 270, 120));

        Btn_Entrada.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Btn_Entrada.setText("Entrada");
        Btn_Entrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EntradaActionPerformed(evt);
            }
        });
        Pnl_Salida.add(Btn_Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Lbl_Salida.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Lbl_Salida.setText("Salida");
        Pnl_Salida.add(Lbl_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        Pnl_Principal.add(Pnl_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 560, 170));

        getContentPane().add(Pnl_Principal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCopiarActionPerformed
        clipBoard(Txp_Codigo.getText());
    }//GEN-LAST:event_BtnCopiarActionPerformed

    private void BtnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjecutarActionPerformed
        guardar();
        entrada();
        try {
            String codigo = archivo_abrir.toString();
            System.out.println(codigo);

            String code = Txp_Codigo.getText(); // Codigo Modificado
            String codeModificado = ReemplazarCodigo.reemplazar(code);
//            System.out.println(codeModificado);

            try {
                out = new FileOutputStream(System.getProperty("user.dir") + "\\src\\editor\\Main.java");
                byte[] bytxt = codeModificado.getBytes();
                out.write(bytxt);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar" + e);
            }

            String ruta = System.getProperty("user.dir") + "\\src\\editor\\Main.java";  // Ruta donde se guarda el archivo

            int result = compilar(ruta);  // Compila el archivo

            // Confirmar compilacion exitosa
            if (result != 0) {
                JOptionPane.showMessageDialog(null, "Compilation Error");
                System.out.println("Numero: " + result);
            }
            // System.out.println("Compilador de java (javac) retorna un " + result);

            // Ejecutar archivo
            result = ejecutar("editor.Main", ruta);

            // Confirmar ejecucion exitosa
            if (result != 0) {
                System.out.println("Numero: " + result);
                JOptionPane.showMessageDialog(null, "Runtime Error");
            }
            // System.out.println("Ejecutable java (java judge.Main) retorna un " + result);

        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Editor_de_codigo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnEjecutarActionPerformed

    private void BtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnguardarActionPerformed
        guardar();
    }//GEN-LAST:event_BtnguardarActionPerformed

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
        if (seleccion.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo_abrir = seleccion.getSelectedFile();
            if (archivo_abrir.canRead()) {
                if (archivo_abrir.getName().endsWith("java")) {
                    String documento = openFile(archivo_abrir);
                    Txp_Codigo.setText(documento);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible.");
                }
            }
        }
    }//GEN-LAST:event_BtnAbrirActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        Txp_Codigo.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlantillaActionPerformed
        plantilla();
    }//GEN-LAST:event_BtnPlantillaActionPerformed

    private void Btn_EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EntradaActionPerformed

    }//GEN-LAST:event_Btn_EntradaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Editor_de_codigo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAbrir;
    private javax.swing.JButton BtnCopiar;
    private javax.swing.JButton BtnEjecutar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnPlantilla;
    private javax.swing.JButton Btn_Entrada;
    private javax.swing.JButton Btnguardar;
    private javax.swing.JLabel Lbl_Salida;
    private javax.swing.JPanel Pnl_Botones;
    private javax.swing.JPanel Pnl_Codigo;
    private javax.swing.JPanel Pnl_Principal;
    private javax.swing.JPanel Pnl_Salida;
    private javax.swing.JScrollPane Scp_Codigo;
    private javax.swing.JScrollPane Scp_Entrada;
    private javax.swing.JScrollPane Scp_Salida;
    private javax.swing.JTextArea Txa_Entrada;
    private javax.swing.JTextArea Txa_Salida;
    private javax.swing.JTextPane Txp_Codigo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void lostOwnership(Clipboard clpbrd, Transferable t) {
    }
}
