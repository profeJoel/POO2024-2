from Animal import Animal

class Gato(Animal):
    def __init__(self, nombre: str, familia: str, especie: str, pelaje: str):
        super().__init__(nombre, familia, especie)
        self.pelaje = pelaje
    
    def ronrronea(self):
        print(self.nombre + " esta ronrroneando")
    
    #@override
    def hace_sonido(self):
        print(self.nombre + " hace Miauu...")