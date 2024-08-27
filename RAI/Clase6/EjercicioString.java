import java.util.Scanner;

public class EjercicioString {

    /**
     * Funcion para contar caracteres de un string
     * @param s: string a ser contado
     * @return c: cantidad de caracteres
     */
    static int contarCaracteres(String s){
        return s.length();
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        //String palabra = lector.next();
        String palabra = lector.nextLine();
        //System.out.println("palabra[0] " + palabra.toCharArray()[0]);

        int cantidadCaracteres = contarCaracteres(palabra);

        System.out.println("Palabra es " + palabra + " que tiene " + cantidadCaracteres + " caracteres.");
    }
}
