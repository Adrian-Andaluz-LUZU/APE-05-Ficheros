import java.io.File;

public class EliminarFichero {
    public static void main(String[] args) {
        // Crear un objeto de tipo File indicando el nombre del archivo a eliminar
        File archivo = new File("estudiantes.txt");

        // Utilizar el método delete() dentro de una estructura condicional
        if (archivo.delete()) {
            // Si el archivo se eliminó, mostrar mensaje de confirmación
            System.out.println("El archivo " + archivo.getName() + " se eliminó correctamente.");
        } else {
            // Si no se pudo eliminar, mostrar un mensaje indicando el problema
            System.out.println("No se pudo eliminar el archivo. Es posible que no exista o esté en uso.");
        }
    }
}
