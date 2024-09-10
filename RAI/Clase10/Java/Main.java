//package RAI.Clase10.Java;

public class Main {
    public static void main(String[] args) {
        // para crear un objeto es necesario utilizar la palabra reservada 'new' para acceder al constructor
        // Clase objeto = new Constructor(Parametros...)

        Gato gato1 = new Gato("Garfield", "macho", 60, 30, "Naranjo", "Esponjoso");

        System.out.println("El gato es: " + gato1.name);
        gato1.eat("lassagna");
        gato1.move();
        gato1.meow();
        gato1.purr();
        gato1.huntMice();
    }
}
