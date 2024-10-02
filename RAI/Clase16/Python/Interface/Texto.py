from abc import ABC, abstractmethod

class Texto(ABC):
    @abstractmethod
    def ver_texto(self):
        pass