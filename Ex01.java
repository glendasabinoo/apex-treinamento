package treinamentoc3c;

import java.util.Scanner;

//Receber as notas da 1a. e 2a. avalia��es de um aluno;
//Calcular a m�dia aritm�tica simples e escrever uma mensagem que diga se o aluno foi ou n�o aprovado;
//(considerar que nota igual ou maior que 7 o aluno � aprovado);
//Escrever tamb�m a m�dia calculada.
public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua 1� nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite sua 2� nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7 && media <=10) {
			System.out.println("Voc� foi aprovado!");
		} else if (media > 0 && media < 7) {
			System.out.println("Voc� foi reprovado!");
		} else {
			System.out.println("Nota inv�lida.");
		}
		

	}

}
