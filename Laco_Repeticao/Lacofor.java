package AtividadeGeneration16_03;

import java.util.Scanner;

public class Lacofor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float n1, n2, n3, media, somaMedia=0, mediaGeral;
	int x;
	String nome;
	
	Scanner leia = new Scanner(System.in);
	
	for (x=1;x<=3;x++) {
		System.out.println("\nEntre com o nome do alune: ");
		nome = leia.nextLine();
		System.out.println("\nEntre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		somaMedia += media;
		System.out.println("\nA média do alune "+nome+"foi de: "+media);
		leia.nextLine();
	}
	
	mediaGeral = somaMedia / 3;
	System.out.printf("\nMédia geral da turma foi de:%.2f",mediaGeral);
		
	}

}
