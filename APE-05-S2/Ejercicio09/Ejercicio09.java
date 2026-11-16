import java.io.*;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        String nombreArchivo = "descubrimientos.txt";
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- DIARIO DE EXPLORADORES ---");
            System.out.println("1. Escribir / Agregar un descubrimiento");
            System.out.println("2. Leer registros y contar");
            System.out.println("3. Buscar un descubrimiento");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nuevo descubrimiento: ");
                    String nuevoDescubrimiento = scanner.nextLine();
                    // Usamos true para activar el modo append (agregar al final)
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
                        writer.write(nuevoDescubrimiento);
                        writer.newLine();
                        System.out.println("¡Descubrimiento agregado con éxito!");
                    } catch (IOException e) {
                        System.out.println("Error al escribir en el archivo: " + e.getMessage());
                    }
                    break;

                case 2:
                    File archivo = new File(nombreArchivo);
                    if (!archivo.exists() || archivo.length() == 0) {
                        System.out.println("El archivo no existe o está vacío.");
                        break;
                    }
                    
                    System.out.println("\n--- REGISTROS DE DESCUBRIMIENTOS ---");
                    try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
                        String linea;
                        int contador = 0;
                        while ((linea = reader.readLine()) != null) {
                            contador++;
                            System.out.println(contador + ". " + linea);
                        }
                        System.out.println("Total de descubrimientos registrados: " + contador);
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo: " + e.getMessage());
                    }
                    break;

                case 3:
                    File archivoBuscar = new File(nombreArchivo);
                    if (!archivoBuscar.exists() || archivoBuscar.length() == 0) {
                        System.out.println("El archivo no existe o está vacío.");
                        break;
                    }

                    System.out.print("Ingrese el texto o nombre a buscar: ");
                    String busqueda = scanner.nextLine().toLowerCase();
                    boolean encontrado = false;

                    try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
                        String linea;
                        int lineaNum = 0;
                        while ((linea = reader.readLine()) != null) {
                            lineaNum++;
                            if (linea.toLowerCase().contains(busqueda)) {
                                System.out.println("Encontrado en la línea " + lineaNum + ": " + linea);
                                encontrado = true;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró ninguna coincidencia.");
                        }
                    } catch (IOException e) {
                        System.out.println("Error al buscar en el archivo: " + e.getMessage());
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
