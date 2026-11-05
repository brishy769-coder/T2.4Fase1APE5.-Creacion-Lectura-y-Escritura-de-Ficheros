import java.io.File;
import java.io.IOException;
 
public class CrearCurso {
    public static void main(String[] args) {
 
        File archivoCurso = new File("curso.txt");
 
        try {
            boolean seCreo = archivoCurso.createNewFile();
 
            if (seCreo) {
                System.out.println("El archivo curso.txt fue creado.");
            } else {
                System.out.println("El archivo curso.txt ya existe.");
            }
 
            System.out.println("Nombre: " + archivoCurso.getName());
 
        } catch (IOException error) {
            System.out.println("Error al crear el archivo.");
        }
    }
}

