//package RAI.Clase5;
import java.util.Scanner;
public class CuboMagico {
    static boolean esCuboMagico(int[][] m){
        int sF0, sF1, sF2;
        int sC0, sC1, sC2;
        int sD1, sD2;

        sF0=0;
        sF1=0;
        sF2=0;
        sC0=0;
        sC1=0;
        sC2=0;
        sD1=0;
        sD2=0;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==0) sF0 += m[i][j];
                if(i==1) sF1 += m[i][j];
                if(i==2) sF2 += m[i][j];
                if(j==0) sC0 += m[i][j];
                if(j==1) sC1 += m[i][j];
                if(j==2) sC2 += m[i][j];

                if(i==j) sD1 += m[i][j];
                if(i+j==2) sD2 += m[i][j];
            }
        }
        
        if(sF0 == sF1 && sF1 == sF2 && sF2 == sC0 && sC0 == sC1 && sC1 == sC2 && sC2 == sD1 && sD1 == sD2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int N;
        //vector
        /*int[] v = new int[5];
        v[0] = 1;
        v[1] = 2;
        v[2] = 3;
        v[3] = 4;
        v[4] = 5;

        for(int i=0; i<5; i++)
            System.out.println("posicion v[" + i + "] = " + v[i]);

        //Matriz
        int[][] m = new int[3][3];
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                System.out.println("Posicion m[" + i + "][" + j + "] = " + m[i][j]);
                */
        do{
            System.out.println("Ingrese el valor de N: ");
            N = lector.nextInt();
        }while(N<0);

        int[][] cubo = new int[N][N];
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++){
                System.out.println("Ingrese el valor: ");
                cubo[i][j] = lector.nextInt();
            }
    
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++)
                System.out.print(cubo[i][j] + " "); System.out.println("");
        }

        if(esCuboMagico(cubo)) 
            System.out.println("Si es Magico!");
        else
            System.out.println("No es");
    }
}
