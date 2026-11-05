import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad disponible: ");
        int cantidad = scanner.nextInt();

        // Calcular el valor total
        double valorTotal = precio * cantidad;

        try {
            // FileWriter con 'true' para activar el modo append
            BufferedWriter bw = new BufferedWriter(new FileWriter("productos.txt", true));

            bw.write("Producto: " + producto + " | Precio: " + precio + " | Cantidad: " + cantidad + " | Total: " + valorTotal);
            bw.newLine();
            
            bw.close();
            System.out.println("¡Producto registrado con éxito! Valor total: " + valorTotal);

        } catch (IOException e) {
            System.out.println("Error al guardar el producto: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
