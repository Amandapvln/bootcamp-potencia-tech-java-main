/*
 * Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.   
 * 
 * Entrada:A Entrada será composta por um número inteiro, N. 
 * 
 * Saída: Será  impresso o somatório de N até 0.
 */

import java.util.Scanner;
public class Ifood03 {
    public static void main(String[] args) {

            Scanner numero = new Scanner(System.in);
    
            //TODO: Imprima o somatório de N (utilize o método "somatorio").
        }
    
        /**
         * Método útil que calcula o somatório de um número usando recursividade.
         */
        static int somatorio(int numero) {
            if (numero == 0) {
                return 0;
            } else {
                return numero + somatorio(numero - 1);
            }
    }

        @Override
        public String toString() {
            return "Ifood03 []";
        }
}
