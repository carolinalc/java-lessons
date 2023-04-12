package com.ironhack.w1.d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) throws IOException {

    // INPUT / OUTPUT
        //System.out.println("prueba de salida normal");
        //System.err.println("prueba de salida de error");

        Scanner scanner = new Scanner(System.in);

//        String name;
//        do {
//            System.out.println("Write your name");
//            name = scanner.nextLine();
//        } while (name.length() < 3);
//        System.out.println("your name is " + name);


        System.out.println("Write your age");

        if(scanner.hasNextInt()){
            int age = scanner.nextInt();
            System.out.println("your age is " + age);
        }else{
            String input = scanner.next();
            System.out.println("Not a valid number");
        }


        scanner.close();

    // FILE HANDING

        String filePath = "src/com/ironhack/w1/d3/fichero.txt";

        File file  = new File(filePath);
        if (file.createNewFile()){
            System.out.println("el archivo se ha creado");
        }else System.out.println("el archivo ya existia");

        FileWriter fileWriter = new FileWriter(filePath, true);
        fileWriter.write("esto es una linea\n");
        fileWriter.write("esto es otra linea\n");
        fileWriter.close();


        Scanner fileScanner = new Scanner(file);
        String str = "";
        while (fileScanner.hasNextLine()){
            str += fileScanner.nextLine();
            System.out.println(str);
        }
        fileScanner.close();


    }
}
