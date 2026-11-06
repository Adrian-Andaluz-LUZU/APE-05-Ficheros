import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio08 {
    public static void main(String[] args) {
        try {
            // 1. Configurar flujo de salida con BufferedWriter enlazado con un FileWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter("materias.txt"));

            // 2. Escribir un listado de cinco asignaturas
            // 3. Emplear newLine() para asegurar que cada asignatura quede en una línea independiente
            bw.write("Algoritmos y Logica de Programacion");
            bw.newLine();
            bw.write("Calculo Diferencial");
            bw.newLine();
            bw.write("Fisica Vectorial");
            bw.newLine();
            bw.write("Algebra Lineal");
            bw.newLine();
            bw.write("Ingles B1");
            bw.newLine();

            // 4. Liberar los recursos invocando close()
            bw.close();
            System.out.println("El archivo 'materias.txt' se generó y escribió correctamente.");

        } catch (IOException e) {
            // Controlar cualquier error potencial de escritura mediante IOException
            System.out.println("Error de E/S durante la escritura del archivo: " + e.getMessage());
        }
    }
}
