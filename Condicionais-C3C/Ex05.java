package treinamentoc3c;

import java.util.Scanner;

//Faça um código que receba: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto. 
//Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2). 
//Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever mensagem 'Efetuar compra'.
public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantidade atual em estoque:");
		int qtdAtual = scan.nextInt();
		System.out.println("Quantidade máxima em estoque:");
		int qtdMax = scan.nextInt();
		System.out.println("Quantidade mínima em estoque:");
		int qtdMin = scan.nextInt();
		
		double qtdMedia = (qtdMax + qtdMin) / 2;
		
		if(qtdAtual >= qtdMedia) {
			System.out.println("Não efetuar compra!");
		} else {
			System.out.println("Efetuar compra.");
		}

	}

}
