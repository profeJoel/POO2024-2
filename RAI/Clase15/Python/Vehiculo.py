class Vehiculo:

    def __init__(self, patente= None, marca = None, modelo = None):
        if patente != None:
            self.patente = patente
        else:
            self.patente = ""
        self.marca = marca if marca != None else ""
        self.modelo = modelo if modelo != None else ""
    
    def __str__(self):
        return "Vehiculo Patente: " + self.patente + " marca: " + self.marca + " modelo: " + (self.modelo if self.modelo != None else "")