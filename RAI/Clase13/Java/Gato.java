//package RAI.Clase13.Java;

//extends se refiere a la herencia a una superclase
public class Gato extends Animal{
    private String pelaje;

    public Gato(String nombre, String familia, String especie, String pelaje){
        //super() permite acceder al metodo constructor de la superclase
        super(nombre, familia, especie);
        this.pelaje = pelaje;
    }

    public void ronrronea(){
        System.out.println(this.nombre + " ronrronea...");
    }

    @Override
    public void haceSonido(){
        System.out.println(this.nombre + " hace miauu...");
    }

}
