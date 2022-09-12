package com.junit.test;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        // fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao() {
        //fez algo
        LOGGER.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        // Insere pessoa no BD
        LOGGER.info("Inseriu dados");
    }

    public static void romoveDados(Pessoa pessoa) {
        // Remove pessoa no BD
        LOGGER.info("Removeu dados");
    }
}
