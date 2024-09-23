
class Animal:

    def __init__(self, nombre:str, familia:str, especie:str):
        self.nombre = nombre
        self.familia = familia
        self.especie = especie
    
    def hace_sonido(self):
        print(self.nombre + " hace sonido...")

    def come(self, comida:str):
        print(self.nombre + " come "+ comida)