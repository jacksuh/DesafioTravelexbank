package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.modelo.Cliente;

public class teste {

    public static void main(String[] args) {

        Cliente c = new Cliente();

        c.setNome("Jackson Silva dos santos");

        System.out.println(c.getPrimeiroNome());
        System.out.println(c.getSobreNome());
        System.out.println(c.getAbreviado());
        System.out.println(c.getLetrasMaiusculas());
    }
}
