from Herramientas import Herramientas

if __name__ == "__main__":

    caja = Herramientas("mi caja")
    print(caja.martillo)

    mi_martillo = Herramientas.Martillo(16, "madera", "oro")
    print(mi_martillo)
    