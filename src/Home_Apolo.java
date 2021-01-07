
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Tipografias.Fuentes;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

public class Home_Apolo extends javax.swing.JFrame {

    static public VentanaAjustes Ajustes = new VentanaAjustes();
    CustomScrollBarUI Barra = new CustomScrollBarUI(); // Barra de Desplazamiento Personalizada
    Color verde = new Color(0, 37, 26); // Color principal de la Seccion de Aprender
    Fuentes Euclid = new Fuentes();

    // Constructor
    public Home_Apolo() {
        initComponents();
        componentes();
        configurarVentana();
        ocultarComponentes();
        confirmarCierre();
    }

    // Cargar fuente personalizada del paquete Tipografia
    private void componentes() {
        Scp_Ejercicio1.getVerticalScrollBar().setUI(Barra);

        // Crear Tipo de Fuente
        Font Regular14p = Euclid.fuente(Euclid.EUCR, 0, 14);
        Font Bold30p = Euclid.fuente(Euclid.EUCB, 0, 30);

        Label_Programar.setFont(Regular14p); // Poner estilo de fuente
        Label_Programar.setForeground(Color.BLACK); // Poner color de fuente
        Label_HelloWorld.setFont(Bold30p);
        Label_HelloWorld.setForeground(verde);
        Label_Cuestionario1.setFont(Bold30p);
        Label_Cuestionario1.setForeground(verde);
        Label_Comentarios.setFont(Bold30p);
        Label_Comentarios.setForeground(verde);
        Label_Cuestionario2.setFont(Bold30p);
        Label_Cuestionario2.setForeground(verde);
        Label_TiposdeDatos.setFont(Bold30p);
        Label_TiposdeDatos.setForeground(verde);
        Label_Cuestionario3.setFont(Bold30p);
        Label_Cuestionario3.setForeground(verde);
        Label_OperadoresAritmeticos.setFont(Bold30p);
        Label_OperadoresAritmeticos.setForeground(verde);
        Label_Cuestionario4.setFont(Bold30p);
        Label_Cuestionario4.setForeground(verde);
        Label_LecturaeImpresion.setFont(Bold30p);
        Label_LecturaeImpresion.setForeground(verde);
    }

    // Configurar las caracteristicas de la Ventana Principal
    private void configurarVentana() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar a pantalla completa
        this.getContentPane().setBackground(Color.red); // Color de Fondo del JFrame
        setIconImage(new ImageIcon(getClass().getResource("/Resources/Apolo_Icono_Blanco_40px.png")).getImage()); // Agregar icono de Apolo
    }

    // Confirmar el cierre de la Aplicacion
    private void confirmarCierre() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    int valor = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea cerrar la aplicación?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (valor == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }
                }
            });
        } catch (Exception e) {
        }
    }

    private void apagarSecciones(int boton) {
        switch (boton) {
            case 1:
                Button_Programar.setSelected(false);
                Button_CodeStorm.setSelected(false);
                Button_Historia.setSelected(false);
                for (Component cmp : Pnl_Principal.getComponents()) {
                    cmp.setVisible(false);
                }
                break;
            case 2:
                Button_Aprender.setSelected(false);
                Button_CodeStorm.setSelected(false);
                Button_Historia.setSelected(false);
                for (Component cmp : Pnl_Principal.getComponents()) {
                    cmp.setVisible(false);
                }
                break;
            case 3:
                Button_Aprender.setSelected(false);
                Button_Programar.setSelected(false);
                Button_Historia.setSelected(false);
                break;
            case 4:
                Button_Aprender.setSelected(false);
                Button_Programar.setSelected(false);
                Button_CodeStorm.setSelected(false);
                break;
            default:
                break;
        }
    }

    private void DeshabilitarBotonesCodeStorm(int opcion) {
        switch (opcion) {
            case 0:
                Btn_Codigo.setSelected(false);
                Btn_Enviar.setSelected(false);
                Btn_Solucion.setSelected(false);
                break;
            case 1:
                Btn_Ejercicio.setSelected(false);
                Btn_Enviar.setSelected(false);
                Btn_Solucion.setSelected(false);
                break;
            case 2:
                Btn_Ejercicio.setSelected(false);
                Btn_Codigo.setSelected(false);
                Btn_Solucion.setSelected(false);
                break;
            case 3:
                Btn_Ejercicio.setSelected(false);
                Btn_Codigo.setSelected(false);
                Btn_Enviar.setSelected(false);
                break;
            default:
                break;
        }
    }

    private void habilitarBotonesAprender() {
        for (Component component : Pnl_Aprender.getComponents()) {
            component.setVisible(true);
        }
    }

    private void habilitarBotonesCodeStorm() {
        for (Component component : Pnl_CodeStorm.getComponents()) {
            if (component instanceof JButton || component instanceof JToggleButton) {
                component.setVisible(true);
            }
        }
    }

    private void ocultarComponentes() {
        for (Component component : Pnl_Aprender.getComponents()) {
            component.setVisible(false);
        }
        for (Component component : Pnl_CodeStorm.getComponents()) {
            component.setVisible(false);
        }
    }

    private int validarPanel() {
        if (Pnl_Ejercicio1.isVisible()) {
            return 1;
        } else {
            return 2;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Bar_Buttons = new javax.swing.JPanel();
        Button_Aprender = new javax.swing.JToggleButton();
        Button_CodeStorm = new javax.swing.JToggleButton();
        Button_Programar = new javax.swing.JToggleButton();
        Button_Ajustes = new javax.swing.JToggleButton();
        Button_Historia = new javax.swing.JToggleButton();
        Lbl_HomeButttons = new javax.swing.JLabel();
        Pnl_Principal = new javax.swing.JPanel();
        Pnl_Home = new javax.swing.JPanel();
        Lbl_Home_Fondo = new javax.swing.JLabel();
        Pnl_Aprender = new javax.swing.JPanel();
        Panel_Mapa = new javax.swing.JPanel();
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
        Button_Aprender_Ejercicio1 = new javax.swing.JButton();
        Button_Aprender_Ejercicio2 = new javax.swing.JButton();
        Button_Aprender_EjercicioFinal = new javax.swing.JButton();
        Lbl_Aprender_Mapa = new javax.swing.JLabel();
        ScrollPane_Tema1 = new javax.swing.JScrollPane();
        Panel_Tema1 = new javax.swing.JPanel();
        Button_Siguiente_Cuestionario1 = new javax.swing.JButton();
        Lbl_Header_Aprender = new javax.swing.JLabel();
        Label_HelloWorld = new javax.swing.JLabel();
        ScrollPane_Cuestionario1 = new javax.swing.JScrollPane();
        Panel_Cuestionario1 = new javax.swing.JPanel();
        Button_Anterior_HelloWord = new javax.swing.JButton();
        Button_Siguiente_Comentarios = new javax.swing.JButton();
        Lbl_Header_Aprender1 = new javax.swing.JLabel();
        Label_Cuestionario1 = new javax.swing.JLabel();
        ScrollPane_Tema2 = new javax.swing.JScrollPane();
        Panel_Tema2 = new javax.swing.JPanel();
        Button_Anterior_Cuestionario1 = new javax.swing.JButton();
        Button_Siguiente_Cuestionario2 = new javax.swing.JButton();
        Lbl_Header_Aprender2 = new javax.swing.JLabel();
        Label_Comentarios = new javax.swing.JLabel();
        ScrollPane_Cuestionario2 = new javax.swing.JScrollPane();
        Panel_Cuestionario2 = new javax.swing.JPanel();
        Button_Anterior_Comentarios = new javax.swing.JButton();
        Button_Siguiente_TiposdeDatos = new javax.swing.JButton();
        Lbl_Header_Aprender3 = new javax.swing.JLabel();
        Label_Cuestionario2 = new javax.swing.JLabel();
        ScrollPane_Tema3 = new javax.swing.JScrollPane();
        Panel_Tema3 = new javax.swing.JPanel();
        Button_Anterior_Cuestionario2 = new javax.swing.JButton();
        Button_Siguiente_Cuestionario3 = new javax.swing.JButton();
        Lbl_Header_Aprender4 = new javax.swing.JLabel();
        Label_TiposdeDatos = new javax.swing.JLabel();
        ScrollPane_Cuestionario3 = new javax.swing.JScrollPane();
        Panel_Cuestionario3 = new javax.swing.JPanel();
        Button_Anterior_TiposdeDatos = new javax.swing.JButton();
        Button_Siguiente_OperadoresAritmeticos = new javax.swing.JButton();
        Lbl_Header_Aprender5 = new javax.swing.JLabel();
        Label_Cuestionario3 = new javax.swing.JLabel();
        ScrollPane_Tema4 = new javax.swing.JScrollPane();
        Panel_Tema4 = new javax.swing.JPanel();
        Button_Anterior_Cuestionario3 = new javax.swing.JButton();
        Button_Siguiente_Cuestionario4 = new javax.swing.JButton();
        Lbl_Header_Aprender6 = new javax.swing.JLabel();
        Label_OperadoresAritmeticos = new javax.swing.JLabel();
        ScrollPane_Cuestionario4 = new javax.swing.JScrollPane();
        Panel_Cuestionario4 = new javax.swing.JPanel();
        Button_Anterior_OperadoresAritmeticos = new javax.swing.JButton();
        Button_Siguiente_LecturaeImpresion = new javax.swing.JButton();
        Lbl_Header_Aprender7 = new javax.swing.JLabel();
        Label_Cuestionario4 = new javax.swing.JLabel();
        ScrollPane_Tema5 = new javax.swing.JScrollPane();
        Panel_Tema5 = new javax.swing.JPanel();
        Button_Anterior_Cuestionario4 = new javax.swing.JButton();
        Button_Siguiente_Cuestionario5 = new javax.swing.JButton();
        Lbl_Header_Aprender8 = new javax.swing.JLabel();
        Label_LecturaeImpresion = new javax.swing.JLabel();
        Pnl_Programar = new javax.swing.JPanel();
        Label_Programar = new javax.swing.JLabel();
        Lbl_Header_Aprender9 = new javax.swing.JLabel();
        Pnl_CodeStorm = new javax.swing.JPanel();
        Pnl_ListadoEjercicios = new javax.swing.JPanel();
        Lbl_Header_CodeStorm = new javax.swing.JLabel();
        Button_Introduccion = new javax.swing.JButton();
        Button_Nivel1_Ejercicio1 = new javax.swing.JButton();
        Button_Nivel1_Ejercicio2 = new javax.swing.JButton();
        Button_Nivel1_Ejercicio3 = new javax.swing.JButton();
        Button_Nivel1_Ejercicio4 = new javax.swing.JButton();
        Button_Nivel2_Ejercicio1 = new javax.swing.JButton();
        Button_Nivel2_Ejercicio2 = new javax.swing.JButton();
        Button_Nivel2_Ejercicio3 = new javax.swing.JButton();
        Button_Nivel2_Ejercicio4 = new javax.swing.JButton();
        Button_Nivel3_Ejercicio1 = new javax.swing.JButton();
        Button_Nivel3_Ejercicio2 = new javax.swing.JButton();
        Button_Nivel3_Ejercicio3 = new javax.swing.JButton();
        Button_Nivel3_Ejercicio4 = new javax.swing.JButton();
        Button_Nivel4_Ejercicio1 = new javax.swing.JButton();
        Button_Nivel4_Ejercicio2 = new javax.swing.JButton();
        Button_Nivel4_Ejercicio3 = new javax.swing.JButton();
        Button_Nivel4_Ejercicio4 = new javax.swing.JButton();
        Button_Nivel5_Ejercicio1 = new javax.swing.JButton();
        Button_Nivel5_Ejercicio2 = new javax.swing.JButton();
        Button_Nivel5_Ejercicio3 = new javax.swing.JButton();
        Button_Nivel5_Ejercicio4 = new javax.swing.JButton();
        Lbl_Nivel1 = new javax.swing.JLabel();
        Lbl_Nivel2 = new javax.swing.JLabel();
        Lbl_Nivel3 = new javax.swing.JLabel();
        Lbl_Nivel4 = new javax.swing.JLabel();
        Lbl_Nivel5 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel1_0 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel1_1 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel1_2 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel1_3 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel1_4 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel2_0 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel2_1 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel2_2 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel2_3 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel2_4 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel3_0 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel3_1 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel3_2 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel3_3 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel3_4 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel4_0 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel4_1 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel4_2 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel4_3 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel4_4 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel5_0 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel5_1 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel5_2 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel5_3 = new javax.swing.JLabel();
        Lbl_BarraProgreso_Nivel5_4 = new javax.swing.JLabel();
        Lbl_CodeStorm_Fondo = new javax.swing.JLabel();
        Scp_Introduccion = new javax.swing.JScrollPane();
        Panel_Introduccion = new javax.swing.JPanel();
        Lbl_Header_CodeStorm1 = new javax.swing.JLabel();
        Pnl_Ejercicios = new javax.swing.JPanel();
        Pnl_Buttons = new javax.swing.JPanel();
        Btn_Ejercicio = new javax.swing.JToggleButton();
        Btn_Codigo = new javax.swing.JToggleButton();
        Btn_Enviar = new javax.swing.JToggleButton();
        Btn_Solucion = new javax.swing.JToggleButton();
        Lbl_Header_CodeStorm2 = new javax.swing.JLabel();
        Pnl_Ejercicio1 = new javax.swing.JPanel();
        Scp_Ejercicio1 = new javax.swing.JScrollPane();
        Lbl_Ejercicio = new javax.swing.JLabel();
        Pnl_Codigo1 = new javax.swing.JPanel();
        Scp_Codigo1 = new javax.swing.JScrollPane();
        Txa_Codigo1 = new javax.swing.JTextArea();
        Pnl_Ejercicio2 = new javax.swing.JPanel();
        Pnl_Ejercicio3 = new javax.swing.JPanel();
        Pnl_Ejercicio4 = new javax.swing.JPanel();
        Pnl_Ejercicio5 = new javax.swing.JPanel();
        Pnl_Ejercicio6 = new javax.swing.JPanel();
        Pnl_Ejercicio7 = new javax.swing.JPanel();
        Pnl_Ejercicio8 = new javax.swing.JPanel();
        Pnl_Ejercicio9 = new javax.swing.JPanel();
        Pnl_Ejercicio10 = new javax.swing.JPanel();
        Pnl_Ejercicio11 = new javax.swing.JPanel();
        Pnl_Ejercicio12 = new javax.swing.JPanel();
        Pnl_Historia = new javax.swing.JPanel();
        Lbl_Header_Aprender11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1366, 705));
        setSize(new java.awt.Dimension(1366, 705));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Bar_Buttons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Aprender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Button_Off.png"))); // NOI18N
        Button_Aprender.setBorderPainted(false);
        Button_Aprender.setContentAreaFilled(false);
        Button_Aprender.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Button_On.png"))); // NOI18N
        Button_Aprender.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Button_On.png"))); // NOI18N
        Button_Aprender.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Button_Enabled.png"))); // NOI18N
        Button_Aprender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AprenderActionPerformed(evt);
            }
        });
        Pnl_Bar_Buttons.add(Button_Aprender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 55));

        Button_CodeStorm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStormButton_Off.png"))); // NOI18N
        Button_CodeStorm.setBorderPainted(false);
        Button_CodeStorm.setContentAreaFilled(false);
        Button_CodeStorm.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStormButton_On.png"))); // NOI18N
        Button_CodeStorm.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStormButton_On.png"))); // NOI18N
        Button_CodeStorm.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStormButton_Enabled.png"))); // NOI18N
        Button_CodeStorm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CodeStormActionPerformed(evt);
            }
        });
        Pnl_Bar_Buttons.add(Button_CodeStorm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 170, 55));

        Button_Programar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_ProgramaButton_Off.png"))); // NOI18N
        Button_Programar.setBorderPainted(false);
        Button_Programar.setContentAreaFilled(false);
        Button_Programar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_ProgramaButton_On.png"))); // NOI18N
        Button_Programar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_ProgramaButton_On.png"))); // NOI18N
        Button_Programar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_ProgramaButton_Enabled.png"))); // NOI18N
        Button_Programar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ProgramarActionPerformed(evt);
            }
        });
        Pnl_Bar_Buttons.add(Button_Programar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 170, 55));

        Button_Ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_AjustesButton_Off.png"))); // NOI18N
        Button_Ajustes.setBorderPainted(false);
        Button_Ajustes.setContentAreaFilled(false);
        Button_Ajustes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_AjustesButton_On.png"))); // NOI18N
        Button_Ajustes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_AjustesButton_On.png"))); // NOI18N
        Button_Ajustes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_AjustesButton_Enabled.png"))); // NOI18N
        Button_Ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AjustesActionPerformed(evt);
            }
        });
        Pnl_Bar_Buttons.add(Button_Ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 170, 55));

        Button_Historia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_HistoriaButton_Off.png"))); // NOI18N
        Button_Historia.setBorderPainted(false);
        Button_Historia.setContentAreaFilled(false);
        Button_Historia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_HistoriaButton_On.png"))); // NOI18N
        Button_Historia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_HistoriaButton_On.png"))); // NOI18N
        Button_Historia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_HistoriaButton_Enabled.png"))); // NOI18N
        Button_Historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_HistoriaActionPerformed(evt);
            }
        });
        Pnl_Bar_Buttons.add(Button_Historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 170, 55));

        Lbl_HomeButttons.setBackground(new java.awt.Color(0, 255, 0));
        Lbl_HomeButttons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_FondoButtons.png"))); // NOI18N
        Lbl_HomeButttons.setOpaque(true);
        Pnl_Bar_Buttons.add(Lbl_HomeButttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 705));

        getContentPane().add(Pnl_Bar_Buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 710));

        Pnl_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Home.setMaximumSize(new java.awt.Dimension(1176, 705));
        Pnl_Home.setMinimumSize(new java.awt.Dimension(1176, 705));
        Pnl_Home.setPreferredSize(new java.awt.Dimension(1176, 705));
        Pnl_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Home_Fondo.setBackground(new java.awt.Color(0, 204, 0));
        Lbl_Home_Fondo.setForeground(new java.awt.Color(0, 204, 204));
        Lbl_Home_Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Home_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Home_Fondo.png"))); // NOI18N
        Lbl_Home_Fondo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Home_Fondo.setMaximumSize(new java.awt.Dimension(1176, 705));
        Lbl_Home_Fondo.setMinimumSize(new java.awt.Dimension(1176, 705));
        Lbl_Home_Fondo.setOpaque(true);
        Lbl_Home_Fondo.setPreferredSize(new java.awt.Dimension(1176, 705));
        Pnl_Home.add(Lbl_Home_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 705));

        Pnl_Principal.add(Pnl_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1176, -1));

        Pnl_Aprender.setMaximumSize(new java.awt.Dimension(1176, 705));
        Pnl_Aprender.setMinimumSize(new java.awt.Dimension(1176, 705));
        Pnl_Aprender.setPreferredSize(new java.awt.Dimension(1176, 705));
        Pnl_Aprender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Mapa.setMaximumSize(new java.awt.Dimension(1176, 705));
        Panel_Mapa.setMinimumSize(new java.awt.Dimension(1176, 705));
        Panel_Mapa.setPreferredSize(new java.awt.Dimension(1176, 705));
        Panel_Mapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Aprender_Tema1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema1_Off.png"))); // NOI18N
        Button_Aprender_Tema1.setBorderPainted(false);
        Button_Aprender_Tema1.setContentAreaFilled(false);
        Button_Aprender_Tema1.setFocusPainted(false);
        Button_Aprender_Tema1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema1_On.png"))); // NOI18N
        Button_Aprender_Tema1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema1ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 88, 81));
        Button_Aprender_Tema1.getAccessibleContext().setAccessibleDescription("");

        Button_Aprender_Tema2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema2_Off.png"))); // NOI18N
        Button_Aprender_Tema2.setBorderPainted(false);
        Button_Aprender_Tema2.setContentAreaFilled(false);
        Button_Aprender_Tema2.setFocusPainted(false);
        Button_Aprender_Tema2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema2_On.png"))); // NOI18N
        Button_Aprender_Tema2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema2ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 88, 81));

        Button_Aprender_Tema3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema3_Off.png"))); // NOI18N
        Button_Aprender_Tema3.setBorderPainted(false);
        Button_Aprender_Tema3.setContentAreaFilled(false);
        Button_Aprender_Tema3.setFocusPainted(false);
        Button_Aprender_Tema3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema3_On.png"))); // NOI18N
        Button_Aprender_Tema3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema3ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 88, 81));

        Button_Aprender_Tema4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema4_Off.png"))); // NOI18N
        Button_Aprender_Tema4.setBorderPainted(false);
        Button_Aprender_Tema4.setContentAreaFilled(false);
        Button_Aprender_Tema4.setFocusPainted(false);
        Button_Aprender_Tema4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema4_On.png"))); // NOI18N
        Button_Aprender_Tema4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema4ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 88, 81));

        Button_Aprender_Tema5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema5_Off.png"))); // NOI18N
        Button_Aprender_Tema5.setBorderPainted(false);
        Button_Aprender_Tema5.setContentAreaFilled(false);
        Button_Aprender_Tema5.setFocusPainted(false);
        Button_Aprender_Tema5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema5_On.png"))); // NOI18N
        Button_Aprender_Tema5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema5ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, 88, 81));

        Button_Aprender_Tema6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema6_Off.png"))); // NOI18N
        Button_Aprender_Tema6.setBorderPainted(false);
        Button_Aprender_Tema6.setContentAreaFilled(false);
        Button_Aprender_Tema6.setFocusPainted(false);
        Button_Aprender_Tema6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema6_On.png"))); // NOI18N
        Button_Aprender_Tema6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema6ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 88, 81));

        Button_Aprender_Tema7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema7_Off.png"))); // NOI18N
        Button_Aprender_Tema7.setBorderPainted(false);
        Button_Aprender_Tema7.setContentAreaFilled(false);
        Button_Aprender_Tema7.setFocusPainted(false);
        Button_Aprender_Tema7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema7_On.png"))); // NOI18N
        Button_Aprender_Tema7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema7ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 88, 81));

        Button_Aprender_Tema8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema8_Off.png"))); // NOI18N
        Button_Aprender_Tema8.setBorderPainted(false);
        Button_Aprender_Tema8.setContentAreaFilled(false);
        Button_Aprender_Tema8.setFocusPainted(false);
        Button_Aprender_Tema8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema8_On.png"))); // NOI18N
        Button_Aprender_Tema8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema8ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 88, 81));

        Button_Aprender_Tema9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema9_Off.png"))); // NOI18N
        Button_Aprender_Tema9.setBorderPainted(false);
        Button_Aprender_Tema9.setContentAreaFilled(false);
        Button_Aprender_Tema9.setFocusPainted(false);
        Button_Aprender_Tema9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema9_On.png"))); // NOI18N
        Button_Aprender_Tema9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema9ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 88, 81));

        Button_Aprender_Tema10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema10_Off.png"))); // NOI18N
        Button_Aprender_Tema10.setBorderPainted(false);
        Button_Aprender_Tema10.setContentAreaFilled(false);
        Button_Aprender_Tema10.setFocusPainted(false);
        Button_Aprender_Tema10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema10_On.png"))); // NOI18N
        Button_Aprender_Tema10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema10ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 88, 81));

        Button_Aprender_Tema11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema11_Off.png"))); // NOI18N
        Button_Aprender_Tema11.setBorderPainted(false);
        Button_Aprender_Tema11.setContentAreaFilled(false);
        Button_Aprender_Tema11.setFocusPainted(false);
        Button_Aprender_Tema11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema11_On.png"))); // NOI18N
        Button_Aprender_Tema11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema11ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 390, 88, 81));

        Button_Aprender_Tema12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema12_Off.png"))); // NOI18N
        Button_Aprender_Tema12.setBorderPainted(false);
        Button_Aprender_Tema12.setContentAreaFilled(false);
        Button_Aprender_Tema12.setFocusPainted(false);
        Button_Aprender_Tema12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema12_On.png"))); // NOI18N
        Button_Aprender_Tema12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema12ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, 88, 81));

        Button_Aprender_Tema13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema13_Off.png"))); // NOI18N
        Button_Aprender_Tema13.setBorderPainted(false);
        Button_Aprender_Tema13.setContentAreaFilled(false);
        Button_Aprender_Tema13.setFocusPainted(false);
        Button_Aprender_Tema13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema13_On.png"))); // NOI18N
        Button_Aprender_Tema13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema13ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 570, 88, 81));

        Button_Aprender_Tema14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema14_Off.png"))); // NOI18N
        Button_Aprender_Tema14.setBorderPainted(false);
        Button_Aprender_Tema14.setContentAreaFilled(false);
        Button_Aprender_Tema14.setFocusPainted(false);
        Button_Aprender_Tema14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Tema14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Tema14_On.png"))); // NOI18N
        Button_Aprender_Tema14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Aprender_Tema14ActionPerformed(evt);
            }
        });
        Panel_Mapa.add(Button_Aprender_Tema14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 88, 81));

        Button_Aprender_Ejercicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Ejercicio1_Off.png"))); // NOI18N
        Button_Aprender_Ejercicio1.setBorder(null);
        Button_Aprender_Ejercicio1.setBorderPainted(false);
        Button_Aprender_Ejercicio1.setContentAreaFilled(false);
        Button_Aprender_Ejercicio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Aprender_Ejercicio1.setMaximumSize(new java.awt.Dimension(71, 123));
        Button_Aprender_Ejercicio1.setMinimumSize(new java.awt.Dimension(71, 123));
        Button_Aprender_Ejercicio1.setPreferredSize(new java.awt.Dimension(71, 123));
        Button_Aprender_Ejercicio1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Ejercicio1_On.png"))); // NOI18N
        Panel_Mapa.add(Button_Aprender_Ejercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 71, 123));

        Button_Aprender_Ejercicio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Ejercicio2_Off.png"))); // NOI18N
        Button_Aprender_Ejercicio2.setBorder(null);
        Button_Aprender_Ejercicio2.setBorderPainted(false);
        Button_Aprender_Ejercicio2.setContentAreaFilled(false);
        Button_Aprender_Ejercicio2.setMaximumSize(new java.awt.Dimension(90, 140));
        Button_Aprender_Ejercicio2.setMinimumSize(new java.awt.Dimension(90, 140));
        Button_Aprender_Ejercicio2.setPreferredSize(new java.awt.Dimension(90, 140));
        Button_Aprender_Ejercicio2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Ejercicio2_On.png"))); // NOI18N
        Panel_Mapa.add(Button_Aprender_Ejercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 338, 90, 140));

        Button_Aprender_EjercicioFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_EjercicioFinal_Off.png"))); // NOI18N
        Button_Aprender_EjercicioFinal.setBorder(null);
        Button_Aprender_EjercicioFinal.setBorderPainted(false);
        Button_Aprender_EjercicioFinal.setContentAreaFilled(false);
        Button_Aprender_EjercicioFinal.setMaximumSize(new java.awt.Dimension(121, 184));
        Button_Aprender_EjercicioFinal.setMinimumSize(new java.awt.Dimension(121, 184));
        Button_Aprender_EjercicioFinal.setPreferredSize(new java.awt.Dimension(121, 184));
        Button_Aprender_EjercicioFinal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_EjercicioFinal_On.png"))); // NOI18N
        Panel_Mapa.add(Button_Aprender_EjercicioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 121, 184));

        Lbl_Aprender_Mapa.setBackground(new java.awt.Color(255, 255, 0));
        Lbl_Aprender_Mapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Aprender_Mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Apolo_Aprender_Mapa.png"))); // NOI18N
        Lbl_Aprender_Mapa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Aprender_Mapa.setMaximumSize(new java.awt.Dimension(1176, 705));
        Lbl_Aprender_Mapa.setMinimumSize(new java.awt.Dimension(1176, 705));
        Lbl_Aprender_Mapa.setOpaque(true);
        Lbl_Aprender_Mapa.setPreferredSize(new java.awt.Dimension(1176, 705));
        Panel_Mapa.add(Lbl_Aprender_Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));

        Pnl_Aprender.add(Panel_Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 705));

        ScrollPane_Tema1.setBorder(null);
        ScrollPane_Tema1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Tema1.setMaximumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Tema1.setMinimumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Tema1.setPreferredSize(new java.awt.Dimension(1176, 706));

        Panel_Tema1.setBackground(new java.awt.Color(237, 234, 243));
        Panel_Tema1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Tema1.setMaximumSize(new java.awt.Dimension(1155, 1000));
        Panel_Tema1.setMinimumSize(new java.awt.Dimension(1155, 1000));
        Panel_Tema1.setPreferredSize(new java.awt.Dimension(1155, 1000));
        Panel_Tema1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Siguiente_Cuestionario1.setBackground(null);
        Button_Siguiente_Cuestionario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Cuestionario1_Off.png"))); // NOI18N
        Button_Siguiente_Cuestionario1.setBorder(null);
        Button_Siguiente_Cuestionario1.setBorderPainted(false);
        Button_Siguiente_Cuestionario1.setContentAreaFilled(false);
        Button_Siguiente_Cuestionario1.setFocusPainted(false);
        Button_Siguiente_Cuestionario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Siguiente_Cuestionario1.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario1.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario1.setOpaque(true);
        Button_Siguiente_Cuestionario1.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Cuestionario1_On.png"))); // NOI18N
        Button_Siguiente_Cuestionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Siguiente_Cuestionario1ActionPerformed(evt);
            }
        });
        Panel_Tema1.add(Button_Siguiente_Cuestionario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 910, 254, 64));

        Lbl_Header_Aprender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_Aprender.png"))); // NOI18N
        Panel_Tema1.add(Lbl_Header_Aprender, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Label_HelloWorld.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Label_HelloWorld.setText("Hello World");
        Panel_Tema1.add(Label_HelloWorld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 30));

        ScrollPane_Tema1.setViewportView(Panel_Tema1);

        Pnl_Aprender.add(ScrollPane_Tema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));
        ScrollPane_Tema1.getAccessibleContext().setAccessibleDescription("");

        ScrollPane_Cuestionario1.setBorder(null);
        ScrollPane_Cuestionario1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Cuestionario1.setMaximumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Cuestionario1.setMinimumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Cuestionario1.setPreferredSize(new java.awt.Dimension(1176, 706));

        Panel_Cuestionario1.setBackground(new java.awt.Color(237, 234, 243));
        Panel_Cuestionario1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Cuestionario1.setMaximumSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario1.setMinimumSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario1.setPreferredSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Anterior_HelloWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_HelloWorld_Off.png"))); // NOI18N
        Button_Anterior_HelloWord.setBorder(null);
        Button_Anterior_HelloWord.setBorderPainted(false);
        Button_Anterior_HelloWord.setContentAreaFilled(false);
        Button_Anterior_HelloWord.setFocusPainted(false);
        Button_Anterior_HelloWord.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Anterior_HelloWord.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_HelloWord.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_HelloWord.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Anterior_HelloWord.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_HelloWorld_On.png"))); // NOI18N
        Button_Anterior_HelloWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Anterior_HelloWordActionPerformed(evt);
            }
        });
        Panel_Cuestionario1.add(Button_Anterior_HelloWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1410, 254, 64));

        Button_Siguiente_Comentarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Comentarios_Off.png"))); // NOI18N
        Button_Siguiente_Comentarios.setBorder(null);
        Button_Siguiente_Comentarios.setBorderPainted(false);
        Button_Siguiente_Comentarios.setContentAreaFilled(false);
        Button_Siguiente_Comentarios.setFocusPainted(false);
        Button_Siguiente_Comentarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Siguiente_Comentarios.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Comentarios.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Comentarios.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Comentarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Comentarios_On.png"))); // NOI18N
        Button_Siguiente_Comentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Siguiente_ComentariosActionPerformed(evt);
            }
        });
        Panel_Cuestionario1.add(Button_Siguiente_Comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1410, 254, 64));

        Lbl_Header_Aprender1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_Aprender.png"))); // NOI18N
        Panel_Cuestionario1.add(Lbl_Header_Aprender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Label_Cuestionario1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Label_Cuestionario1.setText("Hello World | Cuestionario");
        Panel_Cuestionario1.add(Label_Cuestionario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 420, 30));

        ScrollPane_Cuestionario1.setViewportView(Panel_Cuestionario1);

        Pnl_Aprender.add(ScrollPane_Cuestionario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));

        ScrollPane_Tema2.setBorder(null);
        ScrollPane_Tema2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Tema2.setMaximumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Tema2.setMinimumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Tema2.setPreferredSize(new java.awt.Dimension(1176, 706));

        Panel_Tema2.setBackground(new java.awt.Color(237, 234, 243));
        Panel_Tema2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Tema2.setMaximumSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema2.setMinimumSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema2.setPreferredSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Anterior_Cuestionario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_Cuestionario1_Off.png"))); // NOI18N
        Button_Anterior_Cuestionario1.setBorder(null);
        Button_Anterior_Cuestionario1.setBorderPainted(false);
        Button_Anterior_Cuestionario1.setContentAreaFilled(false);
        Button_Anterior_Cuestionario1.setFocusPainted(false);
        Button_Anterior_Cuestionario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Anterior_Cuestionario1.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario1.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario1.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_Cuestionario1_On.png"))); // NOI18N
        Button_Anterior_Cuestionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Anterior_Cuestionario1ActionPerformed(evt);
            }
        });
        Panel_Tema2.add(Button_Anterior_Cuestionario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1410, 254, 64));

        Button_Siguiente_Cuestionario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Cuestionario2_Off.png"))); // NOI18N
        Button_Siguiente_Cuestionario2.setBorder(null);
        Button_Siguiente_Cuestionario2.setBorderPainted(false);
        Button_Siguiente_Cuestionario2.setContentAreaFilled(false);
        Button_Siguiente_Cuestionario2.setFocusPainted(false);
        Button_Siguiente_Cuestionario2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Siguiente_Cuestionario2.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario2.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario2.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Cuestionario2_On.png"))); // NOI18N
        Button_Siguiente_Cuestionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Siguiente_Cuestionario2ActionPerformed(evt);
            }
        });
        Panel_Tema2.add(Button_Siguiente_Cuestionario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1410, 254, 64));

        Lbl_Header_Aprender2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_Aprender.png"))); // NOI18N
        Panel_Tema2.add(Lbl_Header_Aprender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Label_Comentarios.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Label_Comentarios.setText("Comentarios");
        Panel_Tema2.add(Label_Comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 30));

        ScrollPane_Tema2.setViewportView(Panel_Tema2);

        Pnl_Aprender.add(ScrollPane_Tema2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));

        ScrollPane_Cuestionario2.setBorder(null);
        ScrollPane_Cuestionario2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Cuestionario2.setMaximumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Cuestionario2.setMinimumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Cuestionario2.setPreferredSize(new java.awt.Dimension(1176, 706));

        Panel_Cuestionario2.setBackground(new java.awt.Color(237, 234, 243));
        Panel_Cuestionario2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Cuestionario2.setMaximumSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario2.setMinimumSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario2.setPreferredSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Anterior_Comentarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_Comentarios_Off.png"))); // NOI18N
        Button_Anterior_Comentarios.setBorder(null);
        Button_Anterior_Comentarios.setBorderPainted(false);
        Button_Anterior_Comentarios.setContentAreaFilled(false);
        Button_Anterior_Comentarios.setFocusPainted(false);
        Button_Anterior_Comentarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Anterior_Comentarios.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Comentarios.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Comentarios.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Comentarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_Comentarios_On.png"))); // NOI18N
        Button_Anterior_Comentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Anterior_ComentariosActionPerformed(evt);
            }
        });
        Panel_Cuestionario2.add(Button_Anterior_Comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1410, 254, 64));

        Button_Siguiente_TiposdeDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_TiposdeDatos_Off.png"))); // NOI18N
        Button_Siguiente_TiposdeDatos.setBorder(null);
        Button_Siguiente_TiposdeDatos.setBorderPainted(false);
        Button_Siguiente_TiposdeDatos.setContentAreaFilled(false);
        Button_Siguiente_TiposdeDatos.setFocusPainted(false);
        Button_Siguiente_TiposdeDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Siguiente_TiposdeDatos.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_TiposdeDatos.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_TiposdeDatos.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_TiposdeDatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_TiposdeDatos_On.png"))); // NOI18N
        Button_Siguiente_TiposdeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Siguiente_TiposdeDatosActionPerformed(evt);
            }
        });
        Panel_Cuestionario2.add(Button_Siguiente_TiposdeDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1410, 254, 64));

        Lbl_Header_Aprender3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_Aprender.png"))); // NOI18N
        Panel_Cuestionario2.add(Lbl_Header_Aprender3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Label_Cuestionario2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Label_Cuestionario2.setText("Comentarios | Cuestionario");
        Panel_Cuestionario2.add(Label_Cuestionario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 440, 30));

        ScrollPane_Cuestionario2.setViewportView(Panel_Cuestionario2);

        Pnl_Aprender.add(ScrollPane_Cuestionario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));

        ScrollPane_Tema3.setBorder(null);
        ScrollPane_Tema3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Tema3.setMaximumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Tema3.setMinimumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Tema3.setPreferredSize(new java.awt.Dimension(1176, 706));

        Panel_Tema3.setBackground(new java.awt.Color(237, 234, 243));
        Panel_Tema3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Tema3.setMaximumSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema3.setMinimumSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema3.setPreferredSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Anterior_Cuestionario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_Cuestionario2_Off.png"))); // NOI18N
        Button_Anterior_Cuestionario2.setBorder(null);
        Button_Anterior_Cuestionario2.setBorderPainted(false);
        Button_Anterior_Cuestionario2.setContentAreaFilled(false);
        Button_Anterior_Cuestionario2.setFocusPainted(false);
        Button_Anterior_Cuestionario2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Anterior_Cuestionario2.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario2.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario2.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_Cuestionario2_On.png"))); // NOI18N
        Button_Anterior_Cuestionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Anterior_Cuestionario2ActionPerformed(evt);
            }
        });
        Panel_Tema3.add(Button_Anterior_Cuestionario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1410, 254, 64));

        Button_Siguiente_Cuestionario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Cuestionario3_Off.png"))); // NOI18N
        Button_Siguiente_Cuestionario3.setBorder(null);
        Button_Siguiente_Cuestionario3.setBorderPainted(false);
        Button_Siguiente_Cuestionario3.setContentAreaFilled(false);
        Button_Siguiente_Cuestionario3.setFocusPainted(false);
        Button_Siguiente_Cuestionario3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Siguiente_Cuestionario3.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario3.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario3.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Cuestionario3_On.png"))); // NOI18N
        Button_Siguiente_Cuestionario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Siguiente_Cuestionario3ActionPerformed(evt);
            }
        });
        Panel_Tema3.add(Button_Siguiente_Cuestionario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1410, 254, 64));

        Lbl_Header_Aprender4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_Aprender.png"))); // NOI18N
        Panel_Tema3.add(Lbl_Header_Aprender4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Label_TiposdeDatos.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Label_TiposdeDatos.setText("Tipos de Datos");
        Panel_Tema3.add(Label_TiposdeDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 230, 30));

        ScrollPane_Tema3.setViewportView(Panel_Tema3);

        Pnl_Aprender.add(ScrollPane_Tema3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));

        ScrollPane_Cuestionario3.setBorder(null);
        ScrollPane_Cuestionario3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Cuestionario3.setMaximumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Cuestionario3.setMinimumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Cuestionario3.setPreferredSize(new java.awt.Dimension(1176, 706));

        Panel_Cuestionario3.setBackground(new java.awt.Color(237, 234, 243));
        Panel_Cuestionario3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Cuestionario3.setMaximumSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario3.setMinimumSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario3.setPreferredSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Anterior_TiposdeDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_TiposdeDatos_Off.png"))); // NOI18N
        Button_Anterior_TiposdeDatos.setBorder(null);
        Button_Anterior_TiposdeDatos.setBorderPainted(false);
        Button_Anterior_TiposdeDatos.setContentAreaFilled(false);
        Button_Anterior_TiposdeDatos.setFocusPainted(false);
        Button_Anterior_TiposdeDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Anterior_TiposdeDatos.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_TiposdeDatos.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_TiposdeDatos.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Anterior_TiposdeDatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_TiposdeDatos_On.png"))); // NOI18N
        Button_Anterior_TiposdeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Anterior_TiposdeDatosActionPerformed(evt);
            }
        });
        Panel_Cuestionario3.add(Button_Anterior_TiposdeDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1410, 254, 64));

        Button_Siguiente_OperadoresAritmeticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_OperadoresAritmeticos_Off.png"))); // NOI18N
        Button_Siguiente_OperadoresAritmeticos.setBorder(null);
        Button_Siguiente_OperadoresAritmeticos.setBorderPainted(false);
        Button_Siguiente_OperadoresAritmeticos.setContentAreaFilled(false);
        Button_Siguiente_OperadoresAritmeticos.setFocusPainted(false);
        Button_Siguiente_OperadoresAritmeticos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Siguiente_OperadoresAritmeticos.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_OperadoresAritmeticos.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_OperadoresAritmeticos.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_OperadoresAritmeticos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_OperadoresAritmeticos_On.png"))); // NOI18N
        Button_Siguiente_OperadoresAritmeticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Siguiente_OperadoresAritmeticosActionPerformed(evt);
            }
        });
        Panel_Cuestionario3.add(Button_Siguiente_OperadoresAritmeticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1410, 254, 64));

        Lbl_Header_Aprender5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_Aprender.png"))); // NOI18N
        Panel_Cuestionario3.add(Lbl_Header_Aprender5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Label_Cuestionario3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Label_Cuestionario3.setText("Tipos de Datos | Cuestionario");
        Panel_Cuestionario3.add(Label_Cuestionario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 430, 30));

        ScrollPane_Cuestionario3.setViewportView(Panel_Cuestionario3);

        Pnl_Aprender.add(ScrollPane_Cuestionario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));

        ScrollPane_Tema4.setBorder(null);
        ScrollPane_Tema4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Tema4.setMaximumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Tema4.setMinimumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Tema4.setPreferredSize(new java.awt.Dimension(1176, 706));

        Panel_Tema4.setBackground(new java.awt.Color(237, 234, 243));
        Panel_Tema4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Tema4.setMaximumSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema4.setMinimumSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema4.setPreferredSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Anterior_Cuestionario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_Cuestionario3_Off.png"))); // NOI18N
        Button_Anterior_Cuestionario3.setBorder(null);
        Button_Anterior_Cuestionario3.setBorderPainted(false);
        Button_Anterior_Cuestionario3.setContentAreaFilled(false);
        Button_Anterior_Cuestionario3.setFocusPainted(false);
        Button_Anterior_Cuestionario3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Anterior_Cuestionario3.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario3.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario3.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_Cuestionario3_On.png"))); // NOI18N
        Button_Anterior_Cuestionario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Anterior_Cuestionario3ActionPerformed(evt);
            }
        });
        Panel_Tema4.add(Button_Anterior_Cuestionario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1410, 254, 64));

        Button_Siguiente_Cuestionario4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Cuestionario4_Off.png"))); // NOI18N
        Button_Siguiente_Cuestionario4.setBorder(null);
        Button_Siguiente_Cuestionario4.setBorderPainted(false);
        Button_Siguiente_Cuestionario4.setContentAreaFilled(false);
        Button_Siguiente_Cuestionario4.setFocusPainted(false);
        Button_Siguiente_Cuestionario4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Siguiente_Cuestionario4.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario4.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario4.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Cuestionario4_On.png"))); // NOI18N
        Button_Siguiente_Cuestionario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Siguiente_Cuestionario4ActionPerformed(evt);
            }
        });
        Panel_Tema4.add(Button_Siguiente_Cuestionario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1410, 254, 64));

        Lbl_Header_Aprender6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_Aprender.png"))); // NOI18N
        Panel_Tema4.add(Lbl_Header_Aprender6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Label_OperadoresAritmeticos.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Label_OperadoresAritmeticos.setText("Operadores Aritméticos");
        Panel_Tema4.add(Label_OperadoresAritmeticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 350, 30));

        ScrollPane_Tema4.setViewportView(Panel_Tema4);

        Pnl_Aprender.add(ScrollPane_Tema4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));

        ScrollPane_Cuestionario4.setBorder(null);
        ScrollPane_Cuestionario4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Cuestionario4.setMaximumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Cuestionario4.setMinimumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Cuestionario4.setPreferredSize(new java.awt.Dimension(1176, 706));

        Panel_Cuestionario4.setBackground(new java.awt.Color(237, 234, 243));
        Panel_Cuestionario4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Cuestionario4.setMaximumSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario4.setMinimumSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario4.setPreferredSize(new java.awt.Dimension(1155, 1500));
        Panel_Cuestionario4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Anterior_OperadoresAritmeticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_OperadoresAritmeticos_Off.png"))); // NOI18N
        Button_Anterior_OperadoresAritmeticos.setBorder(null);
        Button_Anterior_OperadoresAritmeticos.setBorderPainted(false);
        Button_Anterior_OperadoresAritmeticos.setContentAreaFilled(false);
        Button_Anterior_OperadoresAritmeticos.setFocusPainted(false);
        Button_Anterior_OperadoresAritmeticos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Anterior_OperadoresAritmeticos.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_OperadoresAritmeticos.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_OperadoresAritmeticos.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Anterior_OperadoresAritmeticos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_OperadoresAritmeticos_On.png"))); // NOI18N
        Button_Anterior_OperadoresAritmeticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Anterior_OperadoresAritmeticosActionPerformed(evt);
            }
        });
        Panel_Cuestionario4.add(Button_Anterior_OperadoresAritmeticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1410, 254, 64));

        Button_Siguiente_LecturaeImpresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_LecturaeImpresion_Off.png"))); // NOI18N
        Button_Siguiente_LecturaeImpresion.setBorder(null);
        Button_Siguiente_LecturaeImpresion.setBorderPainted(false);
        Button_Siguiente_LecturaeImpresion.setContentAreaFilled(false);
        Button_Siguiente_LecturaeImpresion.setFocusPainted(false);
        Button_Siguiente_LecturaeImpresion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Siguiente_LecturaeImpresion.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_LecturaeImpresion.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_LecturaeImpresion.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_LecturaeImpresion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_LecturaeImpresion_On.png"))); // NOI18N
        Button_Siguiente_LecturaeImpresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Siguiente_LecturaeImpresionActionPerformed(evt);
            }
        });
        Panel_Cuestionario4.add(Button_Siguiente_LecturaeImpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1410, 254, 64));

        Lbl_Header_Aprender7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_Aprender.png"))); // NOI18N
        Panel_Cuestionario4.add(Lbl_Header_Aprender7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Label_Cuestionario4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Label_Cuestionario4.setText("Operadores Aritméticos | Cuestionario");
        Panel_Cuestionario4.add(Label_Cuestionario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 610, 30));

        ScrollPane_Cuestionario4.setViewportView(Panel_Cuestionario4);

        Pnl_Aprender.add(ScrollPane_Cuestionario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));

        ScrollPane_Tema5.setBorder(null);
        ScrollPane_Tema5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Tema5.setMaximumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Tema5.setMinimumSize(new java.awt.Dimension(1176, 706));
        ScrollPane_Tema5.setPreferredSize(new java.awt.Dimension(1176, 706));

        Panel_Tema5.setBackground(new java.awt.Color(237, 234, 243));
        Panel_Tema5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Tema5.setMaximumSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema5.setMinimumSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema5.setPreferredSize(new java.awt.Dimension(1155, 1500));
        Panel_Tema5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Anterior_Cuestionario4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_Cuestionario4_Off_1.png"))); // NOI18N
        Button_Anterior_Cuestionario4.setBorderPainted(false);
        Button_Anterior_Cuestionario4.setContentAreaFilled(false);
        Button_Anterior_Cuestionario4.setFocusPainted(false);
        Button_Anterior_Cuestionario4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Anterior_Cuestionario4.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario4.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario4.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Anterior_Cuestionario4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Anterior_Cuestionario4_On_1.png"))); // NOI18N
        Button_Anterior_Cuestionario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Anterior_Cuestionario4ActionPerformed(evt);
            }
        });
        Panel_Tema5.add(Button_Anterior_Cuestionario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1410, 254, 64));

        Button_Siguiente_Cuestionario5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Cuestionario5_Off.png"))); // NOI18N
        Button_Siguiente_Cuestionario5.setBorderPainted(false);
        Button_Siguiente_Cuestionario5.setContentAreaFilled(false);
        Button_Siguiente_Cuestionario5.setFocusPainted(false);
        Button_Siguiente_Cuestionario5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Siguiente_Cuestionario5.setMaximumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario5.setMinimumSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario5.setPreferredSize(new java.awt.Dimension(254, 64));
        Button_Siguiente_Cuestionario5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Aprender/Siguiente_Cuestionario5_On.png"))); // NOI18N
        Button_Siguiente_Cuestionario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Siguiente_Cuestionario5ActionPerformed(evt);
            }
        });
        Panel_Tema5.add(Button_Siguiente_Cuestionario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1410, 254, 64));

        Lbl_Header_Aprender8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_Aprender.png"))); // NOI18N
        Panel_Tema5.add(Lbl_Header_Aprender8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Label_LecturaeImpresion.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Label_LecturaeImpresion.setText("Lectura e Impresión");
        Panel_Tema5.add(Label_LecturaeImpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 340, 40));

        ScrollPane_Tema5.setViewportView(Panel_Tema5);

        Pnl_Aprender.add(ScrollPane_Tema5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));

        Pnl_Principal.add(Pnl_Aprender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1176, 705));

        Pnl_Programar.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Programar.setMaximumSize(new java.awt.Dimension(1176, 705));
        Pnl_Programar.setMinimumSize(new java.awt.Dimension(1176, 705));
        Pnl_Programar.setPreferredSize(new java.awt.Dimension(1176, 705));
        Pnl_Programar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Programar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Programar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pnl_Programar.add(Label_Programar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 300, 150));

        Lbl_Header_Aprender9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_Programar.png"))); // NOI18N
        Pnl_Programar.add(Lbl_Header_Aprender9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Pnl_Principal.add(Pnl_Programar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1176, 705));

        Pnl_CodeStorm.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_CodeStorm.setMaximumSize(new java.awt.Dimension(1176, 706));
        Pnl_CodeStorm.setMinimumSize(new java.awt.Dimension(1176, 706));
        Pnl_CodeStorm.setPreferredSize(new java.awt.Dimension(1176, 706));
        Pnl_CodeStorm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_ListadoEjercicios.setMaximumSize(new java.awt.Dimension(1176, 705));
        Pnl_ListadoEjercicios.setPreferredSize(new java.awt.Dimension(1176, 705));
        Pnl_ListadoEjercicios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Header_CodeStorm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_CodeStorm.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_Header_CodeStorm, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Button_Introduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Introduccion_Off.png"))); // NOI18N
        Button_Introduccion.setBorder(null);
        Button_Introduccion.setBorderPainted(false);
        Button_Introduccion.setContentAreaFilled(false);
        Button_Introduccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Introduccion.setMaximumSize(new java.awt.Dimension(202, 62));
        Button_Introduccion.setMinimumSize(new java.awt.Dimension(202, 62));
        Button_Introduccion.setPreferredSize(new java.awt.Dimension(202, 62));
        Button_Introduccion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Introduccion_On.png"))); // NOI18N
        Button_Introduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_IntroduccionActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Introduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 202, 62));

        Button_Nivel1_Ejercicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio1_Off.png"))); // NOI18N
        Button_Nivel1_Ejercicio1.setBorder(null);
        Button_Nivel1_Ejercicio1.setBorderPainted(false);
        Button_Nivel1_Ejercicio1.setContentAreaFilled(false);
        Button_Nivel1_Ejercicio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel1_Ejercicio1.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio1.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio1.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio1_On.png"))); // NOI18N
        Button_Nivel1_Ejercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel1_Ejercicio1ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel1_Ejercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 142, 52));

        Button_Nivel1_Ejercicio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio2_Off.png"))); // NOI18N
        Button_Nivel1_Ejercicio2.setBorder(null);
        Button_Nivel1_Ejercicio2.setBorderPainted(false);
        Button_Nivel1_Ejercicio2.setContentAreaFilled(false);
        Button_Nivel1_Ejercicio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel1_Ejercicio2.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio2.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio2.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio2_On.png"))); // NOI18N
        Button_Nivel1_Ejercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel1_Ejercicio2ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel1_Ejercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 142, 52));

        Button_Nivel1_Ejercicio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio3_Off.png"))); // NOI18N
        Button_Nivel1_Ejercicio3.setBorder(null);
        Button_Nivel1_Ejercicio3.setBorderPainted(false);
        Button_Nivel1_Ejercicio3.setContentAreaFilled(false);
        Button_Nivel1_Ejercicio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel1_Ejercicio3.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio3.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio3.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio3_On.png"))); // NOI18N
        Button_Nivel1_Ejercicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel1_Ejercicio3ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel1_Ejercicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 142, 52));

        Button_Nivel1_Ejercicio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio4_Off.png"))); // NOI18N
        Button_Nivel1_Ejercicio4.setBorder(null);
        Button_Nivel1_Ejercicio4.setBorderPainted(false);
        Button_Nivel1_Ejercicio4.setContentAreaFilled(false);
        Button_Nivel1_Ejercicio4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel1_Ejercicio4.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio4.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio4.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel1_Ejercicio4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio4_On.png"))); // NOI18N
        Button_Nivel1_Ejercicio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel1_Ejercicio4ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel1_Ejercicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 142, 52));

        Button_Nivel2_Ejercicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio1_Off.png"))); // NOI18N
        Button_Nivel2_Ejercicio1.setBorder(null);
        Button_Nivel2_Ejercicio1.setBorderPainted(false);
        Button_Nivel2_Ejercicio1.setContentAreaFilled(false);
        Button_Nivel2_Ejercicio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel2_Ejercicio1.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio1.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio1.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio1_On.png"))); // NOI18N
        Button_Nivel2_Ejercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel2_Ejercicio1ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel2_Ejercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 142, 52));

        Button_Nivel2_Ejercicio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio2_Off.png"))); // NOI18N
        Button_Nivel2_Ejercicio2.setBorder(null);
        Button_Nivel2_Ejercicio2.setBorderPainted(false);
        Button_Nivel2_Ejercicio2.setContentAreaFilled(false);
        Button_Nivel2_Ejercicio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel2_Ejercicio2.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio2.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio2.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio2_On.png"))); // NOI18N
        Button_Nivel2_Ejercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel2_Ejercicio2ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel2_Ejercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 142, 52));

        Button_Nivel2_Ejercicio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio3_Off.png"))); // NOI18N
        Button_Nivel2_Ejercicio3.setBorder(null);
        Button_Nivel2_Ejercicio3.setBorderPainted(false);
        Button_Nivel2_Ejercicio3.setContentAreaFilled(false);
        Button_Nivel2_Ejercicio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel2_Ejercicio3.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio3.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio3.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio3_On.png"))); // NOI18N
        Button_Nivel2_Ejercicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel2_Ejercicio3ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel2_Ejercicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 142, 52));

        Button_Nivel2_Ejercicio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio4_Off.png"))); // NOI18N
        Button_Nivel2_Ejercicio4.setBorder(null);
        Button_Nivel2_Ejercicio4.setBorderPainted(false);
        Button_Nivel2_Ejercicio4.setContentAreaFilled(false);
        Button_Nivel2_Ejercicio4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel2_Ejercicio4.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio4.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio4.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel2_Ejercicio4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio4_On.png"))); // NOI18N
        Button_Nivel2_Ejercicio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel2_Ejercicio4ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel2_Ejercicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 142, 52));

        Button_Nivel3_Ejercicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio1_Off.png"))); // NOI18N
        Button_Nivel3_Ejercicio1.setBorder(null);
        Button_Nivel3_Ejercicio1.setBorderPainted(false);
        Button_Nivel3_Ejercicio1.setContentAreaFilled(false);
        Button_Nivel3_Ejercicio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel3_Ejercicio1.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio1.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio1.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio1_On.png"))); // NOI18N
        Button_Nivel3_Ejercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel3_Ejercicio1ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel3_Ejercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 142, 52));

        Button_Nivel3_Ejercicio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio2_Off.png"))); // NOI18N
        Button_Nivel3_Ejercicio2.setBorder(null);
        Button_Nivel3_Ejercicio2.setBorderPainted(false);
        Button_Nivel3_Ejercicio2.setContentAreaFilled(false);
        Button_Nivel3_Ejercicio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel3_Ejercicio2.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio2.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio2.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio2_On.png"))); // NOI18N
        Button_Nivel3_Ejercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel3_Ejercicio2ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel3_Ejercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 142, 52));

        Button_Nivel3_Ejercicio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio3_Off.png"))); // NOI18N
        Button_Nivel3_Ejercicio3.setBorder(null);
        Button_Nivel3_Ejercicio3.setBorderPainted(false);
        Button_Nivel3_Ejercicio3.setContentAreaFilled(false);
        Button_Nivel3_Ejercicio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel3_Ejercicio3.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio3.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio3.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio3_On.png"))); // NOI18N
        Button_Nivel3_Ejercicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel3_Ejercicio3ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel3_Ejercicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 142, 52));

        Button_Nivel3_Ejercicio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio4_Off.png"))); // NOI18N
        Button_Nivel3_Ejercicio4.setBorder(null);
        Button_Nivel3_Ejercicio4.setBorderPainted(false);
        Button_Nivel3_Ejercicio4.setContentAreaFilled(false);
        Button_Nivel3_Ejercicio4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel3_Ejercicio4.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio4.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio4.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel3_Ejercicio4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio4_On.png"))); // NOI18N
        Button_Nivel3_Ejercicio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel3_Ejercicio4ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel3_Ejercicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 142, 52));

        Button_Nivel4_Ejercicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio1_Off.png"))); // NOI18N
        Button_Nivel4_Ejercicio1.setBorder(null);
        Button_Nivel4_Ejercicio1.setBorderPainted(false);
        Button_Nivel4_Ejercicio1.setContentAreaFilled(false);
        Button_Nivel4_Ejercicio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel4_Ejercicio1.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio1.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio1.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio1_On.png"))); // NOI18N
        Button_Nivel4_Ejercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel4_Ejercicio1ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel4_Ejercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 142, 52));

        Button_Nivel4_Ejercicio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio2_Off.png"))); // NOI18N
        Button_Nivel4_Ejercicio2.setBorder(null);
        Button_Nivel4_Ejercicio2.setBorderPainted(false);
        Button_Nivel4_Ejercicio2.setContentAreaFilled(false);
        Button_Nivel4_Ejercicio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel4_Ejercicio2.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio2.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio2.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio2_On.png"))); // NOI18N
        Button_Nivel4_Ejercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel4_Ejercicio2ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel4_Ejercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 142, 52));

        Button_Nivel4_Ejercicio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio3_Off.png"))); // NOI18N
        Button_Nivel4_Ejercicio3.setBorder(null);
        Button_Nivel4_Ejercicio3.setBorderPainted(false);
        Button_Nivel4_Ejercicio3.setContentAreaFilled(false);
        Button_Nivel4_Ejercicio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel4_Ejercicio3.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio3.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio3.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio3_On.png"))); // NOI18N
        Button_Nivel4_Ejercicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel4_Ejercicio3ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel4_Ejercicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 142, 52));

        Button_Nivel4_Ejercicio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio4_Off.png"))); // NOI18N
        Button_Nivel4_Ejercicio4.setBorder(null);
        Button_Nivel4_Ejercicio4.setBorderPainted(false);
        Button_Nivel4_Ejercicio4.setContentAreaFilled(false);
        Button_Nivel4_Ejercicio4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel4_Ejercicio4.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio4.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio4.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel4_Ejercicio4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio4_On.png"))); // NOI18N
        Button_Nivel4_Ejercicio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel4_Ejercicio4ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel4_Ejercicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 142, 52));

        Button_Nivel5_Ejercicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio1_Off.png"))); // NOI18N
        Button_Nivel5_Ejercicio1.setBorder(null);
        Button_Nivel5_Ejercicio1.setBorderPainted(false);
        Button_Nivel5_Ejercicio1.setContentAreaFilled(false);
        Button_Nivel5_Ejercicio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel5_Ejercicio1.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio1.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio1.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio1_On.png"))); // NOI18N
        Button_Nivel5_Ejercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel5_Ejercicio1ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel5_Ejercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 350, 142, 52));

        Button_Nivel5_Ejercicio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio2_Off.png"))); // NOI18N
        Button_Nivel5_Ejercicio2.setBorder(null);
        Button_Nivel5_Ejercicio2.setBorderPainted(false);
        Button_Nivel5_Ejercicio2.setContentAreaFilled(false);
        Button_Nivel5_Ejercicio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel5_Ejercicio2.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio2.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio2.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio2_On.png"))); // NOI18N
        Button_Nivel5_Ejercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel5_Ejercicio2ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel5_Ejercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 430, 142, 52));

        Button_Nivel5_Ejercicio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio3_Off.png"))); // NOI18N
        Button_Nivel5_Ejercicio3.setBorder(null);
        Button_Nivel5_Ejercicio3.setBorderPainted(false);
        Button_Nivel5_Ejercicio3.setContentAreaFilled(false);
        Button_Nivel5_Ejercicio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel5_Ejercicio3.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio3.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio3.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio3_On.png"))); // NOI18N
        Button_Nivel5_Ejercicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel5_Ejercicio3ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel5_Ejercicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 510, 142, 52));

        Button_Nivel5_Ejercicio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio4_Off.png"))); // NOI18N
        Button_Nivel5_Ejercicio4.setBorder(null);
        Button_Nivel5_Ejercicio4.setBorderPainted(false);
        Button_Nivel5_Ejercicio4.setContentAreaFilled(false);
        Button_Nivel5_Ejercicio4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Nivel5_Ejercicio4.setMaximumSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio4.setMinimumSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio4.setPreferredSize(new java.awt.Dimension(142, 52));
        Button_Nivel5_Ejercicio4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Ejercicio4_On.png"))); // NOI18N
        Button_Nivel5_Ejercicio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Nivel5_Ejercicio4ActionPerformed(evt);
            }
        });
        Pnl_ListadoEjercicios.add(Button_Nivel5_Ejercicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 590, 142, 52));

        Lbl_Nivel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Nivel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Nivel1.png"))); // NOI18N
        Lbl_Nivel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pnl_ListadoEjercicios.add(Lbl_Nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 180, 50));

        Lbl_Nivel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Nivel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Nivel2.png"))); // NOI18N
        Lbl_Nivel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pnl_ListadoEjercicios.add(Lbl_Nivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 180, 50));

        Lbl_Nivel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Nivel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Nivel3.png"))); // NOI18N
        Lbl_Nivel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pnl_ListadoEjercicios.add(Lbl_Nivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 180, 50));

        Lbl_Nivel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Nivel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Nivel4.png"))); // NOI18N
        Lbl_Nivel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pnl_ListadoEjercicios.add(Lbl_Nivel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 180, 50));

        Lbl_Nivel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Nivel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Nivel5.png"))); // NOI18N
        Lbl_Nivel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pnl_ListadoEjercicios.add(Lbl_Nivel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, 180, 50));

        Lbl_BarraProgreso_Nivel1_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_0.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel1_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 17, 290));

        Lbl_BarraProgreso_Nivel1_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_1.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 17, 290));

        Lbl_BarraProgreso_Nivel1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_2.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 17, 290));

        Lbl_BarraProgreso_Nivel1_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_3.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 17, 290));

        Lbl_BarraProgreso_Nivel1_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_4.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 17, 290));

        Lbl_BarraProgreso_Nivel2_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_0.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel2_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 17, 290));

        Lbl_BarraProgreso_Nivel2_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_1.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 17, 290));

        Lbl_BarraProgreso_Nivel2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_2.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 17, 290));

        Lbl_BarraProgreso_Nivel2_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_3.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 17, 290));

        Lbl_BarraProgreso_Nivel2_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_4.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 17, 290));

        Lbl_BarraProgreso_Nivel3_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_0.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel3_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 17, 290));

        Lbl_BarraProgreso_Nivel3_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_1.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 17, 290));

        Lbl_BarraProgreso_Nivel3_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_2.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 17, 290));

        Lbl_BarraProgreso_Nivel3_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_3.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 17, 290));

        Lbl_BarraProgreso_Nivel3_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_4.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 17, 290));

        Lbl_BarraProgreso_Nivel4_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_0.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel4_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 17, 290));

        Lbl_BarraProgreso_Nivel4_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_1.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 17, 290));

        Lbl_BarraProgreso_Nivel4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_2.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 17, 290));

        Lbl_BarraProgreso_Nivel4_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_3.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 17, 290));

        Lbl_BarraProgreso_Nivel4_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_4.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 17, 290));

        Lbl_BarraProgreso_Nivel5_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_0.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel5_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 350, 17, 290));

        Lbl_BarraProgreso_Nivel5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_1.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 350, 17, 290));

        Lbl_BarraProgreso_Nivel5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_2.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 350, 17, 290));

        Lbl_BarraProgreso_Nivel5_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_3.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel5_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 350, 17, 290));

        Lbl_BarraProgreso_Nivel5_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_BarraProgreso_4.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_BarraProgreso_Nivel5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 350, 17, 290));

        Lbl_CodeStorm_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Apolo_CodeStorm_Fondo.png"))); // NOI18N
        Pnl_ListadoEjercicios.add(Lbl_CodeStorm_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 705));

        Pnl_CodeStorm.add(Pnl_ListadoEjercicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, -1));

        Scp_Introduccion.setBackground(new java.awt.Color(237, 234, 243));
        Scp_Introduccion.setBorder(null);
        Scp_Introduccion.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Scp_Introduccion.setMaximumSize(new java.awt.Dimension(1176, 706));
        Scp_Introduccion.setMinimumSize(new java.awt.Dimension(1176, 706));
        Scp_Introduccion.setName(""); // NOI18N
        Scp_Introduccion.setPreferredSize(new java.awt.Dimension(1176, 706));

        Panel_Introduccion.setBackground(new java.awt.Color(237, 234, 243));
        Panel_Introduccion.setMaximumSize(new java.awt.Dimension(1176, 4000));
        Panel_Introduccion.setMinimumSize(new java.awt.Dimension(1176, 4000));
        Panel_Introduccion.setPreferredSize(new java.awt.Dimension(1176, 4000));
        Panel_Introduccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Header_CodeStorm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_CodeStorm.png"))); // NOI18N
        Panel_Introduccion.add(Lbl_Header_CodeStorm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Scp_Introduccion.setViewportView(Panel_Introduccion);

        Pnl_CodeStorm.add(Scp_Introduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 706));

        Pnl_Ejercicios.setMaximumSize(new java.awt.Dimension(1176, 705));
        Pnl_Ejercicios.setMinimumSize(new java.awt.Dimension(1176, 705));
        Pnl_Ejercicios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Buttons.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Buttons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Ejercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Ejercicio_Off.png"))); // NOI18N
        Btn_Ejercicio.setBorder(null);
        Btn_Ejercicio.setBorderPainted(false);
        Btn_Ejercicio.setContentAreaFilled(false);
        Btn_Ejercicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Ejercicio.setMaximumSize(new java.awt.Dimension(172, 47));
        Btn_Ejercicio.setMinimumSize(new java.awt.Dimension(172, 47));
        Btn_Ejercicio.setPreferredSize(new java.awt.Dimension(172, 47));
        Btn_Ejercicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Ejercicio_On.png"))); // NOI18N
        Btn_Ejercicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Ejercicio_On.png"))); // NOI18N
        Btn_Ejercicio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Ejercicio_Enabled.png"))); // NOI18N
        Btn_Ejercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EjercicioActionPerformed(evt);
            }
        });
        Pnl_Buttons.add(Btn_Ejercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 172, 47));

        Btn_Codigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Codigo_Off.png"))); // NOI18N
        Btn_Codigo.setBorder(null);
        Btn_Codigo.setBorderPainted(false);
        Btn_Codigo.setContentAreaFilled(false);
        Btn_Codigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Codigo.setMaximumSize(new java.awt.Dimension(172, 47));
        Btn_Codigo.setMinimumSize(new java.awt.Dimension(172, 47));
        Btn_Codigo.setPreferredSize(new java.awt.Dimension(172, 47));
        Btn_Codigo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Codigo_On.png"))); // NOI18N
        Btn_Codigo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Codigo_On.png"))); // NOI18N
        Btn_Codigo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Codigo_Enabled.png"))); // NOI18N
        Btn_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CodigoActionPerformed(evt);
            }
        });
        Pnl_Buttons.add(Btn_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 172, 47));

        Btn_Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Enviar_Off.png"))); // NOI18N
        Btn_Enviar.setBorder(null);
        Btn_Enviar.setBorderPainted(false);
        Btn_Enviar.setContentAreaFilled(false);
        Btn_Enviar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Enviar.setMaximumSize(new java.awt.Dimension(172, 47));
        Btn_Enviar.setMinimumSize(new java.awt.Dimension(172, 47));
        Btn_Enviar.setPreferredSize(new java.awt.Dimension(172, 47));
        Btn_Enviar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Enviar_On.png"))); // NOI18N
        Btn_Enviar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Enviar_On.png"))); // NOI18N
        Btn_Enviar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Enviar_Enabled.png"))); // NOI18N
        Btn_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EnviarActionPerformed(evt);
            }
        });
        Pnl_Buttons.add(Btn_Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 172, 47));

        Btn_Solucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Solucion_Off.png"))); // NOI18N
        Btn_Solucion.setBorder(null);
        Btn_Solucion.setBorderPainted(false);
        Btn_Solucion.setContentAreaFilled(false);
        Btn_Solucion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Solucion.setMaximumSize(new java.awt.Dimension(172, 47));
        Btn_Solucion.setMinimumSize(new java.awt.Dimension(172, 47));
        Btn_Solucion.setPreferredSize(new java.awt.Dimension(172, 47));
        Btn_Solucion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Solucion_On.png"))); // NOI18N
        Btn_Solucion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Solucion_On.png"))); // NOI18N
        Btn_Solucion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Solucion_Enabled.png"))); // NOI18N
        Btn_Solucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SolucionActionPerformed(evt);
            }
        });
        Pnl_Buttons.add(Btn_Solucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 172, 47));

        Lbl_Header_CodeStorm2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Header_CodeStorm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_CodeStorm.png"))); // NOI18N
        Lbl_Header_CodeStorm2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pnl_Buttons.add(Lbl_Header_CodeStorm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Pnl_Ejercicios.add(Pnl_Buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 150));

        Pnl_Ejercicio1.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Scp_Ejercicio1.setBackground(new java.awt.Color(237, 234, 243));
        Scp_Ejercicio1.setBorder(null);
        Scp_Ejercicio1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Lbl_Ejercicio.setBackground(new java.awt.Color(237, 234, 243));
        Lbl_Ejercicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Ejercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CodeStorm/Ejercicio1.png"))); // NOI18N
        Lbl_Ejercicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Lbl_Ejercicio.setOpaque(true);
        Scp_Ejercicio1.setViewportView(Lbl_Ejercicio);

        Pnl_Ejercicio1.add(Scp_Ejercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1110, 510));

        Pnl_Codigo1.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Codigo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Scp_Codigo1.setBackground(new java.awt.Color(237, 234, 243));
        Scp_Codigo1.setBorder(null);

        Txa_Codigo1.setBackground(new java.awt.Color(237, 234, 243));
        Txa_Codigo1.setColumns(20);
        Txa_Codigo1.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        Txa_Codigo1.setLineWrap(true);
        Txa_Codigo1.setRows(5);
        Txa_Codigo1.setTabSize(4);
        Txa_Codigo1.setWrapStyleWord(true);
        Scp_Codigo1.setViewportView(Txa_Codigo1);

        Pnl_Codigo1.add(Scp_Codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1050, 460));

        Pnl_Ejercicio1.add(Pnl_Codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1110, 510));

        Pnl_Ejercicios.add(Pnl_Ejercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 1176, 530));

        Pnl_Ejercicio2.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pnl_Ejercicios.add(Pnl_Ejercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1176, 555));

        Pnl_Ejercicio3.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pnl_Ejercicios.add(Pnl_Ejercicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1176, 555));

        Pnl_Ejercicio4.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pnl_Ejercicios.add(Pnl_Ejercicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1176, 555));

        Pnl_Ejercicio5.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pnl_Ejercicios.add(Pnl_Ejercicio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1176, 555));

        Pnl_Ejercicio6.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pnl_Ejercicios.add(Pnl_Ejercicio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1176, 555));

        Pnl_Ejercicio7.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pnl_Ejercicios.add(Pnl_Ejercicio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1176, 555));

        Pnl_Ejercicio8.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pnl_Ejercicios.add(Pnl_Ejercicio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1176, 555));

        Pnl_Ejercicio9.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pnl_Ejercicios.add(Pnl_Ejercicio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1176, 555));

        Pnl_Ejercicio10.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pnl_Ejercicios.add(Pnl_Ejercicio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1176, 555));

        Pnl_Ejercicio11.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pnl_Ejercicios.add(Pnl_Ejercicio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1176, 555));

        Pnl_Ejercicio12.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Ejercicio12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Pnl_Ejercicios.add(Pnl_Ejercicio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1176, 555));

        Pnl_CodeStorm.add(Pnl_Ejercicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1176, 705));

        Pnl_Principal.add(Pnl_CodeStorm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1176, 706));

        Pnl_Historia.setBackground(new java.awt.Color(237, 234, 243));
        Pnl_Historia.setMaximumSize(new java.awt.Dimension(1176, 705));
        Pnl_Historia.setMinimumSize(new java.awt.Dimension(1176, 705));
        Pnl_Historia.setPreferredSize(new java.awt.Dimension(1176, 705));
        Pnl_Historia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Header_Aprender11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Apolo_Header_Historia.png"))); // NOI18N
        Pnl_Historia.add(Lbl_Header_Aprender11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 1115, 55));

        Pnl_Principal.add(Pnl_Historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1176, 705));

        getContentPane().add(Pnl_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void Button_AjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AjustesActionPerformed
        if (evt.getSource() == Button_Ajustes) {
            Button_Ajustes.setSelected(false);
            Ajustes.setVisible(true);
        }
    }//GEN-LAST:event_Button_AjustesActionPerformed

    private void Button_CodeStormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CodeStormActionPerformed
        if (Button_CodeStorm.isSelected()) {
            apagarSecciones(3);
            habilitarBotonesCodeStorm();

            Pnl_CodeStorm.setVisible(true);
            Pnl_ListadoEjercicios.setVisible(true);
            Scp_Introduccion.setVisible(false);
            Pnl_Ejercicios.setVisible(false);

            Pnl_Aprender.setVisible(false);
            Pnl_Programar.setVisible(false);
            Pnl_Historia.setVisible(false);
            Pnl_Home.setVisible(false);
        } else {
            Pnl_CodeStorm.setVisible(false);
            Pnl_Home.setVisible(true);
        }
    }//GEN-LAST:event_Button_CodeStormActionPerformed

    private void Button_AprenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AprenderActionPerformed
        if (Button_Aprender.isSelected()) {
            apagarSecciones(1);
            habilitarBotonesAprender();

            Pnl_Aprender.setVisible(true);
            Panel_Mapa.setVisible(true);

            for (Component scrollpane : Pnl_Aprender.getComponents()) {
                if (scrollpane instanceof JScrollPane) {
                    ((JScrollPane) scrollpane).setVisible(false);
                }
            }
        } else {
            Pnl_Aprender.setVisible(false);
            Pnl_Home.setVisible(true);
        }
    }//GEN-LAST:event_Button_AprenderActionPerformed

    private void Button_ProgramarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ProgramarActionPerformed
        if (Button_Programar.isSelected()) {
            apagarSecciones(2);

            Toolkit t = Toolkit.getDefaultToolkit();
            Dimension screenSize = t.getScreenSize();
            Label_Programar.setText("Su Resolución de Pantalla es " + screenSize.width + " x " + screenSize.height);
            Pnl_Programar.setVisible(true);
        } else {
            Pnl_Programar.setVisible(false);
            Pnl_Home.setVisible(true);
        }
    }//GEN-LAST:event_Button_ProgramarActionPerformed

    private void Button_HistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_HistoriaActionPerformed
        if (Button_Historia.isSelected()) {
            apagarSecciones(4);
            Pnl_Historia.setVisible(true);

            Pnl_Home.setVisible(false);
            Pnl_Aprender.setVisible(false);
            Pnl_Programar.setVisible(false);
            Pnl_CodeStorm.setVisible(false);
        } else {
            Pnl_Historia.setVisible(false);
            Pnl_Home.setVisible(true);
        }
    }//GEN-LAST:event_Button_HistoriaActionPerformed


    private void Button_Aprender_Tema1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema1ActionPerformed
        if (evt.getSource() == Button_Aprender_Tema1) {
            ScrollPane_Tema1.setVisible(true);
            ScrollPane_Tema1.getVerticalScrollBar().setUI(Barra);
            Panel_Mapa.setVisible(false);
        }
    }//GEN-LAST:event_Button_Aprender_Tema1ActionPerformed

    private void Button_Aprender_Tema2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema2ActionPerformed
        if (evt.getSource() == Button_Aprender_Tema2) {
            ScrollPane_Tema2.setVisible(true);
            ScrollPane_Tema2.getVerticalScrollBar().setUI(Barra);
            Panel_Mapa.setVisible(false);
        }
    }//GEN-LAST:event_Button_Aprender_Tema2ActionPerformed

    private void Button_Aprender_Tema3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema3ActionPerformed
        if (evt.getSource() == Button_Aprender_Tema3) {
            ScrollPane_Tema3.setVisible(true);
            ScrollPane_Tema3.getVerticalScrollBar().setUI(Barra);
            Panel_Mapa.setVisible(false);
        }
    }//GEN-LAST:event_Button_Aprender_Tema3ActionPerformed

    private void Button_Aprender_Tema4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema4ActionPerformed
        if (evt.getSource() == Button_Aprender_Tema4) {
            ScrollPane_Tema4.setVisible(true);
            ScrollPane_Tema3.getVerticalScrollBar().setUI(Barra);
            Panel_Mapa.setVisible(false);
        }
    }//GEN-LAST:event_Button_Aprender_Tema4ActionPerformed

    private void Button_Aprender_Tema5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Aprender_Tema5ActionPerformed
        if (evt.getSource() == Button_Aprender_Tema5) {
            ScrollPane_Tema5.setVisible(true);
            ScrollPane_Tema3.getVerticalScrollBar().setUI(Barra);
            Panel_Mapa.setVisible(false);
        }
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

    private void Button_Siguiente_Cuestionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Siguiente_Cuestionario1ActionPerformed
        if (evt.getSource() == Button_Siguiente_Cuestionario1) {
            ScrollPane_Tema1.setVisible(false);
            ScrollPane_Cuestionario1.setVisible(true);
            ScrollPane_Cuestionario1.getVerticalScrollBar().setUI(Barra);
        }
    }//GEN-LAST:event_Button_Siguiente_Cuestionario1ActionPerformed

    private void Button_Anterior_HelloWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Anterior_HelloWordActionPerformed
        if (evt.getSource() == Button_Anterior_HelloWord) {
            ScrollPane_Tema1.setVisible(true);
            ScrollPane_Tema1.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Cuestionario1.setVisible(false);
        }
    }//GEN-LAST:event_Button_Anterior_HelloWordActionPerformed

    private void Button_Siguiente_ComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Siguiente_ComentariosActionPerformed
        if (evt.getSource() == Button_Siguiente_Comentarios) {
            ScrollPane_Tema2.setVisible(true);
            ScrollPane_Tema2.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Cuestionario1.setVisible(false);
        }
    }//GEN-LAST:event_Button_Siguiente_ComentariosActionPerformed

    private void Button_Anterior_Cuestionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Anterior_Cuestionario1ActionPerformed
        if (evt.getSource() == Button_Anterior_Cuestionario1) {
            ScrollPane_Cuestionario1.setVisible(true);
            ScrollPane_Cuestionario1.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Tema2.setVisible(false);
        }
    }//GEN-LAST:event_Button_Anterior_Cuestionario1ActionPerformed

    private void Button_Siguiente_Cuestionario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Siguiente_Cuestionario2ActionPerformed
        if (evt.getSource() == Button_Siguiente_Cuestionario2) {
            ScrollPane_Cuestionario2.setVisible(true);
            ScrollPane_Cuestionario2.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Tema2.setVisible(false);
        }
    }//GEN-LAST:event_Button_Siguiente_Cuestionario2ActionPerformed

    private void Button_Anterior_ComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Anterior_ComentariosActionPerformed
        if (evt.getSource() == Button_Anterior_Comentarios) {
            ScrollPane_Tema2.setVisible(true);
            ScrollPane_Tema2.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Cuestionario2.setVisible(false);
        }
    }//GEN-LAST:event_Button_Anterior_ComentariosActionPerformed

    private void Button_Siguiente_TiposdeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Siguiente_TiposdeDatosActionPerformed
        if (evt.getSource() == Button_Siguiente_TiposdeDatos) {
            ScrollPane_Tema3.setVisible(true);
            ScrollPane_Tema3.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Cuestionario2.setVisible(false);
        }
    }//GEN-LAST:event_Button_Siguiente_TiposdeDatosActionPerformed

    private void Button_Anterior_Cuestionario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Anterior_Cuestionario2ActionPerformed
        if (evt.getSource() == Button_Anterior_Cuestionario2) {
            ScrollPane_Cuestionario2.setVisible(true);
            ScrollPane_Cuestionario2.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Tema3.setVisible(false);
        }
    }//GEN-LAST:event_Button_Anterior_Cuestionario2ActionPerformed

    private void Button_Siguiente_Cuestionario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Siguiente_Cuestionario3ActionPerformed
        if (evt.getSource() == Button_Siguiente_Cuestionario3) {
            ScrollPane_Cuestionario3.setVisible(true);
            ScrollPane_Cuestionario3.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Tema3.setVisible(false);
        }
    }//GEN-LAST:event_Button_Siguiente_Cuestionario3ActionPerformed

    private void Button_Anterior_TiposdeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Anterior_TiposdeDatosActionPerformed
        if (evt.getSource() == Button_Anterior_TiposdeDatos) {
            ScrollPane_Tema3.setVisible(true);
            ScrollPane_Tema3.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Cuestionario3.setVisible(false);
        }
    }//GEN-LAST:event_Button_Anterior_TiposdeDatosActionPerformed

    private void Button_Siguiente_OperadoresAritmeticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Siguiente_OperadoresAritmeticosActionPerformed
        if (evt.getSource() == Button_Siguiente_OperadoresAritmeticos) {
            ScrollPane_Tema4.setVisible(true);
            ScrollPane_Tema4.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Cuestionario3.setVisible(false);
        }
    }//GEN-LAST:event_Button_Siguiente_OperadoresAritmeticosActionPerformed

    private void Button_Anterior_Cuestionario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Anterior_Cuestionario3ActionPerformed
        if (evt.getSource() == Button_Anterior_Cuestionario3) {
            ScrollPane_Cuestionario3.setVisible(true);
            ScrollPane_Cuestionario3.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Tema4.setVisible(false);
        }
    }//GEN-LAST:event_Button_Anterior_Cuestionario3ActionPerformed

    private void Button_Siguiente_Cuestionario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Siguiente_Cuestionario4ActionPerformed
        if (evt.getSource() == Button_Siguiente_Cuestionario4) {
            ScrollPane_Cuestionario4.setVisible(true);
            ScrollPane_Cuestionario4.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Tema4.setVisible(false);
        }
    }//GEN-LAST:event_Button_Siguiente_Cuestionario4ActionPerformed

    private void Button_Anterior_OperadoresAritmeticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Anterior_OperadoresAritmeticosActionPerformed
        if (evt.getSource() == Button_Anterior_OperadoresAritmeticos) {
            ScrollPane_Tema4.setVisible(true);
            ScrollPane_Tema4.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Cuestionario4.setVisible(false);
        }
    }//GEN-LAST:event_Button_Anterior_OperadoresAritmeticosActionPerformed

    private void Button_Siguiente_LecturaeImpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Siguiente_LecturaeImpresionActionPerformed
        if (evt.getSource() == Button_Siguiente_LecturaeImpresion) {
            ScrollPane_Tema5.setVisible(true);
            ScrollPane_Tema5.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Cuestionario4.setVisible(false);
        }
    }//GEN-LAST:event_Button_Siguiente_LecturaeImpresionActionPerformed

    private void Button_Anterior_Cuestionario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Anterior_Cuestionario4ActionPerformed
        if (evt.getSource() == Button_Anterior_Cuestionario4) {
            ScrollPane_Cuestionario4.setVisible(true);
            ScrollPane_Cuestionario4.getVerticalScrollBar().setUI(Barra);
            ScrollPane_Tema5.setVisible(false);
        }
    }//GEN-LAST:event_Button_Anterior_Cuestionario4ActionPerformed

    private void Button_Siguiente_Cuestionario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Siguiente_Cuestionario5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Siguiente_Cuestionario5ActionPerformed

    private void Button_Nivel1_Ejercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel1_Ejercicio1ActionPerformed
        if (evt.getSource() == Button_Nivel1_Ejercicio1) {
            Pnl_Ejercicios.setVisible(true);
            Pnl_ListadoEjercicios.setVisible(false);
        }
    }//GEN-LAST:event_Button_Nivel1_Ejercicio1ActionPerformed

    private void Button_Nivel1_Ejercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel1_Ejercicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel1_Ejercicio2ActionPerformed

    private void Button_Nivel1_Ejercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel1_Ejercicio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel1_Ejercicio3ActionPerformed

    private void Button_Nivel1_Ejercicio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel1_Ejercicio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel1_Ejercicio4ActionPerformed

    private void Button_IntroduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_IntroduccionActionPerformed
        if (evt.getSource() == Button_Introduccion) {
            Scp_Introduccion.setVisible(true);
            Scp_Introduccion.getVerticalScrollBar().setUI(Barra);
            Pnl_ListadoEjercicios.setVisible(false);
        }
    }//GEN-LAST:event_Button_IntroduccionActionPerformed

    private void Button_Nivel2_Ejercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel2_Ejercicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel2_Ejercicio1ActionPerformed

    private void Button_Nivel2_Ejercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel2_Ejercicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel2_Ejercicio2ActionPerformed

    private void Button_Nivel2_Ejercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel2_Ejercicio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel2_Ejercicio3ActionPerformed

    private void Button_Nivel2_Ejercicio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel2_Ejercicio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel2_Ejercicio4ActionPerformed

    private void Button_Nivel3_Ejercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel3_Ejercicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel3_Ejercicio1ActionPerformed

    private void Button_Nivel3_Ejercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel3_Ejercicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel3_Ejercicio2ActionPerformed

    private void Button_Nivel3_Ejercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel3_Ejercicio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel3_Ejercicio3ActionPerformed

    private void Button_Nivel3_Ejercicio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel3_Ejercicio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel3_Ejercicio4ActionPerformed

    private void Button_Nivel4_Ejercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel4_Ejercicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel4_Ejercicio1ActionPerformed

    private void Button_Nivel4_Ejercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel4_Ejercicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel4_Ejercicio2ActionPerformed

    private void Button_Nivel4_Ejercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel4_Ejercicio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel4_Ejercicio3ActionPerformed

    private void Button_Nivel4_Ejercicio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel4_Ejercicio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel4_Ejercicio4ActionPerformed

    private void Button_Nivel5_Ejercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel5_Ejercicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel5_Ejercicio1ActionPerformed

    private void Button_Nivel5_Ejercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel5_Ejercicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel5_Ejercicio2ActionPerformed

    private void Button_Nivel5_Ejercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel5_Ejercicio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel5_Ejercicio3ActionPerformed

    private void Button_Nivel5_Ejercicio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Nivel5_Ejercicio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Nivel5_Ejercicio4ActionPerformed

    private void Btn_EjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EjercicioActionPerformed
        if (evt.getSource() == Btn_Ejercicio) {
            int num = validarPanel();
            if (num == 1) {
                Pnl_Codigo1.setVisible(true);
                Scp_Ejercicio1.setVisible(true);
            }
            DeshabilitarBotonesCodeStorm(0);
        }
    }//GEN-LAST:event_Btn_EjercicioActionPerformed

    private void Btn_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_EnviarActionPerformed

    private void Btn_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CodigoActionPerformed
        if (evt.getSource() == Btn_Codigo) {
            int num = validarPanel();
            if (num == 1) {
                Pnl_Codigo1.setVisible(true);
                Scp_Ejercicio1.setVisible(false);
            }
            DeshabilitarBotonesCodeStorm(1);
        }
    }//GEN-LAST:event_Btn_CodigoActionPerformed

    private void Btn_SolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SolucionActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Apolo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Home_Apolo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Btn_Codigo;
    private javax.swing.JToggleButton Btn_Ejercicio;
    private javax.swing.JToggleButton Btn_Enviar;
    private javax.swing.JToggleButton Btn_Solucion;
    private javax.swing.JToggleButton Button_Ajustes;
    private javax.swing.JButton Button_Anterior_Comentarios;
    private javax.swing.JButton Button_Anterior_Cuestionario1;
    private javax.swing.JButton Button_Anterior_Cuestionario2;
    private javax.swing.JButton Button_Anterior_Cuestionario3;
    private javax.swing.JButton Button_Anterior_Cuestionario4;
    private javax.swing.JButton Button_Anterior_HelloWord;
    private javax.swing.JButton Button_Anterior_OperadoresAritmeticos;
    private javax.swing.JButton Button_Anterior_TiposdeDatos;
    private javax.swing.JToggleButton Button_Aprender;
    private javax.swing.JButton Button_Aprender_Ejercicio1;
    private javax.swing.JButton Button_Aprender_Ejercicio2;
    private javax.swing.JButton Button_Aprender_EjercicioFinal;
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
    private javax.swing.JButton Button_Introduccion;
    private javax.swing.JButton Button_Nivel1_Ejercicio1;
    private javax.swing.JButton Button_Nivel1_Ejercicio2;
    private javax.swing.JButton Button_Nivel1_Ejercicio3;
    private javax.swing.JButton Button_Nivel1_Ejercicio4;
    private javax.swing.JButton Button_Nivel2_Ejercicio1;
    private javax.swing.JButton Button_Nivel2_Ejercicio2;
    private javax.swing.JButton Button_Nivel2_Ejercicio3;
    private javax.swing.JButton Button_Nivel2_Ejercicio4;
    private javax.swing.JButton Button_Nivel3_Ejercicio1;
    private javax.swing.JButton Button_Nivel3_Ejercicio2;
    private javax.swing.JButton Button_Nivel3_Ejercicio3;
    private javax.swing.JButton Button_Nivel3_Ejercicio4;
    private javax.swing.JButton Button_Nivel4_Ejercicio1;
    private javax.swing.JButton Button_Nivel4_Ejercicio2;
    private javax.swing.JButton Button_Nivel4_Ejercicio3;
    private javax.swing.JButton Button_Nivel4_Ejercicio4;
    private javax.swing.JButton Button_Nivel5_Ejercicio1;
    private javax.swing.JButton Button_Nivel5_Ejercicio2;
    private javax.swing.JButton Button_Nivel5_Ejercicio3;
    private javax.swing.JButton Button_Nivel5_Ejercicio4;
    private javax.swing.JToggleButton Button_Programar;
    private javax.swing.JButton Button_Siguiente_Comentarios;
    private javax.swing.JButton Button_Siguiente_Cuestionario1;
    private javax.swing.JButton Button_Siguiente_Cuestionario2;
    private javax.swing.JButton Button_Siguiente_Cuestionario3;
    private javax.swing.JButton Button_Siguiente_Cuestionario4;
    private javax.swing.JButton Button_Siguiente_Cuestionario5;
    private javax.swing.JButton Button_Siguiente_LecturaeImpresion;
    private javax.swing.JButton Button_Siguiente_OperadoresAritmeticos;
    private javax.swing.JButton Button_Siguiente_TiposdeDatos;
    private javax.swing.JLabel Label_Comentarios;
    private javax.swing.JLabel Label_Cuestionario1;
    private javax.swing.JLabel Label_Cuestionario2;
    private javax.swing.JLabel Label_Cuestionario3;
    private javax.swing.JLabel Label_Cuestionario4;
    private javax.swing.JLabel Label_HelloWorld;
    private javax.swing.JLabel Label_LecturaeImpresion;
    private javax.swing.JLabel Label_OperadoresAritmeticos;
    private javax.swing.JLabel Label_Programar;
    private javax.swing.JLabel Label_TiposdeDatos;
    private javax.swing.JLabel Lbl_Aprender_Mapa;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel1_0;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel1_1;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel1_2;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel1_3;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel1_4;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel2_0;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel2_1;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel2_2;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel2_3;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel2_4;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel3_0;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel3_1;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel3_2;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel3_3;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel3_4;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel4_0;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel4_1;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel4_2;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel4_3;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel4_4;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel5_0;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel5_1;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel5_2;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel5_3;
    private javax.swing.JLabel Lbl_BarraProgreso_Nivel5_4;
    private javax.swing.JLabel Lbl_CodeStorm_Fondo;
    private javax.swing.JLabel Lbl_Ejercicio;
    private javax.swing.JLabel Lbl_Header_Aprender;
    private javax.swing.JLabel Lbl_Header_Aprender1;
    private javax.swing.JLabel Lbl_Header_Aprender11;
    private javax.swing.JLabel Lbl_Header_Aprender2;
    private javax.swing.JLabel Lbl_Header_Aprender3;
    private javax.swing.JLabel Lbl_Header_Aprender4;
    private javax.swing.JLabel Lbl_Header_Aprender5;
    private javax.swing.JLabel Lbl_Header_Aprender6;
    private javax.swing.JLabel Lbl_Header_Aprender7;
    private javax.swing.JLabel Lbl_Header_Aprender8;
    private javax.swing.JLabel Lbl_Header_Aprender9;
    private javax.swing.JLabel Lbl_Header_CodeStorm;
    private javax.swing.JLabel Lbl_Header_CodeStorm1;
    private javax.swing.JLabel Lbl_Header_CodeStorm2;
    private javax.swing.JLabel Lbl_HomeButttons;
    private javax.swing.JLabel Lbl_Home_Fondo;
    private javax.swing.JLabel Lbl_Nivel1;
    private javax.swing.JLabel Lbl_Nivel2;
    private javax.swing.JLabel Lbl_Nivel3;
    private javax.swing.JLabel Lbl_Nivel4;
    private javax.swing.JLabel Lbl_Nivel5;
    private javax.swing.JPanel Panel_Cuestionario1;
    private javax.swing.JPanel Panel_Cuestionario2;
    private javax.swing.JPanel Panel_Cuestionario3;
    private javax.swing.JPanel Panel_Cuestionario4;
    private javax.swing.JPanel Panel_Introduccion;
    private javax.swing.JPanel Panel_Mapa;
    private javax.swing.JPanel Panel_Tema1;
    private javax.swing.JPanel Panel_Tema2;
    private javax.swing.JPanel Panel_Tema3;
    private javax.swing.JPanel Panel_Tema4;
    private javax.swing.JPanel Panel_Tema5;
    private javax.swing.JPanel Pnl_Aprender;
    private javax.swing.JPanel Pnl_Bar_Buttons;
    private javax.swing.JPanel Pnl_Buttons;
    private javax.swing.JPanel Pnl_CodeStorm;
    private javax.swing.JPanel Pnl_Codigo1;
    private javax.swing.JPanel Pnl_Ejercicio1;
    private javax.swing.JPanel Pnl_Ejercicio10;
    private javax.swing.JPanel Pnl_Ejercicio11;
    private javax.swing.JPanel Pnl_Ejercicio12;
    private javax.swing.JPanel Pnl_Ejercicio2;
    private javax.swing.JPanel Pnl_Ejercicio3;
    private javax.swing.JPanel Pnl_Ejercicio4;
    private javax.swing.JPanel Pnl_Ejercicio5;
    private javax.swing.JPanel Pnl_Ejercicio6;
    private javax.swing.JPanel Pnl_Ejercicio7;
    private javax.swing.JPanel Pnl_Ejercicio8;
    private javax.swing.JPanel Pnl_Ejercicio9;
    private javax.swing.JPanel Pnl_Ejercicios;
    private javax.swing.JPanel Pnl_Historia;
    private javax.swing.JPanel Pnl_Home;
    private javax.swing.JPanel Pnl_ListadoEjercicios;
    private javax.swing.JPanel Pnl_Principal;
    private javax.swing.JPanel Pnl_Programar;
    private javax.swing.JScrollPane Scp_Codigo1;
    private javax.swing.JScrollPane Scp_Ejercicio1;
    private javax.swing.JScrollPane Scp_Introduccion;
    private javax.swing.JScrollPane ScrollPane_Cuestionario1;
    private javax.swing.JScrollPane ScrollPane_Cuestionario2;
    private javax.swing.JScrollPane ScrollPane_Cuestionario3;
    private javax.swing.JScrollPane ScrollPane_Cuestionario4;
    private javax.swing.JScrollPane ScrollPane_Tema1;
    private javax.swing.JScrollPane ScrollPane_Tema2;
    private javax.swing.JScrollPane ScrollPane_Tema3;
    private javax.swing.JScrollPane ScrollPane_Tema4;
    private javax.swing.JScrollPane ScrollPane_Tema5;
    private javax.swing.JTextArea Txa_Codigo1;
    // End of variables declaration//GEN-END:variables
}
