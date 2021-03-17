/*
- Leia um vetor de 20 posições. Contar e escrever quantos valores pares e ímpares ele possui.
Imprimir na tela
*/
package exercício02;


public class Exercício02 {

    
    public static void main(String[] args) {
        int [] vetor = {10,20,30,40,50,11,21,31,41,51,12,22,32,42,52,13,23,33,43,53};
        
        int quantidadePar = 0;
        int quantidadeImpar = 0;
        for(int numero : vetor){
            if(numero % 2 == 0){
                quantidadePar = quantidadePar + 1;
            }else{
                quantidadeImpar = quantidadeImpar + 1;
            }
        }
        System.out.println("O vetor possui " + quantidadePar + " números pares, e " + quantidadeImpar
                           + " números ímpares!");  
        
    }
    
}
