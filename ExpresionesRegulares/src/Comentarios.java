import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comentarios {
    public static void extraerComentarios(String codigo) {
        String regexComentario = "//.*|/\\*(?:.|[\\n\\r])*?\\*/";
        Pattern patron = Pattern.compile(regexComentario);
        Matcher matcher = patron.matcher(codigo);

        System.out.println("\nComentarios encontrados:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

