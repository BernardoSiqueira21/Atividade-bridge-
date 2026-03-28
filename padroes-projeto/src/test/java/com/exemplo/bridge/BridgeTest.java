package com.exemplo.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BridgeTest {

    @Test
    void deveLigarTV() {
        Dispositivo tv = new TV();
        ControleRemoto controle = new ControleRemoto(tv);

        assertDoesNotThrow(controle::ligar);
    }
}