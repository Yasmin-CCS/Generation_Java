package Exercicios14_03_Float;

import java.util.Scanner;

public class Exercicio2_float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Insira a nota 1:");
		nota1 = leia.nextFloat();
		System.out.println("\n Insira a nota 2:");
		nota2 = leia.nextFloat();
		System.out.println("\n Insira a nota 3:");
		nota3 = leia.nextFloat();
		System.out.println("\n Insira a nota 4");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("\n Sua média é:"+media);
		
	}

}
