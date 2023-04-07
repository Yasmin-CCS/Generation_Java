package Exercicios_Vetores_e_Matrizes;
import java.util.Scanner;
public class Exercicio_Vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner leia = new Scanner(System.in);

				int[] vet = new int[10];
				int posicao, valor, numero;

				for (posicao = 0; posicao < 9; posicao++) {
					System.out.print("Digite o valor: ");
					vet[posicao] = leia.nextInt();
				}

				/* System.out.print(vet[4]); */
				System.out.print("Digite o numero que você quer achar na array: ");  
				numero = leia.nextInt();
				for(posicao = 0; posicao < 9; posicao++) {
					if (vet[posicao] == numero) {
						System.out.print("\nO numero "+numero+" está na posição "+posicao);
					}
				}
				
				if (vet[posicao] != numero) {
						System.out.println("\nO número "+numero+" não foi encontrado!");
					}
				}
				  
				 
			}

