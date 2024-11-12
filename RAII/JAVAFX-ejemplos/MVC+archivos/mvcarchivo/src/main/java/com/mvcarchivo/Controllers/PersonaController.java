package com.mvcarchivo.Controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.mvcarchivo.Models.PersonaModel;


// Controlador
public class PersonaController {
    private static final String FILE_PATH = "personas.csv";

    public List<PersonaModel> leerPersonas() throws IOException {
        List<PersonaModel> personas = new ArrayList<>();
        if (Files.exists(Paths.get(FILE_PATH))) {
            List<String> lines = Files.readAllLines(Paths.get(FILE_PATH));
            for (String line : lines) {
                personas.add(PersonaModel.fromCSV(line));
            }
        }
        return personas;
    }

    public void agregarPersona(PersonaModel persona) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(persona.toString() + "\n");
        }
    }

    public void actualizarArchivo(List<PersonaModel> personas) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_PATH, false)) {
            for (PersonaModel persona : personas) {
                writer.write(persona.toString() + "\n");
            }
        }
    }
}
