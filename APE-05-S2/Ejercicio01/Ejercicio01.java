import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio01 {
    public static void main(String[] args) {
        String nombreArchivo = "pistas.txt";
        int contadorPistas = 0;

        System.out.println("=== ANALISIS DE PISTAS DE LA INVESTIGACION ===");

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contadorPistas++;
                System.out.println("Pista " + contadorPistas + ": " + linea);
            }
            System.out.println("\n-------------------------------------------");
            System.out.println("Total de pistas encontradas: " + contadorPistas);

        } catch (IOException e) {
            System.err.println("Error al leer el archivo " + nombreArchivo + ": " + e.getMessage());
        }
    }
}