package treinamentoc3c;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetorA[] = new int[10];
		int qtdIntervalo = 0;
		int qtdForaIntervalo = 0;
		 for(int i = 0; i<vetorA.length; i++) 
		 {
			 System.out.println("Digite o " + (i+1) + " valor:");
			 vetorA[i] = scan.nextInt();
			 
			 if(vetorA[i] >= 10 && vetorA[i] <=20) {
				 qtdIntervalo++;
			 } else {
				 qtdForaIntervalo++;
			 }
		 }
		 System.out.println("Qtd de números dentro do intervalo [10,20]: " + qtdIntervalo);
		 System.out.println("Qtd de números fora do intervalo [10,20]: " + qtdForaIntervalo);
	}
}
