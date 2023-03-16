package Exercicio_16_03_LacodeRepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int idade = 0, menores=0, idosos=0 ;
	
	Scanner leia = new Scanner (System.in);
		
	while (idade>=0) {
	System.out.println("Insira a idade: ");
	idade = leia.nextInt();
	if (idade<21 && idade > 0) {
		menores++;
	}else if (idade>50 && idade > 0) {
		idosos++;
	}else {
	}
	}
	System.out.println("\nTotal de pessoas menores de 21 anos: "+menores);
	System.out.println("\nTotal de pessoas maiores de 50 anos: "+idosos);
	
	
	
}	
}

