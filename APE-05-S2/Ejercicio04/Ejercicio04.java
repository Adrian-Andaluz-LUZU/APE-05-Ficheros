import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio04 {
    public static void main(String[] args) {
        String nombreArchivo = "resultados.txt";
        int puntajeTotal = 0;
        int puntajeMaximo = Integer.MIN_VALUE;
        String ganador = "";
        int totalParticipantes = 0;

        System.out.println("=== RESULTADOS DEL PARQUE DE AVENTURAS ===");

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;

                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String nombre = partes[0].trim();
                    int puntaje = Integer.parseInt(partes[1].trim());

                    System.out.println("Participante: " + nombre + " - Puntaje: " + puntaje);

                    puntajeTotal += puntaje;
                    totalParticipantes++;

                    if (puntaje > puntajeMaximo) {
                        puntajeMaximo = puntaje;
                        ganador = nombre;
                    }
                }
            }

            System.out.println("\n-------------------------------------------");
            System.out.println("Total de participantes: " + totalParticipantes);
            System.out.println("Puntaje acumulado total: " + puntajeTotal);
            if (totalParticipantes > 0) {
                System.out.println("Puntaje mas alto: " + puntajeMaximo + " (Participante: " + ganador + ")");
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo " + nombreArchivo + ": " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error en la conversion de puntaje numérico: " + e.getMessage());
        }
    }
}