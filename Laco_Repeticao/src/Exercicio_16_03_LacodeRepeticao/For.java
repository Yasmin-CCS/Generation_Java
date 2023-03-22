package Exercicio_16_03_LacodeRepeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leia = new Scanner (System.in);
	int n1, n2;
	
	System.out.println("Digite o primeiro número do intervalo: ");
	n1 = leia.nextInt();
	System.out.println("Digite o segundo número do intervalo: ");
	n2 = leia.nextInt();
	
	if (n1<n2) {
		
		for (; n1<=n2; n1++) {
			if (n1 % 5 == 0 && n1 % 3 == 0) {
				System.out.println(n1+" é múltiplo de 3 e 5");
			}else {
			}
			
		}
	}else {
		System.out.println("Intervalo inválido!");
	}
	
	}
	
	
		
}


