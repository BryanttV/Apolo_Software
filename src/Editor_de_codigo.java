
import GUI.SimpleWebBrowser;
import com.Ostermiller.Syntax.HighlightedDocument;

public class Editor_de_codigo extends javax.swing.JFrame {

    static SimpleWebBrowser s = new SimpleWebBrowser();

    public Editor_de_codigo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Principal = new javax.swing.JPanel();
        Pnl_Botones = new javax.swing.JPanel();
        Pnl_Texto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
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
        Pnl_Principal.add(Pnl_Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 60));

        Pnl_Texto.setBackground(new java.awt.Color(204, 255, 255));
        Pnl_Texto.setMaximumSize(new java.awt.Dimension(560, 340));
        Pnl_Texto.setMinimumSize(new java.awt.Dimension(560, 340));
        Pnl_Texto.setPreferredSize(new java.awt.Dimension(560, 340));
        Pnl_Texto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPane1.setStyledDocument(new HighlightedDocument());
        jScrollPane1.setViewportView(jTextPane1);

        Pnl_Texto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 320));

        Pnl_Principal.add(Pnl_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 560, 340));

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Editor_de_codigo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_Botones;
    private javax.swing.JPanel Pnl_Principal;
    private javax.swing.JPanel Pnl_Salida;
    private javax.swing.JPanel Pnl_Texto;
    private javax.swing.JScrollPane Scp_Salida;
    private javax.swing.JTextArea Txa_Salida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
