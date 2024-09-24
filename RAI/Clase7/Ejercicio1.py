def verificar_menores_a(k, v, N):
    for i in range(N):
        if v[i] <= k:
            print(f"El valor menor es {v[i]}")

def verificar_menores_b(k, vector):
    for posicion in vector: #for each
        if posicion <= k:
            print(f"El valor menor es {posicion}")

if __name__ == "__main__":

    print("Ingrese un valor N")
    N = int(input())

    while(N<=0):
        print("Ingrese un valor N")
        N = int(input())

    print("Ingrese el valor de k (k<=N)")
    k = int(input())

    while(k>N):
        print("Ingrese el valor de k (k<=N)")
        k = int(input())
    
    v = [int] * N
    for i in range(N):
        print(f"Ingrese el valor de posicion {i}: ")
        v[i] = int(input())
    
    #verificar_menores_a(k, v, N)
    verificar_menores_b(k, v)