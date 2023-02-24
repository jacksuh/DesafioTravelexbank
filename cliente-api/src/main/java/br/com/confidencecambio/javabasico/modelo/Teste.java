package br.com.confidencecambio.javabasico.modelo;

/**
 * Classe utilizada para realizar testes.
 * Autor: Jackson Santos
 *
 */

public class Teste {

    public static void main(String[] args) {

        Cliente nome = new Cliente();

        System.out.println(nome.getprimeiroNome());

        System.out.println(nome.getUltimoNome());

        System.out.println(nome.getLetrasMaiusculas());

        System.out.println(nome.getAbreviado());
    }

}