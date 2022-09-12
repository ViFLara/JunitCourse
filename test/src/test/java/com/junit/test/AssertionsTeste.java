package com.junit.test;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

    @Test
    void ValidarLancamento() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, -1, 5, 2, 3};

       // Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        // Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Luciana", LocalDateTime.now());

        assertNotNull(pessoa);

        fail("Error");
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor1 = 5.0;
        double valor2 = 5.0;

        assertEquals(valor1, valor2);
    }
}
