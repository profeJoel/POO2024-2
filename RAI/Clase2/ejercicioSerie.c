#include<stdio.h>

void serie(int n){
    int i;
    float parcial, sumatoria = 0;

    for (i = 0; i <= n; i++){
        parcial = (float) (2*i+1)/(4*(i+1));
        printf("Parcial %d es %f\n", i, parcial);
        sumatoria += parcial;
    }
    printf("\nLa sumatoria total es: %f", sumatoria);
    
}

int main(){
    int n;
    printf("Ingrese el valor N: ");
    scanf("%d", &n);
    serie(n);
    return 0;
}
