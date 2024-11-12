import sys
from PyQt6.QtWidgets import (QApplication, QWidget, QVBoxLayout, QHBoxLayout, QPushButton, QLineEdit,
                             QLabel, QTableWidget, QTableWidgetItem, QMessageBox)
import csv
import os

# Modelo
class Persona:
    def __init__(self, nombre, apellido):
        self.nombre = nombre
        self.apellido = apellido

    def __str__(self):
        return f"{self.nombre},{self.apellido}"

    @staticmethod
    def from_csv_line(line):
        parts = line.strip().split(',')
        return Persona(parts[0], parts[1])

# Controlador
class PersonaController:
    FILE_PATH = 'personas.csv'

    @staticmethod
    def leer_personas():
        personas = []
        if os.path.exists(PersonaController.FILE_PATH):
            with open(PersonaController.FILE_PATH, 'r', newline='', encoding='utf-8') as file:
                reader = csv.reader(file)
                for row in reader:
                    if row:
                        personas.append(Persona.from_csv_line(','.join(row)))
        return personas

    @staticmethod
    def agregar_persona(persona):
        with open(PersonaController.FILE_PATH, 'a', newline='', encoding='utf-8') as file:
            writer = csv.writer(file)
            writer.writerow([persona.nombre, persona.apellido])

    @staticmethod
    def actualizar_archivo(personas):
        with open(PersonaController.FILE_PATH, 'w', newline='', encoding='utf-8') as file:
            writer = csv.writer(file)
            for persona in personas:
                writer.writerow([persona.nombre, persona.apellido])

# Vista y aplicación principal
class PersonaApp(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('CRUD de Persona')
        self.layout = QVBoxLayout()
        self.setLayout(self.layout)

        # Campos de texto
        self.nombre_input = QLineEdit()
        self.nombre_input.setPlaceholderText('Nombre')
        self.apellido_input = QLineEdit()
        self.apellido_input.setPlaceholderText('Apellido')

        # Botones
        self.agregar_button = QPushButton('Agregar')
        self.eliminar_button = QPushButton('Eliminar Seleccionado')

        # Tabla
        self.table = QTableWidget()
        self.table.setColumnCount(2)
        self.table.setHorizontalHeaderLabels(['Nombre', 'Apellido'])
        self.table.setSelectionBehavior(QTableWidget.SelectionBehavior.SelectRows)
        self.table.setEditTriggers(QTableWidget.EditTrigger.NoEditTriggers)

        # Añadir widgets al layout
        self.layout.addWidget(QLabel('Nombre:'))
        self.layout.addWidget(self.nombre_input)
        self.layout.addWidget(QLabel('Apellido:'))
        self.layout.addWidget(self.apellido_input)
        self.layout.addWidget(self.agregar_button)
        self.layout.addWidget(self.eliminar_button)
        self.layout.addWidget(self.table)

        # Cargar datos iniciales
        self.controller = PersonaController()
        self.personas = self.controller.leer_personas()
        self.cargar_tabla()

        # Conectar eventos
        self.agregar_button.clicked.connect(self.agregar_persona)
        self.eliminar_button.clicked.connect(self.eliminar_persona)

    def cargar_tabla(self):
        self.table.setRowCount(len(self.personas))
        for row, persona in enumerate(self.personas):
            self.table.setItem(row, 0, QTableWidgetItem(persona.nombre))
            self.table.setItem(row, 1, QTableWidgetItem(persona.apellido))

    def agregar_persona(self):
        nombre = self.nombre_input.text().strip()
        apellido = self.apellido_input.text().strip()
        if nombre and apellido:
            nueva_persona = Persona(nombre, apellido)
            self.personas.append(nueva_persona)
            self.controller.agregar_persona(nueva_persona)
            self.cargar_tabla()
            self.nombre_input.clear()
            self.apellido_input.clear()
        else:
            QMessageBox.warning(self, 'Advertencia', 'Debe ingresar nombre y apellido.')

    def eliminar_persona(self):
        selected_row = self.table.currentRow()
        if selected_row >= 0:
            respuesta = QMessageBox.question(self, 'Confirmar', '¿Está seguro de eliminar la persona seleccionada?',
                                             QMessageBox.StandardButton.Yes | QMessageBox.StandardButton.No)
            if respuesta == QMessageBox.StandardButton.Yes:
                self.personas.pop(selected_row)
                self.controller.actualizar_archivo(self.personas)
                self.cargar_tabla()
        else:
            QMessageBox.warning(self, 'Advertencia', 'Debe seleccionar una persona para eliminar.')

if __name__ == '__main__':
    app = QApplication(sys.argv)
    ventana = PersonaApp()
    ventana.show()
    sys.exit(app.exec())
