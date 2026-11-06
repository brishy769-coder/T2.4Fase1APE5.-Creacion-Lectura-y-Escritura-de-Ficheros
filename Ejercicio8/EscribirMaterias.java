import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * APE 5 - java.io - Ejercicio 2: Escritura por lineas con BufferedWriter
 * Autor: Dorian Calderon
 */
public class EscribirMaterias {

    public static void main(String[] args) {
        String[] materias = {
            "Algoritmos y Logica de Programacion",
            "Calculo Diferencial",
            "Fisica",
            "Metodologia de la Investigacion",
            "Algebra Lineal"
        };

        try {
            // el BufferedWriter va enlazado al FileWriter
            BufferedWriter escritor = new BufferedWriter(new FileWriter("materias.txt"));
            for (String materia : materias) {
                escritor.write(materia);
                escritor.newLine(); // cada materia en su propia linea
            }
            escritor.close();
            System.out.println("Se guardaron " + materias.length + " materias en materias.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
