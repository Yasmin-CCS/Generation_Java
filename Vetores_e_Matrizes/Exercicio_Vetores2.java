package Exercicios_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercicio_Vetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int num, soma=0, cont=0, media=0, posicao;
		
		int[] vet = new int [10];
		
		for (posicao=0; posicao<10; posicao++) {
			System.out.println("Digite o número: ");
			num = leia.nextInt();
			
			vet[posicao] = num;
			cont++;
			soma =+num;
			media = soma/cont;
			
			
				
		} System.out.println("Elementos nos indices impares: "); 
		for (posicao=0; posicao<10; posicao++) {
			if(posicao % 2 != 0) {
			System.out.println(vet[posicao]);
			}
		}
		System.out.println("Elementos pares: "); 
			for (posicao=0; posicao<10; posicao++) {
				if(vet[posicao] % 2 == 0) {
				System.out.println(vet[posicao]);
				}
			}
		System.out.println();
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+media);	
		
		
		
		
	}

}
