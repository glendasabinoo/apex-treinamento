package treinamentoc3c;

import java.util.Scanner;

//Receber as notas da 1a. e 2a. avaliações de um aluno;
//Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado;
//(considerar que nota igual ou maior que 7 o aluno é aprovado);
//Escrever também a média calculada.
public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua 1º nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite sua 2º nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7 && media <=10) {
			System.out.println("Você foi aprovado!");
		} else if (media > 0 && media < 7) {
			System.out.println("Você foi reprovado!");
		} else {
			System.out.println("Nota inválida.");
		}
		

	}

}
