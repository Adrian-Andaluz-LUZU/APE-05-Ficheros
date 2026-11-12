import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio03 {
    public static void main(String[] args) {
        String nombreArchivo = "obras.txt";
        Map<String, Integer> conteoCategorias = new HashMap<>();

        System.out.println("=== REGISTRO DE OBRAS DE ARTE DEL MUSEO ===");

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue; // Ignorar lineas vacias

                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String obra = partes[0].trim();
                    String categoria = partes[1].trim();

                    System.out.println("Obra: " + obra + " | Categoria: " + categoria);

                    // Acumular la cantidad por categoria
                    conteoCategorias.put(categoria, conteoCategorias.getOrDefault(categoria, 0) + 1);
                }
            }

            System.out.println("\n=== CLASIFICACION POR CATEGORIA ===");
            for (Map.Entry<String, Integer> entry : conteoCategorias.entrySet()) {
                System.out.println("Categoria '" + entry.getKey() + "': " + entry.getValue() + " obra(s)");
            }

        } catch (IOException e) {
            System.err.println("Error al procesar el archivo " + nombreArchivo + ": " + e.getMessage());
        }
    }
}