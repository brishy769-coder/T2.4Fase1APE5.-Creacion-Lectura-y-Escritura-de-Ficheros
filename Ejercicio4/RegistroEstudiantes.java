
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroEstudiantes {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            FileWriter archivo = new FileWriter("estudiantes.txt");
            BufferedWriter escritor = new BufferedWriter(archivo);

            for (int i = 1; i <= 3; i++) {

                System.out.println("ESTUDIANTE " + i);

                System.out.print("Ingrese el nombre: ");
                String nombre = teclado.nextLine();

                System.out.print("Ingrese la calificacion: ");
                double calificacion = teclado.nextDouble();
                teclado.nextLine();

                escritor.write("Nombre: " + nombre);
                escritor.newLine();

                escritor.write("Calificacion: " + calificacion);
                escritor.newLine();
            }

            escritor.close();

            System.out.println("\nDatos guardados correctamente en estudiantes.txt");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        teclado.close();
    }
}
