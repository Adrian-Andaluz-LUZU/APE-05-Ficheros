import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio06 {
    static final String NOMBRE_ARCHIVO = "secreto.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n=== SISTEMA DE MENSAJES SECRETOS ===");
            System.out.println("1. Escribir mensaje");
            System.out.println("2. Leer mensajes");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1: escribirMensaje(sc); break;
                case 2: leerMensajes(); break;
                case 3: System.out.println("Sesion finalizada."); break;
                default: System.out.println("Opcion no valida.");
            }
        } while (opcion != 3);

        sc.close();
    }

    // FileWriter con append = true para NO sobrescribir los mensajes anteriores
    static void escribirMensaje(Scanner sc) {
        System.out.print("Escriba el mensaje secreto: ");
        String mensaje = sc.nextLine().trim();

        if (mensaje.isEmpty()) {
            System.out.println("El mensaje no puede estar vacio.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO, true))) {
            bw.write(mensaje);
            bw.newLine();
            System.out.println("Mensaje guardado.");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        }
    }

    static void leerMensajes() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("Aun no existe el archivo " + NOMBRE_ARCHIVO + ".");
            return;
        }

        System.out.println("\n--- MENSAJES SECRETOS ---");
        int totalLineas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                totalLineas++;
                System.out.println(totalLineas + ": " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
            return;
        }

        System.out.println("-------------------------");
        System.out.println("Total de lineas registradas: " + totalLineas);
    }
}
