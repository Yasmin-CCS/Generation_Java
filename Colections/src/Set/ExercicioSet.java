package Set;

import java.util.Collections;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ExercicioSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Integer> set = new HashSet <Integer>();
		Scanner leia = new Scanner(System.in);
		int contador=1;
		
		
		do {
			System.out.println("Insira o valor: ");
			set.add(leia.nextInt());
			contador++;
			
		} while(contador<11);
		
		Iterator<Integer> iset = set.iterator();
	
		System.out.println(set);
		
		
		
		
		
		
	}

}
