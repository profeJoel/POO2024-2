//package RAI.Clase13.Java;

public class Pollo extends Animal{
    private String colorPlumas;

    public Pollo(String nombre, String familia, String especie, String colorPlumas){
        super(nombre, familia, especie);
        this.colorPlumas = colorPlumas;
    }

    public void poneHuevo(){
        System.out.println(this.nombre + "Ha puesto un huevo");
    }

    @Override
    public void haceSonido(){
        System.out.println(this.nombre + " hace Piopio...");
    }
    
}
