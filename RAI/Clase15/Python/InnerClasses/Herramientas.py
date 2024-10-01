#Outer Class
class Herramientas:

    #Inner Class
    class Martillo:
        def __init__(self, tamano:str, empunadura: str, mazo:str):
            self.tamano = tamano
            self.empunadura = empunadura
            self.mazo = mazo
        
        def __str__(self) -> str:
            return "Martillo de " + str(self.tamano) + " onzas, empunadura de " + self.empunadura + " y mazo de " + self.mazo

    def __init__(self, nombre: str):
        self.nombre = nombre
        self.martillo = self.Martillo(32, "madera", "acero")