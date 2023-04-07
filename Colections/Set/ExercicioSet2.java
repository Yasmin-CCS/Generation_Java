package Set;

import java.util.Collections;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ExercicioSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Integer> set = new HashSet <Integer>();
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		set.add(2);
		set.add(5);
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(9);
		set.add(7);
		set.add(8);
		set.add(10);
		set.add(6);
		
		System.out.println("\nDigite o número: ");
		
		 numero = leia.nextInt();
		 
		 //* boolean verifica;
		 //*verifica = set.contains(n);
		 		  
		 if (set.contains(numero) == true) {
			 System.out.printf("\n O número %d foi encontrado!",numero);
		 }else {
			 System.out.printf("\n O número %d não foi encontrado :(",numero); 
		 }
		
	}

}
