//package RAI.Clase13.Java;

public class Main {
  public static void main(String[] args) {
    Animal animal1 = new Animal("animal1", "indeterminada", "indeterminada");
    Gato garfield = new Gato("Garfield", "Felino", "british", "Naranjo");
    Perro goofy = new Perro("Goofy", "Canino", "Mixto", 100);
    Pollo chickenLittle = new Pollo("Chicken Little", "Ave", "Gallina", "blanco");

    //Generalizar
    animal1.haceSonido();
    garfield.haceSonido();
    goofy.haceSonido();
    chickenLittle.haceSonido();

    //En particular
    garfield.ronrronea();
    goofy.olfatea();
    chickenLittle.poneHuevo();

    //Agrupacion
    //Arreglo de tipo Animal (superclase)
    Animal[] listaAnimales = new Animal[4];
    listaAnimales[0] = animal1;
    listaAnimales[1] = garfield;
    listaAnimales[2] = goofy;
    listaAnimales[3] = chickenLittle;

    for(Animal a : listaAnimales){
        System.out.println("Animal es " + a.nombre);
    }
  }  
}
