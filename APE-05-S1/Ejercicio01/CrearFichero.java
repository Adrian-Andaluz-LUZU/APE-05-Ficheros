import java.io.File;
import java.io.IOException;

public class CrearFichero {
    public static void main(String[] args) {
        // Crear un objeto de tipo File con el nombre del archivo
        File archivo = new File("curso.txt");

        try {
            // Utilizar createNewFile() para crear el archivo
            if (archivo.createNewFile()) {
                System.out.println("¡El archivo se creó correctamente!");
                // Mostrar el nombre del archivo utilizando getName()
                System.out.println("Nombre del fichero: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe en el directorio.");
                System.out.println("Nombre del fichero: " + archivo.getName());
            }
        } catch (IOException e) {
            // Controlar posibles errores de E/S
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
    }
}