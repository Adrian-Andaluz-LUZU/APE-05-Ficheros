import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalAcumulado = 0;

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ventas.txt", true));
            System.out.println("=== SISTEMA DE VENTAS (Escribe 'fin' en el nombre para terminar) ===");

            while (true) {
                System.out.print("\nIngrese el nombre del producto (o 'fin' para salir): ");
                String producto = scanner.nextLine();

                if (producto.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Ingrese el precio: ");
                double precio = Double.parseDouble(scanner.nextLine());

                System.out.print("Ingrese la cantidad vendida: ");
                int cantidad = Integer.parseInt(scanner.nextLine());

                // Calcular subtotal
                double subtotal = precio * cantidad;
                double totalPagar = subtotal;

                // Aplicar descuento del 10% si es mayor o igual a $100
                if (subtotal >= 100) {
                    totalPagar = subtotal * 0.90;
                    System.out.println("¡Se aplicó un 10% de descuento!");
                }

                System.out.println("Total a pagar por este producto: $" + totalPagar);
                totalAcumulado += totalPagar;

                // Guardar venta en el archivo
                bw.write("Venta - Producto: " + producto + " | Subtotal: $" + subtotal + " | Total con descuento: $" + totalPagar);
                bw.newLine();
            }

            // Al finalizar, guardar el total acumulado de las ventas
            bw.write("=== TOTAL ACUMULADO DE VENTAS: $" + totalAcumulado + " ===");
            bw.newLine();
            
            bw.close();
            System.out.println("\n¡Todas las ventas se guardaron correctamente! Total acumulado: $" + totalAcumulado);

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo de ventas: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
