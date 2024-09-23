//package RAI.Clase13.Java;

public class Perro extends Animal{
    private int fuerzaMordida; 

    public Perro(String nombre, String familia, String especie, int fuerzaMordida){
        super(nombre, familia, especie);
        this.fuerzaMordida = fuerzaMordida;
    }

    public void olfatea(){
        System.out.println(this.nombre + " esta olfateando...");
    }
    
}
