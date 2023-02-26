package br.com.confidencecambio.javabasico.modelo;


import lombok.NoArgsConstructor;
import lombok.Setter;





@Setter
@NoArgsConstructor
public class Gerente extends Pessoa {


    public String getPrimeiroNome() {
        String []list = nome.split(" ");
        String s = list[0];
        return s;
    }


    public String getSobreNome() {
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
