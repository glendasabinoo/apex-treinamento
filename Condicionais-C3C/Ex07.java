package treinamentoc3c;

import java.util.Scanner;

//Escreva um código que receba as idades de 2 homens e de 2 mulheres 
//(considere que as idades dos homens serão sempre diferentes entre si, bem como as das mulheres). 
//Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova;
//e o produto das idades do homem mais novo com a mulher mais velha.
public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a idade do homem 1:");
		int homem1 = scan.nextInt();
		System.out.println("Entre com a idade do homem 2:");
		int homem2 = scan.nextInt();
		System.out.println("Entre com a idade da mulher 1:");
		int mulher1 = scan.nextInt();
		System.out.println("Entre com a idade da mulher 2:");
		int mulher2 = scan.nextInt();
		
		int homemVelho = 0;
		int homemNovo = 0;
		int mulherVelha = 0;
		int mulherNova = 0;
		
		if(homem1 > homem2) {
			homemVelho = homem1;
			homemNovo = homem2;
		} else {
			homemVelho = homem2;
			homemNovo = homem1;
		}
		
		if(mulher1 > mulher2) {
			mulherVelha = mulher1;
			mulherNova = mulher2;
		} else {
			mulherVelha = mulher2;
			mulherNova = mulher1;
		}
		
		System.out.println("Soma da idade do homem mais velho com a mulher mais nova: " + (homemVelho + mulherNova));
		System.out.println("Produto da idade do homem mais novo com a mulher mais velha: " + (homemNovo * mulherVelha));
	}

}
