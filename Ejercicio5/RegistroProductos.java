
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroProductos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            // true permite agregar sin borrar los datos anteriores
            FileWriter archivo = new FileWriter("productos.txt", true);
            BufferedWriter escritor = new BufferedWriter(archivo);

            System.out.print("Ingrese el nombre del producto: ");
            String nombre = teclado.nextLine();

            System.out.print("Ingrese el precio: ");
            double precio = teclado.nextDouble();

            System.out.print("Ingrese la cantidad disponible: ");
            int cantidad = teclado.nextInt();

            double total = precio * cantidad;

            escritor.write("Producto: " + nombre);
            escritor.newLine();

            escritor.write("Precio: $" + precio);
            escritor.newLine();

            escritor.write("Cantidad: " + cantidad);
            escritor.newLine();

            escritor.write("Valor total: $" + total);
            escritor.newLine();

            escritor.write("-------------------------");
            escritor.newLine();

            escritor.close();

            System.out.println("\nProducto guardado correctamente.");
            System.out.println("Valor total: $" + total);

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        teclado.close();
    }
}
