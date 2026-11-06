import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * APE 5 - java.io - Ejercicio 3: Append vs sobrescribir
 * Estudiante: Paola Sanchez
 * Hay que correr antes el ejercicio 2 para que exista materias.txt
 */
public class AgregarMaterias {

    public static void main(String[] args) {
        try {
            // true = modo append, se escribe al final sin borrar lo anterior
            // si se pone false (o no se pone nada) se borrarian las 5 materias
            BufferedWriter escritor = new BufferedWriter(new FileWriter("materias.txt", true));
            escritor.write("Programacion Orientada a Objetos");
            escritor.newLine();
            escritor.write("Estructura de Datos");
            escritor.newLine();
            escritor.close();
            System.out.println("Se agregaron 2 materias al final de materias.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
