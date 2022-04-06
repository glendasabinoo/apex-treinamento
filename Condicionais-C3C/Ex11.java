package treinamentoc3c;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetorA[] = new int[10];
		int soma = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			 System.out.println("Digite o " + (i+1) + " valor:");
			 vetorA[i] = scan.nextInt();
			 
			 if(vetorA[i] < 40) {
				 soma += vetorA[i];
			 } 
		}
		System.out.println("Soma dos valores inferiores a 40: " + soma);

	}

}
