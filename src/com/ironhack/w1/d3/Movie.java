package com.ironhack.w1.d3;

public class Movie {
    //PROPIEDADES
    //public es usable y modificable por todos
    //private es necesario getters y setters para usarse
    //protected solo se puede usar en el paquete que este
    private String title;
    private int duration;
    public final boolean IS_GOOD = true; //una propiedad final es una constante, no se puede variar

    //constructor
    public Movie(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public Movie(String title) {
        this.title = title;
        this.duration = 90;
    }

    //GETTERS
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    //SETTERS

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public void play(){
        System.out.println("Playing " + this.title);
    }

//con esto creas un metodo usable en todos lados
    public static void getAlert(){
        System.out.println("eso es ilegal");
    }

    //sobrecargar un metodo para obtener la info y no la posicion de memoria
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
