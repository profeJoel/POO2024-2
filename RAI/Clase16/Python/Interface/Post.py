from Texto import Texto
from Imagen import Imagen
from Video import Video

class Post(Texto, Imagen, Video):

    def __init__(self, id:int, url:str, mensaje:str) -> None:
        self.id = id
        self.url = url
        self.mensaje = mensaje

    def ver_texto(self):
        print("> texto: " + self.mensaje)

    def ver_imagen(self):
        print("> Imagen: " + self.url)

    def ver_video(self):
        print("> Video: " + self.url)