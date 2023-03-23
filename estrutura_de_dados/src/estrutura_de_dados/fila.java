package estrutura_de_dados;

import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int opcao, opcao1;
		String nome;
		
		Queue <String> queue = new LinkedList <String> ();
		
		while(true) {
		
		System.out.println("\n\n\t***************   BB - O BANCO BONITO   *******************");
		System.out.println("\n\t1 - Adicionar Cliente na Fila");
		System.out.println("\t2 - Listar todos os Clientes na fila");
		System.out.println("\t3 - Chamar (retirar) uma pessoa da fila");
		System.out.println("\t0 - Sair");
		System.out.println("\n\t***********************************************************");
		opcao = leia.nextInt();
		
		
		switch (opcao) {
		
		case 1:
			System.out.println("\n\tDigite o nome do cliente: ");
			nome = leia.next();
			queue.add(nome);
			System.out.println("\n\tCliente Adicionado!\n");
			break;
		
		case 2:
			System.out.println("\n\tLista de clientes: "+queue);
			break;
			
		case 3:
			if (queue.isEmpty()) {
				System.out.println("\nNão existem clientes\n");
			}else {
				System.out.println("\n\tTem certeza que deseja remover o cliente?\n\t\t1 - SIM   |   2 - CANCELAR");
				opcao1 = leia.nextInt();
				switch(opcao1){
					case 1:
						queue.remove();
						System.out.println("\nCliente Removido!\n");
					case 2:
						break;
				}
			}
			break;
			
		case 0:
			default:
				System.out.println("\n\tEssa opção é inválida :(\n\n\tPor favor escolha uma opção válida: ");
				break;
		}
		}	
	}

}
