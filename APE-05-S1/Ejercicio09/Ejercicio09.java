import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio09 {
    public static void main(String[] args) {
        try {
            // 1. Abrir el fichero existente configurando FileWriter en modo de adición (append = true)
            BufferedWriter bw = new BufferedWriter(new FileWriter("materias.txt", true));

            // 2. Añadir dos nuevas asignaturas al final utilizando newLine()
            bw.write("Matematicas Discretas");
            bw.newLine();
            bw.write("Tecnologias de la Informacion");
            bw.newLine();

            // 3. Asegurarse de cerrar el flujo con close()
            bw.close();
            System.out.println("Se añadieron las dos nuevas asignaturas conservando los registros anteriores.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al modificar el archivo: " + e.getMessage());
        }
    }
}
