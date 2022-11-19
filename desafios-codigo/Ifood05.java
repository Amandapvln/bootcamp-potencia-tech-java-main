/*
Uma busca sequencial se caracteriza por percorrermos todos os  elementos de uma estrutura 
em busca do elemento “X” desejado. Neste desafio, dada uma estrutura de vetor A [a1, a2...an],
percorra todo o vetor fazendo as comparações de A[N] = X. Caso a condição seja verdadeira, 
“X” existe na estrutura e a busca será concluída com sucesso. 

Considere um array de 10 elementos do tipo inteiro: 
Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}. 

● Carregue esses elementos em um array.  
● Implementação da busca sequencial: 
● Crie um método  que realiza uma busca sequencial.  
● Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no
array. Caso contrario retorne um texto dizendo que o número não foi encontrado.

 */

import java.util.*;

public class Ifood05 {
    public static void main(String[] args) {
    
      Scanner entrada = new Scanner(System.in);
      
      int tl = entrada.nextInt();
      
      int[] vet = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
            

      int pos = buscaSequencial (vet, tl);
      exibeDadosVetor (vet, tl, pos);
    }

    public static int buscaSequencial (int vet [], int tl){
      
      int i = 0;
      while ((vet[i]!=tl) && (i < 9)){
        i++;
      }
      
      if ((tl==0)||(i>=tl)){ //erro
        i = -1;
      }
      
      return i;
    }
    public static void exibeDadosVetor (int vet [], int tl, int pos){
      
      String msg = "";

      if(pos < 0){
        System.out.println ("Numero " + tl + " nao encontrado!");  
      } 
      else{
        msg = msg + "Achei " + tl + " na posicao " + pos;    
        System.out.println (msg);
      }
    }
}