//package RAI.Clase16.Java.AbstractClasses;

public class Gato extends Animal{

    private String raza;

    public Gato(String nombre, String especie, String raza){
        super(nombre, especie);
        this.raza = this.raza;
    }

    public void haceSonido(){
        System.out.println(this.nombre + " hace Miauu...");
    }
    public void ronrronear(){
        System.out.println(this.nombre + " hace purrr...");
    }
    
}
