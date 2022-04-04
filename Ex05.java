package treinamentoc3c;

import java.util.Scanner;

//Fa�a um c�digo que receba: quantidade atual em estoque, quantidade m�xima em estoque e quantidade m�nima em estoque de um produto. 
//Calcular e escrever a quantidade m�dia ((quantidade m�dia = quantidade m�xima + quantidade m�nima)/2). 
//Se a quantidade em estoque for maior ou igual a quantidade m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever mensagem 'Efetuar compra'.
public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantidade atual em estoque:");
		int qtdAtual = scan.nextInt();
		System.out.println("Quantidade m�xima em estoque:");
		int qtdMax = scan.nextInt();
		System.out.println("Quantidade m�nima em estoque:");
		int qtdMin = scan.nextInt();
		
		double qtdMedia = (qtdMax + qtdMin) / 2;
		
		if(qtdAtual >= qtdMedia) {
			System.out.println("N�o efetuar compra!");
		} else {
			System.out.println("Efetuar compra.");
		}

	}

}
