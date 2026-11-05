import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirArchivo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Escriba el mensaje: ");
            String mensaje = entrada.nextLine();

            FileWriter escritor = new FileWriter("estudiantes.txt", true);

            escritor.write(mensaje + "\n");

            escritor.close();

            System.out.println("Informacion guardada correctamente.");

        } catch (IOException e) {
            System.out.println("Ocurrio un error al escribir el archivo.");
            e.printStackTrace();

        } finally {
            entrada.close();
        }
    }
}   