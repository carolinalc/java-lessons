package com.ironhack.w1.d4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){

//        ABSTRACT CLASSESS AND INTERFACES

        Player player = new WebPlayer (0.5, 1);
        WebPlayer webPlayer = new WebPlayer(0.3, 2);

        System.out.println(player.getCurrentTrack());
        System.out.println(webPlayer.getCurrentTrack());
        player.close();

        AndroidPlayer androidPlayer = new AndroidPlayer(0.8, 1);
        IPlayable androidPlayer2 = new AndroidPlayer(0.5, 2);
        androidPlayer.close();
        androidPlayer.play();
        androidPlayer2.play();
//        androidPlayer2.close() no se puede hacer porque es del tipo IPlayable (interfaz, limitado a sus metodos)


//    BIG DECIMAL
//        tiene sus pripios metodos

        System.out.println(1.2 - 1.0); //no es preciso
        BigDecimal bd1 = new BigDecimal("65.25165165"); //los numeros siempre como String
        BigDecimal bd2 = new BigDecimal("18.6516510");

        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.add(bd1));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN));//se le da el divisor y el redondeo
        System.out.println(bd1.setScale(2, RoundingMode.HALF_EVEN));//redondear a dos decimales
        System.out.println(bd1.compareTo(bd2));//1 el primero, 0 iguales, -1 el segundo.



    }
}
