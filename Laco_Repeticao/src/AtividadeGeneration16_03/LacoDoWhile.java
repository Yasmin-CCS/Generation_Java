package AtividadeGeneration16_03;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabuada, x=1, resultado;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite a tabuada que deseja visualizar: ");
		tabuada = leia.nextInt();
		
		do {
			resultado = tabuada * x;
			System.out.println("\n"+tabuada+" X "+x+" = "+resultado);
			x++;
			
		}while (x<=10);
		
		
		
	}

}
