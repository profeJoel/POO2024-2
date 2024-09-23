//package RAI.Clase13.Java;

public class Animal {
    protected String nombre;
    protected String familia;
    protected String especie;

    public Animal(String nombre, String familia, String especie){
        this.nombre = nombre;
        this.familia = familia;
        this.especie = especie;
    }

    public void haceSonido(){
        System.out.println(this.nombre + " hace un sonido");
    }

    public void come(String comida){
        System.out.println(this.nombre + " come " + comida);
    }
}
