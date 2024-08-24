import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorreoElectronico {
    public static void extraerCorreosElectronicos(String texto) {
        String regexCorreo = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        Pattern patron = Pattern.compile(regexCorreo);
        Matcher matcher = patron.matcher(texto);

        System.out.println("Correos electrónicos encontrados:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
