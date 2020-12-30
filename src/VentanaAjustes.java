
public class VentanaAjustes extends javax.swing.JFrame {

    static public Home_Apolo Home = new Home_Apolo();

    public VentanaAjustes() {
        initComponents();
        setVentana();
//        cerrar();
    }

    private void setVentana() {
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Ajustes = new javax.swing.JPanel();
        Label_Ajustes = new javax.swing.JLabel();

        setTitle("Ajustes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Ajustes.setBackground(new java.awt.Color(255, 204, 51));

        Label_Ajustes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Ajustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Ajustes.setText("Ajustes");
        Label_Ajustes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Panel_AjustesLayout = new javax.swing.GroupLayout(Panel_Ajustes);
        Panel_Ajustes.setLayout(Panel_AjustesLayout);
        Panel_AjustesLayout.setHorizontalGroup(
            Panel_AjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AjustesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Label_Ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        Panel_AjustesLayout.setVerticalGroup(
            Panel_AjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AjustesLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(Label_Ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        getContentPane().add(Panel_Ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaAjustes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Ajustes;
    private javax.swing.JPanel Panel_Ajustes;
    // End of variables declaration//GEN-END:variables
}
