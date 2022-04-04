package treinamentoc3c;

import java.util.Scanner;

//Faça um código para receber um número que é um código de usuário. 
//Caso este código seja diferente de um código armazenado internamente no algoritmo (código de 6 números de sua escolha) deve ser apresentada a mensagem ‘Usuário inválido!’. 
//Caso o Código seja correto, deve ser lido outro valor que é a senha. 
//Se esta senha estiver incorreta (a certa é C3c@9999#) deve ser mostrada a mensagem ‘senha incorreta’. 
//Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codDefinido = 123456;
		String senhaDefinida = "C3c@9999#";
		System.out.println("Entre com código de usuário:");
		int codUsuario = scan.nextInt();
		
		if(codUsuario != codDefinido) {
			System.out.println("Usuário inválido!");
		} else {
			System.out.println("Entre com a senha:");
			String senhaUsuario = scan.next();
			
			if(senhaUsuario.equalsIgnoreCase(senhaDefinida)) {
				System.out.println("Acesso permitido");
			} else {
				System.out.println("Senha incorreta");
			}
		}

	}

}
