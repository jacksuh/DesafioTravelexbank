package br.com.confidencecambio.javabasico.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * Utilizado o Lombok com a anotação NotBlank que não aceitar valor branco ou nulo, possui também o metodo trim() para retirar espaço.
 * Logica criada como se fosse uma classe utilizando spring.
 * Autor: Jackson Santos
 *
 */

@Setter
@NoArgsConstructor
public class Gerente {

    @NotBlank
    private String nome;

    public String getprimeiroNome() {
        String []list = nome.split(" ");
        String s = list[0];
        return s;
    }


    public String getUltimoNome() {
        String substring = nome.substring(7).trim();
        return substring;
    }


    public String getLetrasMaiusculas(){
        String maiuscula = nome.toUpperCase();

        return maiuscula;
    }

    public String getAbreviado(){
        String abreviado = nome.substring(0, 7)+ "" + "" + " " +
                "" + "" +  String.valueOf(nome.charAt(8) + "" + "" + nome.substring(13));

        return abreviado;
    }
}
