package treinamentoc3c;

import java.util.Scanner;

//Receber a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) 
//e calcule a duração do jogo em horas, 
//sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a hora de início do jogo:");
		int horaInicio = scan.nextInt();
		System.out.println("Digite a hora de fim do jogo:");
		int horaFim = scan.nextInt();
		
		int duracaoJogo = horaFim - horaInicio; 

	}

}
