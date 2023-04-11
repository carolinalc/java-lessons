package com.ironhack.w1.d2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    // ARRAYS

        String[] days = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        System.out.println(days[0]);

        String[] subjectsArray = createSubjetcsArray();
        System.out.println(subjectsArray[2]);
        System.out.println(subjectsArray.length); //aqui length no es un metodo, es una propiedad


    // FOR LOOP

        for (int i = 0; i < subjectsArray.length; i++) {
            //   if (subjectsArray[i].equals("Lengua")) continue; esto se salta "lengua"
            System.out.println(subjectsArray[i]);
            //    if(subjectsArray[i].equals("Historia")) break; esto para el bucle
        }

        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){
               evenNumbers[j] = i;
               j++;
            }
        }
        System.out.println(evenNumbers); //posicion en la memoria
        System.out.println(Arrays.toString(evenNumbers));


    // FOREACH LOOP

        for (int number : evenNumbers) {
            System.out.println(number);
        }


    // WHILE LOOP

        int counter = 0;
        while (counter < evenNumbers.length){
            counter++;
        }
        System.out.println("counter " + counter);


    // DO WHILE LOOP

        counter = 100;
        do {
            counter++;
        }while (counter < evenNumbers.length);
        System.out.println("counter do while " + counter );


    // MATH CLASS & CASTING

        System.out.println(Math.sqrt(64)); //raiz cuadrada, nos devuelve un doble
        System.out.println((int) Math.pow(2, 5));
        //ciudado al indicar el tipo haciendo casting que se puede perder info (decimales)


    // ARRAYLIST
        //para hacer lista de primitivos hay que usar wrappers

        List<String> countries = new ArrayList<>();
        countries.add("España");
        countries.add("Portugal");
        countries.add("Francia");
        System.out.println(countries); //imprime el array, no la posicion en memoria
        System.out.println(countries.get(0));
        countries.set(0, "Italia");
        System.out.println(countries.get(0));
        System.out.println(countries.size());//igual al length
        countries.remove(0);
        System.out.println(countries.size());


    // ADD ELEMENTS TO A LIST

        int[] numbers = {0, 1, 2, 3, 4};
        int[] newArray = new int[6];
        for (int i = 0; i < 5; i++){
            newArray[i] = numbers[i];
        }
        newArray[5] = 5;
        System.out.println(Arrays.toString(newArray));
    }

    public static String[] createSubjetcsArray() {
        String[] subjects = new String[5];
        subjects[0] = "Matemáticas";
        subjects[1] = "Lengua";
        subjects[2] = "Historia";
        subjects[3] = "Bioligía";
        subjects[4] = "Química";


        return subjects;
    }
}
