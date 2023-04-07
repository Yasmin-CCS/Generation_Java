package Exercicios15_03_Lacocondicional;

import java.util.Scanner;

public class Exercicio1if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leia = new Scanner (System.in);
	
	Double A,B,C, soma;
	
	System.out.println("\n Digite o número A:");
	A = leia.nextDouble();
	System.out.println("\n Digite o número B:");
	B = leia.nextDouble();
	System.out.println("\n Digite o número C:");
	C = leia.nextDouble();
	
	soma = A + B;
	
	if (soma<C) {
		System.out.println("\n A Soma de A + B é Menor o que C");
	}
	else if (soma>C) {
		System.out.println("\n A Soma de A + B é Maior o que C");
	}
	else {
		System.out.println("\n A Soma de A + B é Igual o que C");
	}
	
	}
	
	}


