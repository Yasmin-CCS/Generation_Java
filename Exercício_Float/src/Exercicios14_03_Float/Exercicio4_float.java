package Exercicios14_03_Float;

import java.util.Scanner;


public class Exercicio4_float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		float n1, n2, n3, n4, calculo;
		
		System.out.println("\n numero 1:");
		n1 = leia.nextFloat();
		System.out.println("\n numero 2:");
		n2 = leia.nextFloat();
		System.out.println("\n numero 3:");
		n3 = leia.nextFloat();
		System.out.println("\n numero 4:");
		n4 = leia.nextFloat();
		
		calculo = (n1*n2)-(n3*n4);
		
		System.out.println(calculo);		
		
	}

}
