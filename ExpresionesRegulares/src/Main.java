import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Extraer correos electrónicos");
            System.out.println("2. Extraer comentarios de código");
            System.out.println("3. Validar fechas (mm/dd/yyyy)");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1":
                    System.out.println("\nIngrese el texto para extraer correos electrónicos:");
                    String texto = scanner.nextLine();
                    CorreoElectronico.extraerCorreosElectronicos(texto);
                    break;

                case "2":
                    System.out.println("\nIngrese el código fuente para extraer comentarios:");
                    String codigoFuente = scanner.nextLine();
                    Comentarios.extraerComentarios(codigoFuente);
                    break;

                case "3":
                    System.out.println("\nIngrese la fecha en formato mm/dd/yyyy:");
                    String fecha = scanner.nextLine();
                    Fechas.validarFecha(fecha);
                    break;

                case "4":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
            }
        } while (!opcion.equals("4"));

        scanner.close();
    }
}

