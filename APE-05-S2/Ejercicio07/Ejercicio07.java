
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio07 {

    public static void main(String[] args) {

        String archivo = "jugadores.txt";
        String nombreMayor = "";
        double mayorPuntaje = -1;
        double suma = 0;
        int contador = 0;

        System.out.println("=== COMPETENCIA DE VIDEOJUEGOS ===");

        try (BufferedReader lector =
                new BufferedReader(new FileReader(archivo))) {

            String linea;

            System.out.println("\nJugadores con más de 70 puntos:");

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(",");

                if (datos.length != 2) {
                    System.out.println("Registro inválido: " + linea);
                    continue;
                }

                try {
                    String nombre = datos[0].trim();
                    double puntaje = Double.parseDouble(datos[1].trim());

                    if (nombre.isEmpty() || puntaje < 0) {
                        System.out.println("Registro inválido: " + linea);
                        continue;
                    }

                    suma += puntaje;
                    contador++;

                    if (puntaje > mayorPuntaje) {
                        mayorPuntaje = puntaje;
                        nombreMayor = nombre;
                    }

                    if (puntaje > 70) {
                        System.out.println(nombre + " - " + puntaje);
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Puntaje inválido: " + linea);
                }
            }

            if (contador > 0) {
                double promedio = suma / contador;

                System.out.println("\n=== RESULTADOS ===");
                System.out.println("Promedio: " + promedio);
                System.out.println("Mayor puntaje: " + mayorPuntaje);
                System.out.println("Jugador ganador: " + nombreMayor);
                System.out.println("Jugadores registrados: " + contador);
            } else {
                System.out.println("No existen registros válidos.");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

