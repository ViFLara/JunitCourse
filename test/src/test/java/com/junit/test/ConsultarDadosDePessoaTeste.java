package com.junit.test;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTeste {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou configuraConexao");
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.romoveDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou finalizarConexao");
    }

}
