/*
*Nesse desafio, dados dois números, verifique se eles são iguais. 
*Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas.
*
*Entrada:As entradas serão dois valores, um em cada linha, representados por A e B, 
*que sempre serão números inteiros. 
*
*Saída:A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. 
*Caso contrário,  retorne "Nao sao iguais!", sem as aspas.
*/

package br.com.rd.univers.ms.universdiscount.domain.models;

import java.io.IOException;
import java.util.*;

public class Ifood01 {

    public static void main(String[] args) throws IOException {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        Scanner ler = new Scanner(System.in);//lê o que entrar no sistema
        

        int a = ler.nextInt();
        int b = ler.nextInt();
        if ((a - b) == 0)
            System.out.println("Sao iguais!");
        else
            System.out.println("Nao sao iguais!");
    }
}
