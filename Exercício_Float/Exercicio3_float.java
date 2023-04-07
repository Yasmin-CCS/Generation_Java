package Exercicios14_03_Float;

import java.util.Scanner;

public class Exercicio3_float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		float salariobruto, adicionalnoturno, horasextras, descontos, salarioliquido;
		
		System.out.println("\n Insira seu salário bruto:");
		salariobruto = leia.nextFloat();
		System.out.println("\n Insira seu adicional noturno:");
		adicionalnoturno = leia.nextFloat();
		System.out.println("\n Insira suas horas extras:");
		horasextras = leia.nextFloat();
		System.out.println ("\n Insira seus descontos:");
		descontos = leia.nextFloat();
		
		salarioliquido = salariobruto + adicionalnoturno + (horasextras * 5) - descontos;
		
		System.out.println ("\n Seu salário é:"+salarioliquido);
	}

}
