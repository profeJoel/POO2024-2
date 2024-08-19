#include<stdio.h>

int cantidadLetrasRecursivo(char cadena[], int i){
    if(cadena[i] == '\0')
        return i;
    else 
        return cantidadLetrasRecursivo(cadena, i+1);
}

int main(){
    /* code */
    char palabra[50];
    printf("Ingrese una palabra:");
    //gets(palabra);
    scanf("%s", palabra);

    printf("La cantidad de letras de %s es %d", palabra, cantidadLetrasRecursivo(palabra, 0));
    return 0;
}
