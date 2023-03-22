package Exercicio_16_03_LacodeRepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite o número: ");
			num = leia.nextInt();
			if (num>0) {
				soma += num;
			}else {
			}
			
		}while (num != 0);
		System.out.println("A soma dos números positivos é:"+soma);
	}

}
