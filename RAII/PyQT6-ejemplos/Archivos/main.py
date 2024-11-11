import os

if __name__ == "__main__":
    #mi_archivo = open("archivo.txt", "r")
    # Modo de apertura
    # r -> modo lectura
    # a -> modo escritura al final del archivo
    # w -> modo escritura / sobreescritura
    # x -> modo creacion

    # t -> texto en texto plano (por defecto)
    # b -> binario en texto binario

    #print(">> " + mi_archivo.read())
    #print(">> " + mi_archivo.read(10))
    #print(">> " + mi_archivo.readline())
    # lineas = mi_archivo.readlines()
    # for linea in lineas:
    #     print(">>> " + linea, end="")

    # Crear Archivo
    #nuevo = open("nuevo.txt", "x")

    # Escritura archivo /Sobre escritura
    # otro = open("otro.txt", "w")
    # otro.write("Este texto es del codigo\n")
    # otro.write("Con un salto de linea\n")
    # otro.close()

    #Modo apertura al final
    # otro = open("otro.txt", "a")
    # otro.write("Agregar al final\n")

    # Eliminar el archivo
    os.remove("nuevo.txt")