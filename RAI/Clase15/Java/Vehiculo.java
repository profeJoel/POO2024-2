public class Vehiculo{
    private String patente;
    private String marca;
    private String modelo;

    public Vehiculo(String patente, String marca, String modelo){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String marca, String modelo){
        this.patente = "";
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(){
        this.patente = "";
        this.marca = "";
        this.modelo = "";
    }

    @Override
    public String toString(){
        return "Vehiculo patente: " + this.patente + " marca: " + this.marca + " modelo: " + this.modelo;
    }

    public String toString(int n){
        if(n == 1)
            return "Vehiculo patente: " + this.patente + " marca: " + this.marca + " modelo: " + this.modelo;
        else
            return "Vehiculo sin informacion: ";
    }
}