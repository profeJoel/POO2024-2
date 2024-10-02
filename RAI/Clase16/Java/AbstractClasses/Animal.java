//package RAI.Clase16.Java.AbstractClasses;

public abstract class Animal {
    protected String nombre;
    protected String especie;

    public Animal(String nombre, String especie){
        this.nombre = nombre;
        this.especie = especie;
    }

    @Override
    public String toString(){
        return "Animal " + this.nombre + " de la especie " + this.especie;
    }

    public abstract void haceSonido();//es una declaracion de metodo que ahora es abstracto
}
