package Colection_Lista_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class AulaColections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		int op;
		ArrayList <String> estoque = new ArrayList <String> ();
		
		do {
		
		System.out.println("\n----------------------------------");
		System.out.println("\n\t");
		System.out.println("\n(1)Deseja adicionar produtos ao estoque?");
		System.out.println("\n(2)Deseja remover produtos ao estoque?");
		System.out.println("\n(3)Deseja remover produtos ao estoque?");
		System.out.println("\n(4)Deseja mostrar todos os produtos do estoque?");
		System.out.println("\n(5)Deseja remover produtos ao estoque?");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			leia.nextLine();
			System.out.println("Digite o produto para adicionar ao estoque: ");
			String produto = leia.nextLine();
			estoque.add(produto);
			break;
		
		case 2:
			leia.nextLine();
			System.out.println("Digite o produto para remover ao estoque: ");
			String produtor = leia.nextLine();
			if(estoque.contains(produtor)) {
				estoque.remove(produtor);
			}else {
				System.out.println("Esse produto não existe !!!");
			}
			System.out.println("Produtos do estoque: ");
			System.out.println(estoque);	
			break;
		
		case 3:
			leia.nextLine();
			System.out.println("\nDigite o produto que deseja atualizar: ");
			String verifica = leia.nextLine();
			System.out.println("\nDigite o nome do produto que entrará no lugar");
			String novo = leia.nextLine();
			
			if(estoque.contains(verifica)) {
				estoque.remove(verifica);
				estoque.add(novo);
			}else {
				System.out.println("Esse produto não existe !!!");
			}
			System.out.println("Produtos do estoque: ");
			System.out.println(estoque);	
			break;
			
		case 4:
			System.out.println("Produtos do estoque: ");
			System.out.println(estoque);	
			break;
		
		case 0:
			System.out.println("\nMuito obrigada por utilizar o nosso sistema...");
			break;
			
			default:
				System.out.println("Opção Inválida... Digite novamente: ");
				
		}
		
		}while(op != 0);
	
	}

}
