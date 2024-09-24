from Animal import Animal

class Perro(Animal):
    def __init__(self, nombre: str, familia: str, especie: str, fuerza_mordida:int):
        super().__init__(nombre, familia, especie)
        self.fuerza_mordida = fuerza_mordida

    def olfatea(self):
        print(self.nombre + " olfatea")

    def hace_sonido(self):
        print(self.nombre + " hace Guau...")