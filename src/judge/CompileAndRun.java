package judge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class CompileAndRun {

    static public void replaceCode(String code) {
        String oldFileName = "Main.java";
        String tmpFileName = "Main.java";
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(oldFileName));
            bw = new BufferedWriter(new FileWriter(tmpFileName));
            String line;
            bw.write(code);
        } catch (IOException e) {
            return;
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
            }
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
            }
        }
        File oldFile = new File(oldFileName);
        oldFile.delete();
        File newFile = new File(tmpFileName);
        newFile.renameTo(oldFile);
    }

    static public void replace() {
        String oldFileName = "Main.java";
        String tmpFileName = "Main.java";
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(oldFileName));
            bw = new BufferedWriter(new FileWriter(tmpFileName));
            String line;
            bw.write("package judge;\n"
                    + "\n"
                    + "public class Main {\n"
                    + "\n"
                    + "    public static void main(String[] args)  {\n"
                    + "        System.out.println(\"Hola mundo!\");\n"
                    + "    }\n"
                    + "}\n"
                    + "");
        } catch (IOException e) {
            return;
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
            }
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
            }
        }
        File oldFile = new File(oldFileName);
        oldFile.delete();
        File newFile = new File(tmpFileName);
        newFile.renameTo(oldFile);
    }

    static public int run(String clazz) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("java", clazz);
        pb.redirectError();
        pb.directory(new File("src"));
        Process p = pb.start();
        InputStreamConsumer consumer = new InputStreamConsumer(p.getInputStream());
        consumer.start();
        int result = p.waitFor();
        consumer.join();
        System.out.println(consumer.getOutput());
        String writteable = consumer.getOutput().toString();
        try (FileWriter fw = new FileWriter(System.getProperty("user.dir") + "\\src\\IOfiles\\output.txt")) {
            fw.write(writteable);
            System.out.println("Archivo de salida correctamente creado");
        }

        return result;
    }

    static public int compile(String file) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("javac", file);
        pb.redirectError();
        pb.directory(new File("src"));
        Process p = pb.start();
        InputStreamConsumer consumer = new InputStreamConsumer(p.getInputStream());
        consumer.start();
        int result = p.waitFor();
        consumer.join();
        System.out.println(consumer.getOutput());
        return result;
    }

    static public class InputStreamConsumer extends Thread {

        private final InputStream is;
        private IOException exp;
        private StringBuilder output;

        public InputStreamConsumer(InputStream is) {
            this.is = is;
        }

        @Override
        public void run() {
            int in = -1;
            output = new StringBuilder(64);
            try {
                while ((in = is.read()) != -1) {
                    output.append((char) in);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                exp = ex;
            }
        }

        public StringBuilder getOutput() {
            return output;
        }

        public IOException getException() {
            return exp;
        }
    }
}
