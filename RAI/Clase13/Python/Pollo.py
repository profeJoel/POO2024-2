from Animal import Animal

class Pollo(Animal):

    def __init__(self, nombre: str, familia: str, especie: str, color_plumas:str):
        super().__init__(nombre, familia, especie)
        self.color_plumas = color_plumas

    def poner_huevo(self):
        print(self.nombre + " pone huevos ")