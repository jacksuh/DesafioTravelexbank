package br.com.confidencecambio.javabasico.modelo;



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
public class Cliente {

    @NotBlank
    private String nome = "Miguel monteiro dos santos";

    public String getprimeiroNome() {
        String []list = nome.split(" ");
        String s = list[0];
        return s;
    }


    public String getUltimoNome() {
        String[] array = nome.split(" ");

        return  array[1] + " " + array[2] + " " + array[3];
    }


    public String getLetrasMaiusculas(){
        String maiuscula = nome.toUpperCase();

        return maiuscula;
    }

    public String getAbreviado(){
        String[] array = nome.split(" ");

        return array[0] + " " + array[1].charAt(0) + " " + array[2] + " " + array[3];

    }



}
