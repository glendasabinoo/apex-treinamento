package treinamentoc3c;

import java.util.Scanner;

//Receber o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
//Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, 
//calcular e escrever o seu salário total.
public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de seu salário fixo:");
		double salarioFixo = scan.nextDouble();
		
		System.out.println("Digite o valor total de vendas realizadas por você:");
		double vendasRealizadas = scan.nextDouble();
		
		double salarioTotal = 0;
		double comissao = 0;
		
		if(vendasRealizadas < 1500) {
			comissao = (3 * vendasRealizadas) / 100;
			salarioTotal = salarioFixo + comissao;
		} else if(vendasRealizadas >= 1500) {
			comissao = (5 * vendasRealizadas) / 100;
			salarioTotal = salarioFixo + comissao;
		}
		
		System.out.println("Valor do salário fixo: " + salarioFixo);
		System.out.println("Valor das vendas realizadas: " + vendasRealizadas);
		System.out.println("Valor da comissão a receber: " + comissao);
		System.out.println("Valor do salário total: " + salarioTotal);

	}

}
