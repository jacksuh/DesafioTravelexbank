package br.com.confidencecambio.javabasico.modelo;

public class teste {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        System.out.println(c.getprimeiroNome());
        System.out.println(c.getUltimoNome());
        System.out.println(c.getAbreviado());
        System.out.println(c.getLetrasMaiusculas());
    }
}
