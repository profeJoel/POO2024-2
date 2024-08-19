#include<stdio.h>

void invertirVector(int v[], int n){
    int i, j, aux;
    for(i=0, j=n-1; i<(n/2); i++, j--){
        aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}

int main(){
    int n;
    do{
        printf("Ingrese el valor de n (valor positivo): ");
        scanf("%d", &n);
    }while(n<=0);

    int i, v[n];
    for (i = 0; i < n; i++){
        printf("Ingrese el valor posicion %d: ", i);
        scanf("%d", &v[i]);
    }

    for (i = 0; i < n; i++)
        printf("%d ", v[i]);
    
    invertirVector(v,n);

    printf("\n Vector Invertido:\n");
    for (i = 0; i < n; i++)
        printf("%d ", v[i]);
    return 0;
}
