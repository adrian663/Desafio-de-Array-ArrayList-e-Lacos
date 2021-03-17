/*
1 - Faça um programa para ler um vetor com valor indeterminado. Após isto, ler 
mais um número qualquer, calcular (soma) e escrever quantas vezes esse número
aparece no vetor. Sempre imprimir na tela os processos do vetor.
*/
package exercício01;
import java.util.ArrayList;
import java.util.Scanner;


public class Exercício01 {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList();
        
        System.out.println("Digite quantos numeros quiser e após digite zero para ir para a próxima etapa: ");
        
        int numeroDigitado = 1;
        
        while(numeroDigitado != 0){
            System.out.println("Digite um numero:");
        numeroDigitado = ler.nextInt();
        vetor.add(numeroDigitado);   
        }
        
        System.out.println("Digite um número para somar com todos os anteriores: ");
        int soma = ler.nextInt();
        int soma2 = soma;
        for(int numero : vetor){
            soma = soma + numero;            
        }
        System.out.println("A soma dos números anteriores é igual à: " + soma);
        
        int quantidade = 0;
        for(int numero : vetor){           
            if(soma2 == numero){
                quantidade = quantidade + 1;              
            }else{
                quantidade = quantidade;
            }
        }
        System.out.println("O número " + soma2 + " que você escolheu  para somar, aparece " + quantidade +
                " vezes no vetor.");
        
    }
    
}
