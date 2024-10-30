import sys
from PyQt6.QtCore import Qt, QSize
from PyQt6.QtWidgets import QApplication, QMainWindow, QLabel, QPushButton, QVBoxLayout, QWidget

class Ventana_Principal(QMainWindow):

    def __init__(self):
        super().__init__()
        self.contador = 0

        self.setWindowTitle("Es el primer programa GUI")
        self.setFixedSize(QSize(500,500))

        #Crear el contenedor
        caja = QVBoxLayout()

        #Crear los componentes
        self.texto = QLabel("Presione el boton para iniciar el contador")
        self.boton = QPushButton("OK")
        self.boton.clicked.connect(self.contar)

        #Agregar los componentes
        caja.addWidget(self.texto)
        caja.addWidget(self.boton)

        panel = QWidget()
        panel.setLayout(caja)
        self.setCentralWidget(panel)

    def contar(self):
        self.contador +=1
        #print(f"Contador: {self.contador}")
        self.texto.setText(f"Contador: {self.contador}")



if __name__ == "__main__":
    app = QApplication(sys.argv)
    ventana = Ventana_Principal()
    ventana.show()
    app.exec()