package Exercicios_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercicio_Matriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int num, linha, coluna, somap=0, somas=0;
		int [][] mat = new int [3][3];
		
		for(linha=0; linha<3; linha++) {
			for(coluna=0; coluna<3; coluna++) {
				
				System.out.println("Digite o número: ");
				num = leia.nextInt();
				mat[linha][coluna]=num;
			}
		}
		System.out.println(mat[1][2]);
		System.out.println("Elementos da Diagonal Principal: ");
		for(linha=0; linha<3;linha++) {
			for(coluna=0; coluna< mat.length; coluna++) {
				if (linha==coluna) {
					System.out.println(mat[linha][coluna]);
					num = mat[linha][coluna];
					somap += num;
				}
			}
		}System.out.print("Soma dos Elementos da Diagonal Principal: "+somap);
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		for(coluna=2; coluna< mat.length; coluna--) {
			for(linha=0; linha<3;linha++) {
				if (coluna+linha == mat.length-1) {
					System.out.println(mat[linha][coluna]);
					num = mat[linha][coluna];
					somas += num;
				}
			
			}
	} System.out.print("Soma dos Elementos da Diagonal Secundária: "+somap);
}
					/*num = mat[linha][coluna];
					somap += num;*/
		
		
			
	}

