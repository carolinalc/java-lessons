package com.ironhack.w1.d4;

public abstract class Player {
    private double volumen;
    private int currentTrack;

    public Player(double volumen, int currentTrack) {
        this.volumen = volumen;
        this.currentTrack = currentTrack;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(int currentTrack) {
        this.currentTrack = currentTrack;
    }

    public void getNextTrack(){
        this.currentTrack++;
    }

    public abstract void close();


}
