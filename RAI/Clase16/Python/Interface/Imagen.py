from abc import ABC, abstractmethod

class Imagen(ABC):
    @abstractmethod
    def ver_imagen(self):
        pass