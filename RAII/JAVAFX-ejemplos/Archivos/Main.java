import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class Main{
    public static void main(String[] args) {
        // Lectura de archivo
        //Rutas
        //- Relativa: hace referencia en donde esta el archivo respecto del codigo fuente
        //- Absoluta: hace referencia en donde esta el archivo desde la raiz del almacenamiento dependiendo del sistema operativo.
        //>> : /Users/joelsebastiantorrescarrasco/Documents/Ulagos/POO2024-2/RAII/JAVAFX-ejemplos/Archivos/archivo.txt (No siempre es igual para todos los sistemas operativos)
        // try{
        //     File miArchivo = new File("archivo.txt");
        //     //File miArchivo = new File("texto.txt");
        //     //File miArchivo = new File("/Users/joelsebastiantorrescarrasco/Documents/Ulagos/POO2024-2/RAII/JAVAFX-ejemplos/Archivos/archivo.txt");
        //     Scanner lector = new Scanner(miArchivo);
        //     //Metadatos
        //     System.out.println(" >: " + miArchivo.getName());
        //     System.out.println(" >: " + miArchivo.getAbsolutePath());
        //     System.out.println(" >: " + miArchivo.canWrite());
        //     System.out.println(" >: " + miArchivo.canRead());
        //     System.out.println(" >: " + miArchivo.length());

        //     //Se puede leer por linea
        //     while(lector.hasNextLine()){
        //         System.out.println(" >: " + lector.nextLine());
        //         //System.out.println(" >: " + lector.next());
        //     }
        //     // Se puede leer por palabra
        //     //System.out.println(" >: " + lector.next());

        //     System.out.println(" > Fin del texto");
        //     lector.close();
        // }
        // catch(Exception e){
        //     System.out.println("NO existe el archivo indicado");
        // }
        

        // //Crear un archivo
        // try {
        //     File nuevoArchivo = new File("nuevo.txt");
            
        //     if(nuevoArchivo.createNewFile())
        //         System.out.println("Se creo nuevo archivo: " + nuevoArchivo.getName());
        //     else
        //         System.out.println("No se creo");

        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("ERROR: No se creo, ya habia otro archivo");

        // }

        // Escribir en archivo

        // try {
        //     File archivo = new File("nuevo.txt");
        //     FileWriter escritor = new FileWriter(archivo, true);

        //     // escritor.write("Este es un texto que permite escribir sobre un archivo \n");
        //     // escritor.write("Ahora voy a escribir una siguiente linea \n");
        //     // escritor.write("Ultimo intento\n");
        //     escritor.append("Esta es una linea incorporada luego de la anterior con append");

        //     escritor.close();

        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("ERROR: No se escribio");
        // }

        //Eliminar archivo

        File archivo = new File("texto.txt");
        if(archivo.delete())
            System.out.println("Archivo eliminado");
        else
            System.out.println("Archivo no se pudo eliminar");

    }
}