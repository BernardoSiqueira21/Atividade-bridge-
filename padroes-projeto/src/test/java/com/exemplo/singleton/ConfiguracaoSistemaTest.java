package com.exemplo.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConfiguracaoSistemaTest {

    @Test
    void deveSerSingleton() {
        ConfiguracaoSistema c1 = ConfiguracaoSistema.getInstancia();
        ConfiguracaoSistema c2 = ConfiguracaoSistema.getInstancia();

        assertSame(c1, c2);
    }
}