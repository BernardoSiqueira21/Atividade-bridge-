package com.exemplo.bridge;

public class Radio implements Dispositivo {

    public void ligar() {
        System.out.println("Radio ligado");
    }

    public void desligar() {
        System.out.println("Radio desligado");
    }

    public void setVolume(int volume) {
        System.out.println("Volume Radio: " + volume);
    }
}