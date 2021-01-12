
public class ReemplazarCodigo {

    public static String reemplazar(String code) {
        String nuevoCodigo = "package editor;\nimport java.io.*;\n" + code;
        nuevoCodigo = nuevoCodigo.replace("(System.in)", "(new File(System.getProperty(\"user.dir\") + \"\\\\editor\\\\input.txt\"))");
        nuevoCodigo = nuevoCodigo.replace("args)", "args) throws Exception");
        return nuevoCodigo;
    }
}
