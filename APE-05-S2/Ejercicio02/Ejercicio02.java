import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {
    public static void main(String[] args) {
        String nombreArchivo = "mensaje.txt";
        int totalCaracteres = 0;
        int codigoCaracter;

        System.out.println("=== DESCIFRANDO MENSAJE DE EMERGENCIA ===");
        System.out.print("Contenido del mensaje: ");

        try (FileReader fr = new FileReader(nombreArchivo)) {
            // fr.read() lee un caracter a la vez y retorna -1 cuando llega al final del archivo
            while ((codigoCaracter = fr.read()) != -1) {
                char caracter = (char) codigoCaracter;
                System.out.print(caracter);
                totalCaracteres++;
            }
            System.out.println("\n-------------------------------------------");
            System.out.println("Numero total de caracteres leidos: " + totalCaracteres);

        } catch (IOException e) {
            System.err.println("Error al leer el archivo " + nombreArchivo + ": " + e.getMessage());
        }
    }
}
