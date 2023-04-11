package com.ironhack.w1.d1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");


        // DATA TYPES

        //variables primitivas
        byte myByte = 127;
        short myShort = 1000;
        int myInt = 9999999;
        double myDouble = 10.65165;
        boolean isBoolean = true;
        char myChar = 'c';

        String myString = "Hola";
        String myName;
        myName = "Carol";

        System.out.println(myName);
        //escribit sout para System.out.println();
        System.out.println("My byte: " + myByte);

        myInt = 1234;
        System.out.println("my int: " + myInt);
        //myInt = myInt + 1000;
        myInt += 1000;
        System.out.println("my int: " + myInt);

        myByte += 1;
        System.out.println(myByte); //datos desbordados


        // OPERATORS

        int number = 10;
        myDouble = 10;

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 3);
        System.out.println(number % 3); //este nos da el resto de la division
        System.out.println(myDouble / 3);
        System.out.println(1.2 - 1.1); //el resultado no es preciso
        System.out.println(number);
        System.out.println(number++);//imprime sin modificar
        System.out.println(number);//imprime el modificado de arriba
        System.out.println(++number);//imprime ya modificado

        number *= 10;
        System.out.println(number);


        // CONDITIONALS

        number = 10;

        if (number >= 1000) { //aqui no se usa el === solo el ==
            System.out.println("Number es mayor que 1000");
        } else if (number > 0 && number < 150) {
            System.out.println("number está entre 150");
        } else {
            System.out.println("Number es menor de mil");
        }


        if (number % 2 == 0) System.out.println("number es par");
        else System.out.println("number es impar");

        if(isBoolean) System.out.println("is true"); // este tipo es el unico que no necesita comparacion


        int day = 4;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            default -> System.out.println("Weekend");
        }

        double mark = 6.5;
        boolean hasPassed = mark >= 5 ? true : false;

        //llamar metodos
        myMethod();

        String info = getInfo(1);
        System.out.println(info);

        stringMethod();

        //WRAPPERS


    }

    //METHODS

    public static void myMethod(){
        System.out.println("this is ");
        System.out.println("inside");
        System.out.println("myMethod");
    }

    public static String getInfo(int option){
        if(option == 1) return "My name is Carol";
        else if(option == 2) return "This is an Ironhack Bootcamp";
        else return "Option "+  option + " has no info. ";
    }


    //STRING METHOD
    public static void stringMethod(){
        String address = "c/ false 123";

        System.out.println(address.length());
        System.out.println(address.toUpperCase());



    }
}