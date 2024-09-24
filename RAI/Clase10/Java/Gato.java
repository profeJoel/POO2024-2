public class Gato{
    //atributos
    //son variables
    private String name;
    private String sex;
    private int age;
    private int weight;
    private String color;
    private String texture;

    //metodos
    //son funciones
    //El primer metodo se llama constructor o builder
    //En java el constructor siempre tiene el nombre de la clase
    public Gato(String name, String sex, int age, int weight, String color, String texture){
        //this  hace referencia a la informacion propia del objeto
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.texture = texture;
    }

    public void eat(String comida){
        System.out.println(this.name + " va a comer " + comida);
    }
    
    public void move(){
        System.out.println(this.name + " va a mover");
    }

    public void meow(){
        System.out.println(this.name + " hace meowww");
    }

    public void purr(){
        System.out.println(this.name + " va a ronrronear");
    }

    public void huntMice(){
        System.out.println(this.name + " va a cazar ratones");
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String nuevoColor){
        if(nuevoColor.equals("blanco"))
            this.color = nuevoColor;
        else
            System.out.println("No es posible cambiar el color");
    }


}