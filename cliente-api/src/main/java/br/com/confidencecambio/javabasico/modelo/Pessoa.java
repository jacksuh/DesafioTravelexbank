package br.com.confidencecambio.javabasico.modelo;

import javax.validation.constraints.NotBlank;



public abstract class Pessoa {

    @NotBlank
     protected String nome;

    public void setNome(String nome) {
        this.nome = nome.trim();
    }

    public  String getPrimeiroNome() {
        return nome;
    }


    public String getSobreNome() {
        return nome;
    }


    public String getLetrasMaiusculas(){
        return nome;
    }

    public String getAbreviado(){
        return nome;
    }

}
