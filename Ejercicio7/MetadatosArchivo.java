import java.io.File;
import java.io.IOException;

/*
 APE 5 - java.io - Ejercicio 1: Exploracion y gestion de metadatos con File
 Hecho por: Dereck Acosta
*/
public class MetadatosArchivo {

    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        // 1. comprobar si ya existe
        if (archivo.exists()) {
            System.out.println("El archivo ya existe en el disco");
        } else {
            // 2. si no existe se intenta crear
            try {
                // createNewFile falla si la carpeta "datos" no existe, por eso se crea antes
                archivo.getParentFile().mkdirs();
                if (archivo.createNewFile()) {
                    System.out.println("El archivo no existia, se creo correctamente");
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }

        // 3. informacion del archivo (exista o se haya creado)
        System.out.println("Nombre: " + archivo.getName());
        System.out.println("Ruta: " + archivo.getPath());
    }
}
