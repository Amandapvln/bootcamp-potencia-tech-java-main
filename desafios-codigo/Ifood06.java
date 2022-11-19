/*
Neste desafio você deverá construir uma função que recebe uma String e 
identifique se a mesma é um palíndromo, ou seja, se a String é igual a 
ela mesma invertida.
Dado que temos a String "digital" uma vez invertida temos "latigid" que 
são diferentes. Logo, NÃO é um Palíndromo. 
Já se recebemos a string "radar" uma vez invertida temos "radar" que são 
iguais.

Entrada: A entrada consiste em um palavra.

Saída: Para cada String informada, terá uma saída de valor Booleano: TRUE,
caso a palavra seja um palíndromo, ou FALSE caso a palavra NÃO seja um 
palíndromo.
 */

import java.util.Scanner;

public class Ifood06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        String palavra = entrada.nextLine();
        char[] letras = palavra.toCharArray();

        if(letras[0] == letras[letras.length-1]){
            if(letras[1] == letras[(letras.length-2)]){
                System.out.println("TRUE");
            } else{
                System.out.println("FALSE");
            }
        }
        else{
            System.out.println("FALSE");
        }

    }

}
