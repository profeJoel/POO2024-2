#para utilizar las clases se deben importar al archivo
#from archivo import clase

from Gato import Gato

if __name__ == "__main__":
    #Para instanciar un objeto debemos utilizar el constructor
    gato1 = Gato("Garfield", "macho", 60, 30, "Naranjo", "esponjoso")

    print("El gato se llama: " + gato1.get_name())
    gato1.eat("lassagna")
    gato1.move()
    gato1.meow()
    gato1.purr()
    gato1.hunt_mice()
    print("El gato tiene color: " + gato1.get_color())
    gato1.set_color("azul")
    print("El gato tiene color: " + gato1.get_color())
