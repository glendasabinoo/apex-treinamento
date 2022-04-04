package treinamentoc3c;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número:");
		int x = scan.nextInt();
		System.out.println("Digite outro número:");
		int y = scan.nextInt();
		
		int z = (x*y) + 5;
		String resposta;
		
		if(z <= 0) {
			resposta = "A";
		} else if(z <= 100) {
			resposta = "B";
		} else {
			resposta = "C";
		}
		
		System.out.println("Z = " + z);
		System.out.println("Resposta = " + resposta);

	}

}
