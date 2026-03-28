package com.exemplo.bridge;

public class TV implements Dispositivo {

    public void ligar() {
        System.out.println("TV ligada");
    }

    public void desligar() {
        System.out.println("TV desligada");
    }

    public void setVolume(int volume) {
        System.out.println("Volume TV: " + volume);
    }
}