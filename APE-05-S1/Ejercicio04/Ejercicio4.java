import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Abrir archivo (true para acumular si se desea, o sobrescribir según convenga)
            BufferedWriter bw = new BufferedWriter(new FileWriter("estudiantes.txt", true));

            for (int i = 1; i <= 3; i++) {
                System.out.println("--- Estudiante " + i + " ---");
                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Ingrese la calificacion: ");
                String calificacion = scanner.nextLine();

                // Guardar en dos líneas por estudiante
                bw.write("Nombre: " + nombre);
                bw.newLine();
                bw.write("Calificacion: " + calificacion);
                bw.newLine();
            }

            bw.close();
            System.out.println("¡Datos de los estudiantes guardados correctamente en estudiantes.txt!");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
