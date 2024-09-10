
class Gato:
    #Todos los metodos deben incorporar al self como parte de sus parametros
    #El constructor en python siempre se llama __init__()
    def __init__(self, name:str, sex:str, age:int, weight:int, color:str, texture:str):
        # En el constructor se definen e instancian los atributos del objeto
        self.name = name
        self.sex = sex
        self.age = age
        self.weight = weight
        self.color = color
        self.texture = texture
    
    def eat(self, comida:str):
        print(self.name + " va a comer " + comida)

    def move(self):
        print(self.name + " se va a mover...")

    def meow(self):
        print(self.name + " va a hacer meowww...")

    def purr(self):
        print(self.name + " se va a ronrronear...")
    
    def hunt_mice(self):
        print(self.name + " se va a cazar ratones...")