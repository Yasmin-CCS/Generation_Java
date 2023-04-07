package Exercicios14_03_Float;

import java.util.Scanner;

public class Exercicio1_float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario, abono, novosalario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o salário:");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o abono:");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		System.out.println ("\n Seu novo salário é "+novosalario);
		

		
		
		
		
	}

}
