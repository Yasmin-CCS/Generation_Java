package Lista;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList <String> lista = new ArrayList <String> ();
	
	Scanner leia = new Scanner(System.in);
	
	do {
		System.out.println("\n Digite a cor: ");
		lista.add(leia.nextLine());
	} while(lista.size()<5);
	
	System.out.println("Listar todas as cores:"+lista);
	
	Collections.sort(lista);
	System.out.println("Ordenando as cores em ordem alfabética: "+lista);
	
	
	
	
	
	
	}

}
