import java.io.*;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        String nombreArchivo = "ventas.txt";
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE VENTAS - CAFETERÍA ---");
            System.out.println("1. Registrar nueva venta (Producto,Precio)");
            System.out.println("2. Leer ventas, calcular total y ver el más caro");
            System.out.println("3. Filtrar productos que superen un valor");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Ingrese el precio (ej. 2.50): ");
                    try {
                        double precio = Double.parseDouble(scanner.nextLine());
                        if (precio < 0) {
                            System.out.println("El precio no puede ser negativo.");
                            break;
                        }
                        // Usamos BufferedWriter con append en true
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
                            writer.write(producto + "," + precio);
                            writer.newLine();
                            System.out.println("¡Venta registrada con éxito!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debe ingresar un número decimal válido para el precio.");
                    } catch (IOException e) {
                        System.out.println("Error al guardar la venta: " + e.getMessage());
                    }
                    break;

                case 2:
                    File archivo = new File(nombreArchivo);
                    if (!archivo.exists() || archivo.length() == 0) {
                        System.out.println("No hay ventas registradas todavía.");
                        break;
                    }

                    double totalVentas = 0;
                    double mayorPrecio = -1;
                    String productoMasCaro = "";
                    int contadorVentas = 0;

                    try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
                        String linea;
                        System.out.println("\n--- LISTA DE VENTAS ---");
                        while ((linea = reader.readLine()) != null) {
                            String[] partes = linea.split(",");
                            if (partes.length == 2) {
                                String prod = partes[0];
                                double precio = Double.parseDouble(partes[1]);
                                
                                System.out.println("- " + prod + ": $" + precio);
                                totalVentas += precio;
                                contadorVentas++;

                                if (precio > mayorPrecio) {
                                    mayorPrecio = precio;
                                    productoMasCaro = prod;
                                }
                            }
                        }
                        System.out.println("------------------------");
                        System.out.println("Total de transacciones: " + contadorVentas);
                        System.out.println("Monto total de ventas: $" + totalVentas);
                        if (contadorVentas > 0) {
                            System.out.println("Producto más caro: " + productoMasCaro + " ($" + mayorPrecio + ")");
                        }
                    } catch (IOException | NumberFormatException e) {
                        System.out.println("Error al procesar el archivo de ventas: " + e.getMessage());
                    }
                    break;

                case 3:
                    File archivoFiltro = new File(nombreArchivo);
                    if (!archivoFiltro.exists() || archivoFiltro.length() == 0) {
                        System.out.println("No hay ventas registradas todavía.");
                        break;
                    }

                    System.out.print("Ingrese el valor mínimo de filtro ($): ");
                    try {
                        double valorMinimo = Double.parseDouble(scanner.nextLine());
                        System.out.println("\n--- PRODUCTOS QUE SUPERAN $" + valorMinimo + " ---");
                        boolean encontrado = false;

                        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
                            String linea;
                            while ((linea = reader.readLine()) != null) {
                                String[] partes = linea.split(",");
                                if (partes.length == 2) {
                                    String prod = partes[0];
                                    double precio = Double.parseDouble(partes[1]);
                                    if (precio > valorMinimo) {
                                        System.out.println("- " + prod + ": $" + precio);
                                        encontrado = true;
                                    }
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Ningún producto supera ese valor.");
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, ingrese un número válido.");
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
