package com.exemplo.bridge;

public class ControleRemotoAvancado extends ControleRemoto {

    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void aumentarVolume() {
        dispositivo.setVolume(50);
    }
}