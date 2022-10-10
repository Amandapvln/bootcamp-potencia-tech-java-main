
/*
 * Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
 * 
 * Entrada: A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 
 * 
 * Saída: A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, N;
        int result = 0;
        int resultFinal = 0;
        
        
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
       

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        result = (N / A);
        
        for(int i=1; i<=result; i++){
          resultFinal += i*A; //sempre somar e guardar na variável o valor informado.
        }
        System.out.println(resultFinal);
        
    }
}