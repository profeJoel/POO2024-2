from abc import ABC, abstractmethod
# IMportando el comportamiento abstracto desde una metaclase ABC

# La herencia con ABC provoca el comportamiento abstracto de la clase Animal
class Animal(ABC):

    # se pueden definir los atributos de la siguiente manera
    nombre:str
    especie:str
    """
    def __init__(self, nombre, especie):
        self.nombre = nombre
        self.especie = especie
    """

    def __str__(self) -> str:
        return "Animal " + self.nombre + " de especie " + self.especie

    @abstractmethod
    def hace_sonido(self):
        pass