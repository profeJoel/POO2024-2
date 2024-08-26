import java.util.Scanner;
public class FuncionFibonacci {
    static int fibonacci(int n){
        if(n==0 || n==1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n;

        do{
            System.out.println("Ingrese un valor n:");
            n = lector.nextInt();
        }while(n<=0);

        System.out.println("El valor de f(" + n + ") es " + fibonacci(n));

    }    
}
