import java.io.File;
import java.io.IOException;

public class CrearArchivo {
    public static void main(String[] args) {

        File archivo = new File("curso.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo curso.txt fue creado.");
            } else {
                System.out.println("El archivo curso.txt ya existe.");
            }

            System.out.println("Nombre: " + archivo.getName());

        } catch (IOException e) {
            System.out.println("Ocurrio un error al crear el archivo.");
            e.printStackTrace();
        }
    }
}
