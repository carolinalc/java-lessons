package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args){
        Movie harryPotter = new Movie("Harry Potter", 100);
        Movie esdla = new Movie("el señor de los anillos", 200);
//        Movie newMovie = movieCreator("Star wars", 120)
        Movie madMax = new Movie("Mad Max");


        System.out.println("Title " + harryPotter.getTitle() + ". Duration: " + harryPotter.getDuration());
        System.out.println("Title " + esdla.getTitle() + ". Duration: " + esdla.getDuration());
        System.out.println("harry potter " + harryPotter);
        harryPotter.play();
        esdla.play();
        Movie.getAlert();
        System.out.println(harryPotter.IS_GOOD);
        System.out.println(madMax);


        HorrorMovie scream = new HorrorMovie("Scream", 130, false);
        System.out.println(scream.getTitle() + " " + scream.isScary());
        System.out.println(scream);

    }

//    public static Movie movieCreator(String title, int duration){
//        return new Movie(title, duration);
//    }
}
