
class Gato:
    #Todos los metodos deben incorporar al self como parte de sus parametros
    #El constructor en python siempre se llama __init__()
    def __init__(self, name:str, sex:str, age:int, weight:int, color:str, texture:str):
        # En el constructor se definen e instancian los atributos del objeto
        self.__name = name
        self.__sex = sex
        self.__age = age
        self.__weight = weight
        self.__color = color
        self.__texture = texture
    
    def eat(self, comida:str):
        print(self.__name + " va a comer " + comida)

    def move(self):
        print(self.__name + " se va a mover...")

    def meow(self):
        print(self.__name + " va a hacer meowww...")

    def purr(self):
        print(self.__name + " se va a ronrronear...")
    
    def hunt_mice(self):
        print(self.__name + " se va a cazar ratones...")

    def get_name(self):
        return self.__name
    
    def get_color(self):
        return self.__color

    def set_color(self, nuevo_color:str):
        if nuevo_color is "blanco":
            self.__color = nuevo_color
        else:
            print("No es permitido el cambio de color")