package Exercicios_Vetores_e_Matrizes;
import java.util.Scanner;
public class Exercicio_Matriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					
			int valor=1,linha,coluna,somaDiagonal=0;
			
			int [][] mat = new int [3][3];
			
				
			for (linha=0; linha<3; linha++) {
				for (coluna=0; coluna<3; coluna++) {
						mat[linha][coluna]=valor;
						valor++;
					
					if(linha == coluna) {
					somaDiagonal += mat[linha][coluna];
					}
				}
			
			} System.out.print(somaDiagonal);
			
		}
	}


