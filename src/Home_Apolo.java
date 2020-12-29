
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Home_Apolo extends javax.swing.JFrame {

    public Home_Apolo() {
        initComponents();
        setVentana();
        ocultarBotones();
    }

    private void setVentana() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Acabar el programa cuando oprima la x
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar a pantalla completa
        this.getContentPane().setBackground(Color.red); // Linea de Prueba 
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Apolo_Icono_Blanco_40px.png")).getImage());
    }

    private void ocultarBotones() {
        Button_Aprender_Tema1.setVisible(false);
        Button_Aprender_Tema2.setVisible(false);
        Button_Aprender_Tema3.setVisible(false);
        Button_Aprender_Tema4.setVisible(false);
        Button_Aprender_Tema5.setVisible(false);
        Button_Aprender_Tema6.setVisible(false);
        Button_Aprender_Tema7.setVisible(false);
        Button_Aprender_Tema8.setVisible(false);
        Button_Aprender_Tema9.setVisible(false);
        Button_Aprender_Tema10.setVisible(false);
        Button_Aprender_Tema11.setVisible(false);
        Button_Aprender_Tema12.setVisible(false);
        Button_Aprender_Tema13.setVisible(false);
        Button_Aprender_Tema14.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Bar_Buttons = new javax.swing.JPanel();
        Button_Aprender = new javax.swing.JToggleButton();
        Button_CodeStorm = new javax.swing.JToggleButton();
        Button_Programar = new javax.swing.JToggleButton();
        Button_Ajustes = new javax.swing.JToggleButton();
        Button_Historia = new javax.swing.JToggleButton();
        Lbl_HomeButttons = new javax.swing.JLabel();
        Panel_Home = new javax.swing.JPanel();
        Lbl_Home_Fondo = new javax.swing.JLabel();
        Panel_Aprender = new javax.swing.JPanel();
        Button_Aprender_Tema1 = new javax.swing.JButton();
        Button_Aprender_Tema2 = new javax.swing.JButton();
        Button_Aprender_Tema3 = new javax.swing.JButton();
        Button_Aprender_Tema4 = new javax.swing.JButton();
        Button_Aprender_Tema5 = new javax.swing.JButton();
        Button_Aprender_Tema6 = new javax.swing.JButton();
        Button_Aprender_Tema7 = new javax.swing.JButton();
        Button_Aprender_Tema8 = new javax.swing.JButton();
        Button_Aprender_Tema9 = new javax.swing.JButton();
        Button_Aprender_Tema10 = new javax.swing.JButton();
        Button_Aprender_Tema11 = new javax.swing.JButton();
        Button_Aprender_Tema12 = new javax.swing.JButton();
        Button_Aprender_Tema13 = new javax.swing.JButton();
        Button_Aprender_Tema14 = new javax.swing.JButton();
        Lbl_Aprender_Mapa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1366, 705));
        setMinimumSize(new java.awt.Dimension(1366, 705));
        setPreferredSize(new java.awt.Dimension(1366, 705));
        setSize(new java.awt.Dimension(1366, 705));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Bar_Buttons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Aprender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_AprenderButton_Off.png"))); // NOI18N
        Button_Aprender.setBorderPainted(false);
        Button_Aprender.setContentAreaFilled(false);
        Button_Aprender.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_AprenderButton_On.png"))); // NOI18N
        Button_Aprender.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_AprenderButton_On.png"))); // NOI18N
        Button_Aprender.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_AprenderButton_Enabled.png"))); // NOI18N
        Button_Aprender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AprenderActionPerformed(evt);
            }
        });
        Panel_Bar_Buttons.add(Button_Aprender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 55));

        Button_CodeStorm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_CodeStormButton_Off.png"))); // NOI18N
        Button_CodeStorm.setBorderPainted(false);
        Button_CodeStorm.setContentAreaFilled(false);
        Button_CodeStorm.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_CodeStormButton_On.png"))); // NOI18N
        Button_CodeStorm.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_CodeStormButton_On.png"))); // NOI18N
        Button_CodeStorm.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_CodeStormButton_Enabled.png"))); // NOI18N
        Button_CodeStorm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CodeStormActionPerformed(evt);
            }
        });
        Panel_Bar_Buttons.add(Button_CodeStorm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 170, 55));

        Button_Programar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_ProgramaButton_Off.png"))); // NOI18N
        Button_Programar.setBorderPainted(false);
        Button_Programar.setContentAreaFilled(false);
        Button_Programar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_ProgramaButton_On.png"))); // NOI18N
        Button_Programar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_ProgramaButton_On.png"))); // NOI18N
        Button_Programar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_ProgramaButton_Enabled.png"))); // NOI18N
        Button_Programar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ProgramarActionPerformed(evt);
            }
        });
        Panel_Bar_Buttons.add(Button_Programar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 170, 55));

        Button_Ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_AjustesButton_Off.png"))); // NOI18N
        Button_Ajustes.setBorderPainted(false);
        Button_Ajustes.setContentAreaFilled(false);
        Button_Ajustes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_AjustesButton_On.png"))); // NOI18N
        Button_Ajustes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_AjustesButton_On.png"))); // NOI18N
        Button_Ajustes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_AjustesButton_Enabled.png"))); // NOI18N
        Button_Ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AjustesActionPerformed(evt);
            }
        });
        Panel_Bar_Buttons.add(Button_Ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 170, 55));

        Button_Historia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_HistoriaButton_Off.png"))); // NOI18N
        Button_Historia.setBorderPainted(false);
        Button_Historia.setContentAreaFilled(false);
        Button_Historia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_HistoriaButton_On.png"))); // NOI18N
        Button_Historia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_HistoriaButton_On.png"))); // NOI18N
        Button_Historia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_HistoriaButton_Enabled.png"))); // NOI18N
        Button_Historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_HistoriaActionPerformed(evt);
            }
        });
        Panel_Bar_Buttons.add(Button_Historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 170, 55));

        Lbl_HomeButttons.setBackground(new java.awt.Color(0, 255, 0));
        Lbl_HomeButttons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_FondoButtons.png"))); // NOI18N
        Lbl_HomeButttons.setOpaque(true);
        Panel_Bar_Buttons.add(Lbl_HomeButttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 705));

        getContentPane().add(Panel_Bar_Buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 710));

        Panel_Home.setMaximumSize(new java.awt.Dimension(1176, 705));
        Panel_Home.setMinimumSize(new java.awt.Dimension(1176, 705));
        Panel_Home.setPreferredSize(new java.awt.Dimension(1176, 705));
        Panel_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Home_Fondo.setBackground(new java.awt.Color(0, 204, 0));
        Lbl_Home_Fondo.setForeground(new java.awt.Color(0, 204, 204));
        Lbl_Home_Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Home_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Home_Fondo.png"))); // NOI18N
        Lbl_Home_Fondo.setText("Fondo");
        Lbl_Home_Fondo.setMaximumSize(new java.awt.Dimension(1176, 705));
        Lbl_Home_Fondo.setMinimumSize(new java.awt.Dimension(1176, 705));
        Lbl_Home_Fondo.setOpaque(true);
        Lbl_Home_Fondo.setPreferredSize(new java.awt.Dimension(1176, 705));
        Panel_Home.add(Lbl_Home_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 705));

        getContentPane().add(Panel_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1176, -1));

        Panel_Aprender.setMaximumSize(new java.awt.Dimension(1176, 705));
        Panel_Aprender.setMinimumSize(new java.awt.Dimension(1176, 705));
        Panel_Aprender.setPreferredSize(new java.awt.Dimension(1176, 705));
        Panel_Aprender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Aprender_Tema1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema1_Off.png"))); // NOI18N
        Button_Aprender_Tema1.setBorderPainted(false);
        Button_Aprender_Tema1.setContentAreaFilled(false);
        Button_Aprender_Tema1.setFocusPainted(false);
        Button_Aprender_Tema1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema1_On.png"))); // NOI18N
        Button_Aprender_Tema1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema1ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 88, 81));
        Button_Aprender_Tema1.getAccessibleContext().setAccessibleDescription("");

        Button_Aprender_Tema2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema2_Off.png"))); // NOI18N
        Button_Aprender_Tema2.setBorderPainted(false);
        Button_Aprender_Tema2.setContentAreaFilled(false);
        Button_Aprender_Tema2.setFocusPainted(false);
        Button_Aprender_Tema2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema2_On.png"))); // NOI18N
        Button_Aprender_Tema2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema2ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 88, 81));

        Button_Aprender_Tema3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema3_Off.png"))); // NOI18N
        Button_Aprender_Tema3.setBorderPainted(false);
        Button_Aprender_Tema3.setContentAreaFilled(false);
        Button_Aprender_Tema3.setFocusPainted(false);
        Button_Aprender_Tema3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema3_On.png"))); // NOI18N
        Button_Aprender_Tema3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema3ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 88, 81));

        Button_Aprender_Tema4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema4_Off.png"))); // NOI18N
        Button_Aprender_Tema4.setBorderPainted(false);
        Button_Aprender_Tema4.setContentAreaFilled(false);
        Button_Aprender_Tema4.setFocusPainted(false);
        Button_Aprender_Tema4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema4_On.png"))); // NOI18N
        Button_Aprender_Tema4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema4ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 88, 81));

        Button_Aprender_Tema5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema5_Off.png"))); // NOI18N
        Button_Aprender_Tema5.setBorderPainted(false);
        Button_Aprender_Tema5.setContentAreaFilled(false);
        Button_Aprender_Tema5.setFocusPainted(false);
        Button_Aprender_Tema5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema5_On.png"))); // NOI18N
        Button_Aprender_Tema5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema5ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, 88, 81));

        Button_Aprender_Tema6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema6_Off.png"))); // NOI18N
        Button_Aprender_Tema6.setBorderPainted(false);
        Button_Aprender_Tema6.setContentAreaFilled(false);
        Button_Aprender_Tema6.setFocusPainted(false);
        Button_Aprender_Tema6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema6_On.png"))); // NOI18N
        Button_Aprender_Tema6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema6ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 88, 81));

        Button_Aprender_Tema7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema7_Off.png"))); // NOI18N
        Button_Aprender_Tema7.setBorderPainted(false);
        Button_Aprender_Tema7.setContentAreaFilled(false);
        Button_Aprender_Tema7.setFocusPainted(false);
        Button_Aprender_Tema7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema7_On.png"))); // NOI18N
        Button_Aprender_Tema7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema7ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 88, 81));

        Button_Aprender_Tema8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema8_Off.png"))); // NOI18N
        Button_Aprender_Tema8.setBorderPainted(false);
        Button_Aprender_Tema8.setContentAreaFilled(false);
        Button_Aprender_Tema8.setFocusPainted(false);
        Button_Aprender_Tema8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema8_On.png"))); // NOI18N
        Button_Aprender_Tema8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema8ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 88, 81));

        Button_Aprender_Tema9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema9_Off.png"))); // NOI18N
        Button_Aprender_Tema9.setBorderPainted(false);
        Button_Aprender_Tema9.setContentAreaFilled(false);
        Button_Aprender_Tema9.setFocusPainted(false);
        Button_Aprender_Tema9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema9_On.png"))); // NOI18N
        Button_Aprender_Tema9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema9ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 88, 81));

        Button_Aprender_Tema10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema10_Off.png"))); // NOI18N
        Button_Aprender_Tema10.setBorderPainted(false);
        Button_Aprender_Tema10.setContentAreaFilled(false);
        Button_Aprender_Tema10.setFocusPainted(false);
        Button_Aprender_Tema10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema10_On.png"))); // NOI18N
        Button_Aprender_Tema10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema10ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 88, 81));

        Button_Aprender_Tema11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema11_Off.png"))); // NOI18N
        Button_Aprender_Tema11.setBorderPainted(false);
        Button_Aprender_Tema11.setContentAreaFilled(false);
        Button_Aprender_Tema11.setFocusPainted(false);
        Button_Aprender_Tema11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema11_On.png"))); // NOI18N
        Button_Aprender_Tema11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema11ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 390, 88, 81));

        Button_Aprender_Tema12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema12_Off.png"))); // NOI18N
        Button_Aprender_Tema12.setBorderPainted(false);
        Button_Aprender_Tema12.setContentAreaFilled(false);
        Button_Aprender_Tema12.setFocusPainted(false);
        Button_Aprender_Tema12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema12_On.png"))); // NOI18N
        Button_Aprender_Tema12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema12ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, 88, 81));

        Button_Aprender_Tema13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema13_Off.png"))); // NOI18N
        Button_Aprender_Tema13.setBorderPainted(false);
        Button_Aprender_Tema13.setContentAreaFilled(false);
        Button_Aprender_Tema13.setFocusPainted(false);
        Button_Aprender_Tema13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema13_On.png"))); // NOI18N
        Button_Aprender_Tema13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema13ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 570, 88, 81));

        Button_Aprender_Tema14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema14_Off.png"))); // NOI18N
        Button_Aprender_Tema14.setBorderPainted(false);
        Button_Aprender_Tema14.setContentAreaFilled(false);
        Button_Aprender_Tema14.setFocusPainted(false);
        Button_Aprender_Tema14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Tema14_On.png"))); // NOI18N
        Button_Aprender_Tema14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema14ActionPerformed(evt);
            }
        });
        Panel_Aprender.add(Button_Aprender_Tema14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 88, 81));

        Lbl_Aprender_Mapa.setBackground(new java.awt.Color(255, 255, 0));
        Lbl_Aprender_Mapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Aprender_Mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apolo_Aprender_Mapa.png"))); // NOI18N
        Lbl_Aprender_Mapa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Aprender_Mapa.setMaximumSize(new java.awt.Dimension(1176, 705));
        Lbl_Aprender_Mapa.setMinimumSize(new java.awt.Dimension(1176, 705));
        Lbl_Aprender_Mapa.setOpaque(true);
        Lbl_Aprender_Mapa.setPreferredSize(new java.awt.Dimension(1176, 705));
        Panel_Aprender.add(Lbl_Aprender_Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));

        getContentPane().add(Panel_Aprender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1176, 705));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_AjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AjustesActionPerformed
        if (Button_Ajustes.isSelected()) {
            JOptionPane.showMessageDialog(null, "Seleccionado");
        } else {
            JOptionPane.showMessageDialog(null, "Deseleccionado");
        }
    }//GEN-LAST:event_Button_AjustesActionPerformed

    private void Button_CodeStormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CodeStormActionPerformed
        if (Button_CodeStorm.isSelected()) {
            JOptionPane.showMessageDialog(null, "Seleccionado");
        } else {
            JOptionPane.showMessageDialog(null, "Deseleccionado");
        }
    }//GEN-LAST:event_Button_CodeStormActionPerformed

    private void Button_AprenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AprenderActionPerformed
        if (Button_Aprender.isSelected()) {
            habilitarBotones();
            Panel_Home.setVisible(false);
            Panel_Aprender.setVisible(true);
        } else {
            Panel_Home.setVisible(true);
            Panel_Aprender.setVisible(false);
        }
    }//GEN-LAST:event_Button_AprenderActionPerformed
    private void habilitarBotones() {
        Button_Aprender_Tema1.setVisible(true);
        Button_Aprender_Tema2.setVisible(true);
        Button_Aprender_Tema3.setVisible(true);
        Button_Aprender_Tema4.setVisible(true);
        Button_Aprender_Tema5.setVisible(true);
        Button_Aprender_Tema6.setVisible(true);
        Button_Aprender_Tema7.setVisible(true);
        Button_Aprender_Tema8.setVisible(true);
        Button_Aprender_Tema9.setVisible(true);
        Button_Aprender_Tema10.setVisible(true);
        Button_Aprender_Tema11.setVisible(true);
        Button_Aprender_Tema12.setVisible(true);
        Button_Aprender_Tema13.setVisible(true);
        Button_Aprender_Tema14.setVisible(true);
    }
    private void Button_ProgramarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ProgramarActionPerformed
        if (Button_Programar.isSelected()) {
            Toolkit t = Toolkit.getDefaultToolkit();
            Dimension screenSize = t.getScreenSize();
            JOptionPane.showMessageDialog(null, screenSize.width + " " + screenSize.height);

        } else {
            JOptionPane.showMessageDialog(null, "Deseleccionado");
        }
    }//GEN-LAST:event_Button_ProgramarActionPerformed

    private void Button_HistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_HistoriaActionPerformed
        if (Button_Historia.isSelected()) {
            JOptionPane.showMessageDialog(null, "Seleccionado");
        } else {
            JOptionPane.showMessageDialog(null, "Deseleccionado");
        }
    }//GEN-LAST:event_Button_HistoriaActionPerformed

    private void Button_Aprender_Tema1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema1ActionPerformed
        if (evt.getSource() == Button_Aprender_Tema1) {
            JOptionPane.showMessageDialog(null, "Tema 1");
        }
    }//GEN-LAST:event_Button_Aprender_Tema1ActionPerformed

    private void Button_Aprender_Tema2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema2ActionPerformed

    private void Button_Aprender_Tema3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema3ActionPerformed

    private void Button_Aprender_Tema4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema4ActionPerformed

    private void Button_Aprender_Tema5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema5ActionPerformed

    private void Button_Aprender_Tema6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema6ActionPerformed

    private void Button_Aprender_Tema7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema7ActionPerformed

    private void Button_Aprender_Tema8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema8ActionPerformed

    private void Button_Aprender_Tema9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema9ActionPerformed

    private void Button_Aprender_Tema10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema10ActionPerformed

    private void Button_Aprender_Tema11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema11ActionPerformed

    private void Button_Aprender_Tema12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema12ActionPerformed

    private void Button_Aprender_Tema13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema13ActionPerformed

    private void Button_Aprender_Tema14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Aprender_Tema14ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Apolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Home_Apolo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Button_Ajustes;
    private javax.swing.JToggleButton Button_Aprender;
    private javax.swing.JButton Button_Aprender_Tema1;
    private javax.swing.JButton Button_Aprender_Tema10;
    private javax.swing.JButton Button_Aprender_Tema11;
    private javax.swing.JButton Button_Aprender_Tema12;
    private javax.swing.JButton Button_Aprender_Tema13;
    private javax.swing.JButton Button_Aprender_Tema14;
    private javax.swing.JButton Button_Aprender_Tema2;
    private javax.swing.JButton Button_Aprender_Tema3;
    private javax.swing.JButton Button_Aprender_Tema4;
    private javax.swing.JButton Button_Aprender_Tema5;
    private javax.swing.JButton Button_Aprender_Tema6;
    private javax.swing.JButton Button_Aprender_Tema7;
    private javax.swing.JButton Button_Aprender_Tema8;
    private javax.swing.JButton Button_Aprender_Tema9;
    private javax.swing.JToggleButton Button_CodeStorm;
    private javax.swing.JToggleButton Button_Historia;
    private javax.swing.JToggleButton Button_Programar;
    private javax.swing.JLabel Lbl_Aprender_Mapa;
    private javax.swing.JLabel Lbl_HomeButttons;
    private javax.swing.JLabel Lbl_Home_Fondo;
    private javax.swing.JPanel Panel_Aprender;
    private javax.swing.JPanel Panel_Bar_Buttons;
    private javax.swing.JPanel Panel_Home;
    // End of variables declaration//GEN-END:variables
}
