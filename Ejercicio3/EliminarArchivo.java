import java.io.File;

public class EliminarArchivo {
    public static void main(String[] args) {

        File archivo = new File("estudiantes.txt");

        if (archivo.delete()) {
            System.out.println("estudiantes.txt se elimino correctamente.");
        } else {
            System.out.println("No fue posible eliminar estudiantes.txt.");
        }
    }
}