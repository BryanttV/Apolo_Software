package Main;

import java.io.IOException;
import javax.swing.JOptionPane;
import Judge.CompareAndJudge;
import static Judge.CompileAndRun.*;

public class init {

    public static void juzgador(String id, String code) {
        String codigo = "import java.util.Scanner;\n"
                + "\n"
                + "public class Main {\n"
                + "\n"
                + "    public static void main(String[] args) {\n"
                + "        Scanner sc = new Scanner(System.in);\n"
                + "\n"
                + "        int casos = sc.nextInt();\n"
                + "\n"
                + "        for (int i = 0; i < casos; i++) {\n"
                + "            int a = sc.nextInt();\n"
                + "            int b = sc.nextInt();\n"
                + "\n"
                + "            System.out.println(a + b);\n"
                + "        }\n"
                + "    }\n"
                + "}";
        if (compileRunCompareJudge(id, code)) {
            System.out.println("habilitar de nuevo botones");
        }
    }

    public static boolean compileRunCompareJudge(String problem, String code) {

        replaceCode(code);
        try {
            // Obtener URL
            String findURL = System.getProperty("user.dir") + "\\src\\Judge\\Main.java";
            System.out.println("findUrl " + findURL);

            // Compilar Archivo
            int result = compile(findURL);
            if (result != 0) {
                JOptionPane.showMessageDialog(null, "Compilation Error");
                return true;
            }

            System.out.println("Compilador de java (javac) retorna un " + result);

            // Ejecutar archivo
            result = run("judge.Main");
            if (result != 0) {
                JOptionPane.showMessageDialog(null, "Runtime Error");
                return true;
            }

            System.out.println("Ejecutable java (java judge.Main) retorna un " + result);

        } catch (IOException | InterruptedException ex) {
            System.out.println("Error " + ex);
        }

        switch (CompareAndJudge.compareUtil(problem)) {
            case 0:
                JOptionPane.showMessageDialog(null, "Accepted");
                return true;
            case 1:
                JOptionPane.showMessageDialog(null, "Presentation Error");
                return true;
            default:
                JOptionPane.showMessageDialog(null, "Wrong Answer");
                return true;
        }
    }
}
