import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichero {
    public static void main(String[] args) {
        // Crear un objeto Scanner para ingresar información por teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escribe un mensaje para guardar en el archivo: ");
        String mensaje = scanner.nextLine();

        try {
            // Utilizar FileWriter abriendo el archivo. 
            // El parámetro 'true' sirve para conservar la información anterior y agregar el texto al final (modo append).
            FileWriter escritor = new FileWriter("estudiantes.txt", true);
            
            // Utilizar write() para guardar el mensaje (añadimos un salto de línea \n por prolijidad)
            escritor.write(mensaje + "\n");
            
            // Cerrar el archivo utilizando close()
            escritor.close();
            
            // Mostrar mensaje de éxito
            System.out.println("La información se guardó correctamente.");
            
        } catch (IOException e) {
            // Controlar posibles errores mediante try-catch
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}