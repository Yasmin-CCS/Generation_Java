package exercicio1_poo;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		ClasseCliente cliente = new ClasseCliente("Laura", "123456", "20", "1,70", "alemã");
		
		cliente.visualizar();
		
	}

}
