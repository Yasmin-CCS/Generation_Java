package exercicio1_poo;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		ClasseCliente cliente = new ClasseCliente("Laura", "123456", "20", "1,70", "alemã");
		cliente.visualizar();
		
		PessoaFisica fisica = new PessoaFisica ("Laura", "123456", "20", "1,70", "alemã", "145.524.698-87");
		fisica.visualizar();
		
		PessoaJuridica juridica = new PessoaJuridica ("Laura", "123456", "20", "1,70", "alemã", "1565848/0001");
		juridica.visualizar();
	
	}

}
