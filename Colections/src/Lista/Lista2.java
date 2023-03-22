package Lista;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> lista = new ArrayList <Integer> ();
		
		Scanner leia = new Scanner(System.in);
		
		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(8);
		lista.add(10);
		lista.add(6);
		
		System.out.println("\nDigite o número que você quer encontrar:");
		int numero = leia.nextInt();
		
		if (lista.contains(numero) == true) {
		int	posicao = 1 + lista.indexOf(numero);
			System.out.println("\nO número "+numero+" está localizado na posição "+posicao);
		}else {
			System.out.println("\nO número "+numero+" não foi encontrado :(");
		}
			
	}

}
