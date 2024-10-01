//package RAI.Clase15.Java.InnerClasses;

public class Main {
    public static void main(String[] args) {        
        Herramientas caja = new Herramientas("mi maleta");
        System.out.println(caja.getMartillo());

        Herramientas.Martillo niMartillo = caja.crearMartillo(16, "madera", "oro");
        System.out.println(niMartillo);

    }
}
