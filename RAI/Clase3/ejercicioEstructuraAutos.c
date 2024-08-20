#include<stdio.h>

typedef struct vehiculo{
    char marca[50];
    char modelo[50];
    int anho;
}autito;

void ingresoDatos(autito *a){
    printf("Ingrese la marca del auto: ");
    fflush(stdin);
    fgets(a->marca, 50, stdin);
    fflush(stdin);
    printf("Ingrese el modelo: ");
    fgets(a->modelo, 50, stdin);
    printf("Ingrese el anho: ");
    scanf("%d",&(*a).anho);
    printf("\nFin de ingreso de datos...\n");
}

void modificarDatos(autito *a){
    printf("Ingrese la marca del auto: ");
    fflush(stdin);
    fgets(a->marca, 50, stdin);
    fflush(stdin);
    printf("Ingrese el modelo: ");
    fgets(a->modelo, 50, stdin);
    printf("Ingrese el anho: ");
    scanf("%d",&(*a).anho);
    printf("\nFin de ingreso de datos...\n");
}

void ordenarVector(autito lista[], int n){
    autito aux;
    int i, j;
    for (i = 0; i < n; i++){
        for (j = 0; j < n; j++){
            if(lista[j].anho < lista[i].anho){
                aux = lista[j];
                lista[j] = lista[i];
                lista[i] = aux;
            }
        } 
    }
    
}

void imprimirDatos(autito a){
    printf("\nAuto\n Marca: %s (%s) - %d", a.marca, a.modelo, a.anho);
}

int main(){
    int n, i;

    do{
        printf("Ingrese la cantidad (n) de un arreglo de tipo autito: ");
        scanf("%d", &n);
    }while(n<0);

    autito listadoAutos[n];
    for(i=0; i<n; i++)
        ingresoDatos(&listadoAutos[i]);

    for(i=0; i<n; i++)
        imprimirDatos(listadoAutos[i]);

    modificarDatos(&listadoAutos[0]);
    for(i=0; i<n; i++)
        imprimirDatos(listadoAutos[i]);

    ordenarVector(listadoAutos, n);

    for(i=0; i<n; i++)
        imprimirDatos(listadoAutos[i]);

    return 0;
}
