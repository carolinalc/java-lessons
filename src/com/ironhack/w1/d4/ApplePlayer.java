package com.ironhack.w1.d4;

public class ApplePlayer extends Player implements IPlayable {
    public ApplePlayer(double volumen, int currentTrack) {
        super(volumen, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Closing Android Player");
    }

    @Override
    public void play() {
        System.out.println("Playing Android");
    }

    @Override
    public void mute() {
        setVolumen(0);
    }

    @Override
    public void pause() {
        System.out.println("Paused Android");
    }

    @Override
    public void increaseVolume() {
        setVolumen(getVolumen() + 0.1);
    }
}
