
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroVentas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double totalAcumulado = 0;

        try {
            // Append permite conservar las ventas anteriores
            FileWriter archivo = new FileWriter("ventas.txt", true);
            BufferedWriter escritor = new BufferedWriter(archivo);

            while (true) {

                System.out.print("Ingrese el nombre del producto (fin para terminar): ");
                String nombre = teclado.nextLine();

                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Ingrese el precio: ");
                double precio = teclado.nextDouble();

                System.out.print("Ingrese la cantidad vendida: ");
                int cantidad = teclado.nextInt();
                teclado.nextLine();

                double subtotal = precio * cantidad;
                double descuento = 0;

                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }

                double totalPagar = subtotal - descuento;

                totalAcumulado += totalPagar;

                System.out.println("\nSubtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + totalPagar);

                // Guardar los datos de la venta
                escritor.write("Producto: " + nombre);
                escritor.newLine();

                escritor.write("Precio: $" + precio);
                escritor.newLine();

                escritor.write("Cantidad: " + cantidad);
                escritor.newLine();

                escritor.write("Subtotal: $" + subtotal);
                escritor.newLine();

                escritor.write("Descuento: $" + descuento);
                escritor.newLine();

                escritor.write("Total a pagar: $" + totalPagar);
                escritor.newLine();

                escritor.write("-------------------------");
                escritor.newLine();
            }

            // Guardar el total acumulado
            escritor.write("TOTAL ACUMULADO: $" + totalAcumulado);
            escritor.newLine();
            escritor.write("=========================");
            escritor.newLine();

            escritor.close();

            System.out.println("\nREGISTRO FINALIZADO");
            System.out.println("Total acumulado de ventas: $" + totalAcumulado);
            System.out.println("Datos guardados en ventas.txt");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        teclado.close();
    }
}
