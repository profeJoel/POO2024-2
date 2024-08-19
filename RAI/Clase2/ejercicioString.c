#include<stdio.h>

int contarCaracteres(char c[]){
    int i, cantCaracteres = 0;
    for (i = 0; c[i]!= '\0'; i++)
        cantCaracteres++;
    return cantCaracteres;
}

int main(){
    char cadena[20];
    printf("Ingrese una palabra: ");
    scanf("%s", cadena);
    printf("La cantidad de caracteres es: %d", contarCaracteres(cadena));
    return 0;
}