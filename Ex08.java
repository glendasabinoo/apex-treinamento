package treinamentoc3c;

import java.util.Scanner;

//Fa�a um c�digo para receber um n�mero que � um c�digo de usu�rio. 
//Caso este c�digo seja diferente de um c�digo armazenado internamente no algoritmo (c�digo de 6 n�meros de sua escolha) deve ser apresentada a mensagem �Usu�rio inv�lido!�. 
//Caso o C�digo seja correto, deve ser lido outro valor que � a senha. 
//Se esta senha estiver incorreta (a certa � C3c@9999#) deve ser mostrada a mensagem �senha incorreta�. 
//Caso a senha esteja correta, deve ser mostrada a mensagem �Acesso permitido�.
public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codDefinido = 123456;
		String senhaDefinida = "C3c@9999#";
		System.out.println("Entre com c�digo de usu�rio:");
		int codUsuario = scan.nextInt();
		
		if(codUsuario != codDefinido) {
			System.out.println("Usu�rio inv�lido!");
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
