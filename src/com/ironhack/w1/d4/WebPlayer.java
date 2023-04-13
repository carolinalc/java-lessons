package com.ironhack.w1.d4;

public class WebPlayer extends Player{

    public WebPlayer(double volumen, int currentTrack) {
        super(volumen, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Closing Web Player");
    }
}
