import java.util.Scanner;

public class FuncionPotencia{

    /**
     * Calcula la potencia
     * @author profeJoel
     * @param b es la base de tipo int
     * @param e es el exponente de tipo int
     * @return es la potencia de b por e
     */
    static int potencia(int b, int e){
        int p=1;
        for(; e>0; e--)
            p *= b;
        return p;
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        int base = lector.nextInt();
        int exp;
        do{
            System.out.println("Ingrese la exponente: ");
            exp = lector.nextInt();
        }while(exp <= 0);

        System.out.println("El resultado de la potencia de " + base + " por el " + exp + " es " + potencia(base, exp));
    }
}