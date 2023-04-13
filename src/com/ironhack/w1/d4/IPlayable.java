package com.ironhack.w1.d4;

public interface IPlayable {
    public abstract void play();
    /*en una interfaz ya se da por hecho que los metodos son publicos y abstractos,
    asi que no hace falta escribir "public abstract" */
    void mute();
    void pause();
    void increaseVolume();

    final double MAX_VOLUME = 1;
    /*las interfaces no pueden tener variables, solo constantes, por lo que "final" no es necesario*/
}
