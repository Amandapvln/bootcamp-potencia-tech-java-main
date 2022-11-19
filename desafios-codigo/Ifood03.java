/*
Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.   

Entrada:A Entrada será composta por um número inteiro, N. 

Saída: Será  impresso o somatório de N até 0.
 
Exemplo:
somatorio(5) = somatorio(4)+5 = 15
somatorio(4) = somatorio(3)+4 = 10
somatorio(3) = somatorio(2)+3 = 6
somatorio(2) = somatorio(1)+2 = 3
somatorio(1) = somatorio(0)+1 = 1
somatorio(0) = 0
*/

import java.io.IOException;
import java.util.*;
public class Ifood03 {

    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();
        System.out.println(somatorio(n));
    }
        
        static int somatorio(int n){
        if (n == 0){ 
            return 0;
        } else{
            return n + somatorio(n - 1);       
        }
    }        
}
