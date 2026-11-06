import java.io.File;
import java.io.IOException;

// APE 5 - java.io - Ejercicio 4: Ciclo de vida completo y borrado seguro
// Integrante: Brishy Ashanga

public class CicloVidaArchivo {

    public static void main(String[] args) {
        File archivo = new File("datos/temporal.txt");

        // crear el archivo solo si no existe
        if (!archivo.exists()) {
            try {
                archivo.getParentFile().mkdirs();
                archivo.createNewFile();
                System.out.println("Archivo creado: " + archivo.getPath());
            } catch (IOException e) {
                System.out.println("No se pudo crear el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo ya existia: " + archivo.getPath());
        }

        // simula que el usuario confirma que quiere borrar
        boolean confirmarBorrado = true;

        if (confirmarBorrado) {
            boolean resultado = archivo.delete();
            System.out.println("Resultado de la eliminacion: " + resultado);
        } else {
            System.out.println("Borrado cancelado, el archivo se conserva");
        }
    }
}
