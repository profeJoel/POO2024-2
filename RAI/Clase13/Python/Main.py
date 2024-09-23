from Animal import Animal
from Gato import Gato
from Perro import Perro
from Pollo import Pollo

if __name__ == "__main__":
    animal1 = Animal("animal1", "indeterminado", "indeterminado")
    garfield = Gato("Garfield", "Felino", "Brittish", "Naranjo")
    goofy = Perro("Goofy", "Canino", "mezcla", 100)
    chicken_little = Pollo("Chicken Little", "Ave", "Gallina domestica", "blanco")

    #Generalizacion
    animal1.hace_sonido()
    garfield.hace_sonido()
    goofy.hace_sonido()
    chicken_little.hace_sonido()

    # En particular
    garfield.ronrronea()
    goofy.olfatea()
    chicken_little.poner_huevo()

    # en lista
    lista_animales = []
    lista_animales.append(animal1)
    lista_animales.append(garfield)
    lista_animales.append(goofy)
    lista_animales.append(chicken_little)

    for a in lista_animales:
        print("El animal es " + a.nombre)