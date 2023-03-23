package estrutura_de_dados;

import java.util.Stack;
import java.util.Scanner;


public class pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		Stack <String> stack = new Stack <String> ();
		String livro;
		int opcao, opcao1;
		
		while (true) {
		System.out.println("\n\n\t********************   ESTANTE   ***************************");
		System.out.println("\n\t1 - Adicionar Livro na pilha");
		System.out.println("\t2 - Listar todos livros");
		System.out.println("\t3 - Retirar livro da pilha");
		System.out.println("\t0 - Sair");
		System.out.println("\n\t***********************************************************");
		opcao = leia.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.println("\n\tDigite o nome do livro: ");
				livro = leia.next();
				stack.push(livro);
				System.out.println("\n\tLivro adicionado com sucesso!");
				break;
			
			case 2:
				System.out.println("\tLista de livros: "+stack);
				break;
				
			case 3:
				if (stack.isEmpty()) {
					System.out.println("\n\tSua estante já está vazia :(\n");
				}else {
					System.out.println("\n\tTem certeza que deseja retirar um livro?\n\t\t1 - SIM   |   2 - CANCELAR");
					opcao1 = leia.nextInt();
					switch(opcao1){
						case 1:
							stack.pop();
							System.out.println("\n\tLivro removido com sucesso!\n");
						case 2:
							break;
					}
				}break;
				
			case 0:
				System.exit(opcao);
				break;
				
			default:
				System.out.println("\n\tEssa opção é inválida :(\n\n\tEscolha uma opção válida: ");
				break;
			
			
		}
		
	  }
	}
}
