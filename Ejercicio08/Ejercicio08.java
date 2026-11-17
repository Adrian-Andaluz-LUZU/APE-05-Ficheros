
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String archivo = "temperaturas.txt";
        double suma = 0;
        double mayor = Double.NEGATIVE_INFINITY;
        int contador = 0;
        int superiores = 0;

        System.out.println("=== CONTROL DE TEMPERATURA ===");

        // Guardar nuevas temperaturas
        try (BufferedWriter escritor =
                new BufferedWriter(new FileWriter(archivo, true))) {

            System.out.print("¿Cuántas temperaturas desea registrar? ");
            int cantidad = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <= cantidad; i++) {

                System.out.print("Ingrese la temperatura " + i + ": ");
                String dato = sc.nextLine();

                try {
                    double temperatura = Double.parseDouble(dato);

                    escritor.write(String.valueOf(temperatura));
                    escritor.newLine();

                } catch (NumberFormatException e) {
                    System.out.println("Temperatura inválida. No se guardó.");
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar una cantidad válida.");
            sc.close();
            return;

        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
            sc.close();
            return;
        }

        // Leer las temperaturas almacenadas
        try (BufferedReader lector =
                new BufferedReader(new FileReader(archivo))) {

            String linea;

            System.out.println("\nTemperaturas registradas:");

            while ((linea = lector.readLine()) != null) {

                try {
                    double temperatura = Double.parseDouble(linea.trim());

                    System.out.println(temperatura + " °C");

                    suma += temperatura;
                    contador++;

                    if (temperatura > mayor) {
                        mayor = temperatura;
                    }

                    if (temperatura > 30) {
                        superiores++;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Dato inválido: " + linea);
                }
            }

            // Mostrar resultados
            if (contador > 0) {

                double promedio = suma / contador;

                System.out.println("\n=== RESULTADOS ===");
                System.out.println("Promedio: " + promedio + " °C");
                System.out.println("Temperatura más alta: " + mayor + " °C");
                System.out.println("Temperaturas superiores a 30 °C: "
                        + superiores);

                System.out.println("Total de registros válidos: " + contador);

            } else {
                System.out.println("No existen temperaturas válidas.");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        sc.close();
    }
}

