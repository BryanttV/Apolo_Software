package Principal;

public class ReemplazarCodigo {

    public static String reemplazar(String code, int num) {
        String nuevoCodigo = "";
        if (num == 1) {
            nuevoCodigo = "package editor;\nimport java.io.*;\n" + code;
            nuevoCodigo = nuevoCodigo.replace("(System.in)", "(new File(System.getProperty(\"user.dir\") + \"\\\\editor\\\\input.txt\"))");
            nuevoCodigo = nuevoCodigo.replace("args)", "args) throws Exception");
        } else {
            nuevoCodigo = "package judge;\nimport java.io.*;\n" + code;
            nuevoCodigo = nuevoCodigo.replace("(System.in)", "(new File(System.getProperty(\"user.dir\") + \"\\\\IOFiles\\\\input.txt\"))");
            nuevoCodigo = nuevoCodigo.replace("args)", "args) throws Exception");
        }
        return nuevoCodigo;
    }
}
