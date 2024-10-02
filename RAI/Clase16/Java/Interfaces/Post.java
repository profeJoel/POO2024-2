//package RAI.Clase16.Java.Interfaces;

public class Post implements Texto, Imagen, Video{
    // La sub clase esta obligada a implementar TODOS los metodos de TODAS las interfaces involucradas
    private int id;
    private String url;
    private String mensaje;

    public Post(int id, String url, String mensaje){
        this.id = id;
        this.url = url;
        this.mensaje = mensaje;
    }

    @Override
    public void verTexto(){
        System.out.println("> Texto: " + this.mensaje);
    }

    @Override
    public void verImagen(){
        System.out.println("> Imagen: " + this.url);
    }
    
    @Override
    public void verVideo(){
        System.out.println("> Video: " + this.url);
    }
}
