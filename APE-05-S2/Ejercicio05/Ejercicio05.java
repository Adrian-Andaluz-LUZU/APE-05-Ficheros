import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio05 {
    static final String NOMBRE_ARCHIVO = "libros.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n=== BIBLIOTECA INTELIGENTE ===");
            System.out.println("1. Registrar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Contar libros");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1: registrarLibro(sc); break;
                case 2: listarLibros(); break;
                case 3: buscarLibro(sc); break;
                case 4: contarLibros(); break;
                case 5: System.out.println("Hasta pronto."); break;
                default: System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);

        sc.close();
    }

    // Agrega al final sin borrar los registros anteriores (append = true)
    static void registrarLibro(Scanner sc) {
        System.out.print("Titulo del libro: ");
        String titulo = sc.nextLine().trim();

        if (titulo.isEmpty()) {
            System.out.println("El titulo no puede estar vacio.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO, true))) {
            bw.write(titulo);
            bw.newLine();
            System.out.println("Libro registrado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    static void listarLibros() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("El archivo " + NOMBRE_ARCHIVO + " no existe todavia.");
            return;
        }

        System.out.println("\n--- LIBROS REGISTRADOS ---");
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int numero = 1;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                System.out.println(numero + ". " + linea);
                numero++;
            }
            if (numero == 1) {
                System.out.println("No hay libros registrados.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    static void buscarLibro(Scanner sc) {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("El archivo " + NOMBRE_ARCHIVO + " no existe todavia.");
            return;
        }

        System.out.print("Titulo a buscar: ");
        String buscado = sc.nextLine().trim();
        boolean encontrado = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().equalsIgnoreCase(buscado)) {
                    encontrado = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        if (encontrado) {
            System.out.println("El libro \"" + buscado + "\" SI esta registrado.");
        } else {
            System.out.println("El libro \"" + buscado + "\" NO esta registrado.");
        }
    }

    static void contarLibros() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("El archivo " + NOMBRE_ARCHIVO + " no existe todavia.");
            return;
        }

        int total = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) total++;
            }
            System.out.println("Total de libros registrados: " + total);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}