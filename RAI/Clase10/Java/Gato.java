class Gato{
    //atributos
    //son variables
    String name;
    String sex;
    int age;
    int weight;
    String color;
    String texture;

    //metodos
    //son funciones
    //El primer metodo se llama constructor o builder
    //En java el constructor siempre tiene el nombre de la clase
    Gato(String name, String sex, int age, int weight, String color, String texture){
        //this  hace referencia a la informacion propia del objeto
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.texture = texture;
    }

    void eat(String comida){
        System.out.println(this.name + " va a comer " + comida);
    }
    
    void move(){
        System.out.println(this.name + " va a mover");
    }

    void meow(){
        System.out.println(this.name + " hace meowww");
    }

    void purr(){
        System.out.println(this.name + " va a ronrronear");
    }
    
    void huntMice(){
        System.out.println(this.name + " va a cazar ratones");
    }


}