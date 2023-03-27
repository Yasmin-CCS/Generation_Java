package exercicio5_poo;

import java.util.Scanner;

import exercicio5_poo.classeingresso;

public class Testaingresso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner leia = new Scanner (System.in);
		
		classeingresso cliente = new classeingresso("Laura", "123456", "20/03/2023", "Alianz Park", "Baiana Sistem show");
		
		cliente.visualizar();
	}

}
