package treinamentoc3c;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetorA[] = new int[10];
		int qtdNegativos = 0;
		 for(int i = 0; i<vetorA.length; i++) {
			 System.out.println("Digite o " + (i+1) + " valor:");
			 vetorA[i] = scan.nextInt();
			 
			 if(vetorA[i] < 0) {
				 qtdNegativos++;
			 }
			 
		 }
		 System.out.println(qtdNegativos);
	}

}
