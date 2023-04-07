package Exercicio_16_03_LacodeRepeticao;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		int qnt, num, contagemp=0, contagemi=0;
		
		for (qnt = 1; qnt <= 10; qnt++) {
			System.out.println("Digite o "+qnt+"° :");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				contagemp++;
			}else {
				contagemi++;
			}
		}
		
		System.out.println("\nTotal de números pares: "+contagemp);
		System.out.println("\nTotal de números impares: "+contagemi);
		
	}

}
