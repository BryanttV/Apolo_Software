package GUI;

import com.Ostermiller.Syntax.HighlightedDocument;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CodeEditor extends JFrame {

    /**
     * The document holding the text being edited.
     */
    private HighlightedDocument document = new HighlightedDocument();
    private String actual = "";

    /**
     * The text pane displaying the document.
     */
    private JTextPane textPane = new JTextPane(document);
    private JPanel panel = new JPanel();

    private class ProblemSelected extends JRadioButtonMenuItem
            implements ActionListener {

        ProblemSelected(String name) {
            super(name);
            addActionListener(this);
        }

        public ProblemSelected() {
        }

        public void actionPerformed(ActionEvent e) {
            actual = e.getSource().toString();
        }
    }

    public CodeEditor() {
        // initial set up that sets the title
        super("Editor de código");
        setLocation(50, 50);

        // Create a scroll pane wrapped around the text pane
        JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setPreferredSize(new Dimension(800, 600));
        panel.setPreferredSize(new Dimension(100, 600));
        JButton runbutton = new JButton("Ejecutar");
        runbutton.setPreferredSize(new Dimension(100, 50));
        JButton pdfbutton = new JButton("Ver PDF");
        pdfbutton.setPreferredSize(new Dimension(100, 50));
        SimpleWebBrowser s= new SimpleWebBrowser();
        //ejecutando navegador propio
        pdfbutton.addActionListener((ActionEvent e) -> {
            //cambiar URL por la necesaria
            s.run("https://www.google.com");
        });

        JButton initbutton = new JButton("Limpiar");
        initbutton.setPreferredSize(new Dimension(100, 50));
        panel.add(runbutton);
        panel.add(pdfbutton);
        panel.add(initbutton);
        // Add the components to the frame.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(scrollPane, BorderLayout.CENTER);
        contentPane.add(panel, BorderLayout.EAST);
        setContentPane(contentPane);

        // Set up the menu bar.
        JMenu styleMenu = createStyleMenu();
        JMenu probMenu = createProblemMenu();
        JMenuBar mb = new JMenuBar();
        mb.add(styleMenu);
        mb.add(probMenu);
        setJMenuBar(mb);

        // Make the window so that it can close the application
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            public void windowActivated(WindowEvent e) {
                // focus magic
                textPane.requestFocus();
            }
        });

        // Put the initial text into the text pane and
        // set it's initial coloring style.
        initDocument();

        // put it all together and show it.
        pack();
        setVisible(true);

    }

    private class StyleMenuItem extends JRadioButtonMenuItem
            implements ActionListener {

        Object style;

        StyleMenuItem(String name, Object style) {
            super(name);
            this.style = style;
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
            document.setHighlightStyle(style);
        }
    }

    private JMenu createStyleMenu() {
        JRadioButtonMenuItem[] items = {
            new StyleMenuItem("Java", HighlightedDocument.JAVA_STYLE)};

        JMenu menu = new JMenu("Lenguaje");
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < items.length; i++) {
            group.add(items[i]);
            menu.add(items[i]);
        }
        return menu;
    }

    private JMenu createProblemMenu() {
        JRadioButtonMenuItem[] items = {
            new ProblemSelected("ejercicio1"),
            new ProblemSelected("ejercicio2"),
            new ProblemSelected("ejercicio3")};

        JMenu menu = new JMenu("Ejercicios");
        ButtonGroup group = new ButtonGroup();
        for (JRadioButtonMenuItem item : items) {
            group.add(item);
            menu.add(item);
        }
        return menu;
    }

    /**
     * Initialize the document with some default text and set they initial type
     * of syntax highlighting.
     */
    private void initDocument() {
        String initString = ("package judge;\n"
                + "\n"
                + "public class Main {\n"
                + "\n"
                + "    public static void main(String[] args)  {\n"
                + "        System.out.println(\"Hola mundo!\");\n"
                + "    }\n"
                + "}");

        textPane.setText(initString);
    }

    public static void main(String[] args) {
        CodeEditor frame = new CodeEditor();
    }
}
