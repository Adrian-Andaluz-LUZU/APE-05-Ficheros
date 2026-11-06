import java.io.File;
import java.io.IOException;

public class Ejercicio07 {
    public static void main(String[] args) {
        // Crear un objeto File con la ruta especificada
        File archivo = new File("datos/prueba.txt");

        try {
            // 1 y 2. Comprobación previa y creación controlada
            // Aseguramos que la carpeta contenedora "datos" exista previamente
            File carpeta = archivo.getParentFile();
            if (carpeta != null && !carpeta.exists()) {
                carpeta.mkdirs();
            }

            if (archivo.exists()) {
                System.out.println("El archivo ya existe en el disco.");
            } else {
                if (archivo.createNewFile()) {
                    System.out.println("El archivo se creó exitosamente.");
                }
            }

            // 3. Extracción de información (metadatos)
            System.out.println("Nombre del último componente de la ruta (getName): " + archivo.getName());
            System.out.println("Ruta completa o relativa del objeto (getPath): " + archivo.getPath());

        } catch (IOException e) {
            // Gestión obligatoria de la excepción de E/S
            System.out.println("Ocurrió un error de E/S al gestionar el archivo: " + e.getMessage());
        }
    }
}
