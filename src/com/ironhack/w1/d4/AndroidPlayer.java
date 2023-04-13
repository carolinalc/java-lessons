package com.ironhack.w1.d4;

public class AndroidPlayer extends Player implements IPlayable, IShareable{
    public AndroidPlayer(double volumen, int currentTrack) {
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
        setVolumen(1);
        if (getVolumen() > MAX_VOLUME) setVolumen(MAX_VOLUME);

    }

    @Override
    public String share() {
        return "sharing...";
    }
}
