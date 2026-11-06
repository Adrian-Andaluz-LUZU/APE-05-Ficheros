import java.io.File;
import java.io.IOException;

public class Ejercicio10 {
    public static void main(String[] args) {
        // 1. Construir un objeto File que represente la ruta "datos/temporal.txt"
        File archivo = new File("datos/temporal.txt");

        try {
            // Verificar y crear el directorio "datos" si no existe
            File carpeta = archivo.getParentFile();
            if (carpeta != null && !carpeta.exists()) {
                carpeta.mkdirs();
            }

            // 2. Consultar el estado y crearlo de forma segura controlando IOException
            if (!archivo.exists()) {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo temporal creado de forma segura.");
                }
            } else {
                System.out.println("El archivo temporal ya existe.");
            }

            // 3. Implementar fase de validación con una variable de control booleana
            boolean confirmarBorrado = true; // Simula la confirmación del usuario

            // 4. Utilizar el método delete() exclusivamente si dicha confirmación es verdadera
            if (confirmarBorrado) {
                boolean resultadoEliminacion = archivo.delete();
                // Imprimir por consola el resultado booleano de la operación de eliminación
                System.out.println("Resultado booleano de la operación de eliminación: " + resultadoEliminacion);
            } else {
                System.out.println("La operación de borrado no fue confirmada.");
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error de E/S: " + e.getMessage());
        }
    }
}
