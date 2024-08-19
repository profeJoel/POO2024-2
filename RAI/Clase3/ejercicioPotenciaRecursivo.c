#include<stdio.h>

int potencia(int base, int exp){
    int pot = 1;
    for(; exp>0; exp--)
        pot*=base;
    return pot;
}

int potenciaRecursiva(int base, int exp){
    if(exp<=1)
        return base;
    else
        return base * potenciaRecursiva(base, exp-1);
}

int main(){
    /* code */
    int base, exp;
    printf("Ingrese el valor de la base: ");
    scanf("%d", &base);
    do{
        printf("Ingrese el valor del exponente: ");
        scanf("%d", &exp);
    }while(exp <= 0);

    printf("\nPotencia (funcion normal): %d", potencia(base, exp));
    printf("\nPotencia (funcion recursiva): %d", potenciaRecursiva(base, exp));
    return 0;
}
