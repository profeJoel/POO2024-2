from Animal import Animal

class Gato(Animal):

    def __init__(self, nombre:str, especie:str, raza:str):
        self.nombre = nombre
        self.especie = especie
        self.raza = raza

    def hace_sonido(self):
        print(self.nombre + " hace Miau...")