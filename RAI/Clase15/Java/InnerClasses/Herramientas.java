//package RAI.Clase15.Java.InnerClasses;

//Outer Class
public class Herramientas {
    private String nombre;
    private Martillo martillo;
    
    //Inner Class
    public class Martillo{
        private int tamano;
        private String empunadura;
        private String mazo;

        public Martillo(int tamano, String empunadura, String mazo){
            this.tamano = tamano;
            this.empunadura = empunadura;
            this.mazo = mazo;
        }

        @Override
        public String toString(){
            return "Martillo de " + this.tamano + " onzas, empunadura de " + this.empunadura + " y mazo de " + this.mazo;
        }
    }

    public Herramientas(String nombre){
        this.nombre = nombre;
        this.martillo = new Martillo(32, "madera", "Acero");
    }

    public Martillo getMartillo(){
        return this.martillo;
    }

    public Martillo crearMartillo(int tamano, String empunadura, String mazo){
        return new Martillo(tamano, empunadura, mazo);
    }
}
