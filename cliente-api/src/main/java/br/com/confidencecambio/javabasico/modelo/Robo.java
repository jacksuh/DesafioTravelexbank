package br.com.confidencecambio.javabasico.modelo;


import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@NoArgsConstructor
public class Robo  extends Pessoa{

    public String getPrimeiroNome() {
        String[] list = nome.split(" ");
        return list[0];
    }

    public String getSobreNome() {
        String[] list = nome.split(" ",2);

        return list[1];
    }


    public String getLetrasMaiusculas() {
        String maiuscula = nome.toUpperCase();

        return maiuscula;
    }

    public String getAbreviado() {
        String[] list = nome.split(" ", 3);

        if(list.length <= 2){
            return list[0] + " " + list[1].toUpperCase().charAt(0);
        }else{
            return list[0] + " " + list[1].toUpperCase().charAt(0) + " " + list[2];
        }

    }
}
