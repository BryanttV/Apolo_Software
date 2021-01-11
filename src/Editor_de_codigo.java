
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
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Editor_de_codigo extends javax.swing.JFrame implements ClipboardOwner {
    
    SimpleWebBrowser s = new SimpleWebBrowser();
    JFileChooser seleccion = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    public Editor_de_codigo() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        Pnl_Codigo = new javax.swing.JPanel();
        Scp_Codigo = new javax.swing.JScrollPane();
        Txp_Codigo = new javax.swing.JTextPane();
        Pnl_Salida = new javax.swing.JPanel();
        Scp_Salida = new javax.swing.JScrollPane();
        Txa_Salida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(575, 570));
        setMinimumSize(new java.awt.Dimension(575, 570));
        setPreferredSize(new java.awt.Dimension(575, 570));

        Pnl_Principal.setMaximumSize(new java.awt.Dimension(560, 530));
        Pnl_Principal.setPreferredSize(new java.awt.Dimension(560, 530));
        Pnl_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Botones.setBackground(new java.awt.Color(255, 255, 204));
        Pnl_Botones.setMaximumSize(new java.awt.Dimension(560, 60));
        Pnl_Botones.setMinimumSize(new java.awt.Dimension(560, 60));
        Pnl_Botones.setPreferredSize(new java.awt.Dimension(560, 60));
        Pnl_Botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btnguardar.setText("Guardar");
        Btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnguardarActionPerformed(evt);
            }
        });
        Pnl_Botones.add(Btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        BtnCopiar.setText("Copiar");
        BtnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCopiarActionPerformed(evt);
            }
        });
        Pnl_Botones.add(BtnCopiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        BtnEjecutar.setText("Ejecutar");
        BtnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjecutarActionPerformed(evt);
            }
        });
        Pnl_Botones.add(BtnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        BtnAbrir.setText("Abrir");
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });
        Pnl_Botones.add(BtnAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        Pnl_Botones.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

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

        Txa_Salida.setColumns(20);
        Txa_Salida.setRows(5);
        Scp_Salida.setViewportView(Txa_Salida);

        Pnl_Salida.add(Scp_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 110));

        Pnl_Principal.add(Pnl_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 560, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCopiarActionPerformed
        clipBoard(Txp_Codigo.getText());
    }//GEN-LAST:event_BtnCopiarActionPerformed

    private void BtnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjecutarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEjecutarActionPerformed

    private void BtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnguardarActionPerformed
        if (seleccion.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccion.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String documento = Txp_Codigo.getText();
                String mensaje = saveFile(archivo, documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar Codigo Java");
            }
        }
    }//GEN-LAST:event_BtnguardarActionPerformed

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
        if (seleccion.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccion.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("java")) {
                    String documento = openFile(archivo);
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
    private javax.swing.JButton Btnguardar;
    private javax.swing.JPanel Pnl_Botones;
    private javax.swing.JPanel Pnl_Codigo;
    private javax.swing.JPanel Pnl_Principal;
    private javax.swing.JPanel Pnl_Salida;
    private javax.swing.JScrollPane Scp_Codigo;
    private javax.swing.JScrollPane Scp_Salida;
    private javax.swing.JTextArea Txa_Salida;
    private javax.swing.JTextPane Txp_Codigo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void lostOwnership(Clipboard clpbrd, Transferable t) {
    }
}
