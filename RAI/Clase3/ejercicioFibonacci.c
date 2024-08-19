#include<stdio.h>

int fibonacci(int n){
    if(n<=1)
        return 1;
    else
        return fibonacci(n-1) + fibonacci(n-2);
}

int main(){
    int n;
    do{
        printf("Ingrese el valor de n (positivo):");
        scanf("%d", &n);
    }while(n<0);
    printf("El Fibonacci de %d es %d", n, fibonacci(n));
    return 0;
}
