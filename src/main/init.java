package main;

import java.io.IOException;
import javax.swing.JOptionPane;
import judge.CompareAndJudge;
import static judge.CompileAndRun.*;

public class init {

    public static void main(String[] args) {
        if (compileRunCompareJudge("ejercicio1", "")) {
            System.out.println("habilitar de nuevo botones");
        }
    }

    public static boolean compileRunCompareJudge(String problem, String code) {
        
        //replaceCode(code);
        try {
            // compilar archivo
            String findURL = System.getProperty("user.dir") + "\\src\\judge\\Main.java";
            System.out.println(findURL);
            int result = compile(findURL);
            if (result != 0) {
                JOptionPane.showMessageDialog(null, "Compilation Error");
                return true;
            } else {
            }
            System.out.println("Compilador de java (javac) retorna un " + result);

            // Ejecutar archivo
            result = run("judge.Main");
            if (result != 0) {
                JOptionPane.showMessageDialog(null, "Runtime Error");
                return true;
            } else {
            }
            System.out.println("Ejecutable java (java judge.Main) retorna un " + result);
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
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
