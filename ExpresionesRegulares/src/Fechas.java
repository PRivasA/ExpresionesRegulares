import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fechas {
    public static void validarFecha(String fecha) {
        String regexFecha = "^(0[1-9]|1[0-2])/([0-2][0-9]|3[01])/([0-9]{4})$";
        Pattern patron = Pattern.compile(regexFecha);
        Matcher matcher = patron.matcher(fecha);

        if (matcher.matches()) {
            System.out.println("\nLa fecha " + fecha + " es válida.");
        } else {
            System.out.println("\nLa fecha " + fecha + " es inválida.");
        }
    }
}
