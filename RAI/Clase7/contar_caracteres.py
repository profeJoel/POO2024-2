def contar_caracteres(c:str):
    #return c.__len__()
    return len(c)


if __name__ == "__main__":
    print("Ingrese una palabra")
    palabra = input()
    contador = contar_caracteres(palabra)
    print(f"La cantidad de letras de la palabra {palabra} es: {contador}")