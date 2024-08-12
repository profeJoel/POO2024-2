#include<stdio.h>

int main(){
    int M[3][3];
    int i,j;

    for (i = 0; i < 3; i++){
        for (j = 0; j < 3; j++){
            printf("Ingrese el valor en la posicion %d,%d: ", i,j);
            scanf("%d", &M[i][j]);
        }
        
    }
    for (i = 0; i < 3; i++){
        for (j = 0; j < 3; j++){
            printf("%d ", M[i][j]);
        }
        printf("\n");
    }

    //Comprobar los valores
    int sF0=0, sF1=0, sF2=0;
    int sC0=0, sC1=0, sC2=0;
    int sDP=0, sDS=0;

    for (i = 0; i < 3; i++){
        for (j = 0; j < 3; j++){
            if(i==0) sF0 += M[i][j]; //sF0 = sF0 + M[i][j]
            if(i==1) sF1 += M[i][j];
            if(i==2) sF2 += M[i][j];  

            if(j==0) sC0 += M[i][j]; 
            if(j==1) sC1 += M[i][j]; 
            if(j==2) sC2 += M[i][j];

            if(i==j) sDP += M[i][j];
            if(i+j == 2) sDS += M[i][j]; 
        }
    }

    //Comparar los resultados
    if((sF0==sF1 && sF1==sF2) && (sC0==sC1 && sC1==sC2) && (sDP == sDS) && (sF0==sC0) && (sF0==sDP))
        printf("Felicidades, has encontrado un CUADRADO MAGICO");
    else
        printf("No es un cuadrado magico, siga participando");

    return 0;
}