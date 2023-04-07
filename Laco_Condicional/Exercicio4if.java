package Exercicios15_03_Lacocondicional;

import java.util.Scanner;

public class Exercicio4if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		String classe, ordem, alimentacao;
		
		
		System.out.println("\nEntre com a classe: ");
		classe = leia.nextLine();
		
		System.out.println("\nEntre com a ordem: ");
		ordem = leia.nextLine();
		
		System.out.println("\nEntre com a alimentacao: ");
		alimentacao = leia.nextLine();
		
		if(classe.equalsIgnoreCase("vertebrado")) {
			if(ordem.equalsIgnoreCase("ave")) {
				if(alimentacao.equalsIgnoreCase("carnivoro")) {
					System.out.println("É uma águia!");
				} else {
					System.out.println("É uma pomba!");
				}
				
			} else {
				if(alimentacao.equalsIgnoreCase("herbivoro")) {
					System.out.println("É uma vaca!");
				}
				
				else {
					System.out.println("É um ser humano!");
				}
			} 
			} else {
			if(ordem.equalsIgnoreCase("inseto")) {
				if(alimentacao.equalsIgnoreCase("hematofago")) {
				System.out.println("É uma pulga!");
				
				} else {
				  System.out.println("É uma lagarta!");
				
				}
				} else {
				if(alimentacao.equalsIgnoreCase("hematofago")) {
						System.out.println("É uma sanguessuga!");
					} else {
						System.out.println("É uma minhoca!");
					} } }
				
      		
	
	}
	}


