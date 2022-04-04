package treinamentoc3c;
import java.util.Scanner;
//Receber 3 valores e armazena-los em ordem crescente em um array usando somente estruturas de condição.
public class Ex02 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com primeiro número:");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com segundo número:");
        int num2 = scan.nextInt();
        
        System.out.println("Entre com terceiro número:");
        int num3 = scan.nextInt();
        
        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            //num1 é menor
            //num3 é maior
            // num1 < num2 < num3
            System.out.println(num1 + " - " + num2 + " - " + num3);
        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
            //num1 é menor
            //num2 é maior
            // num1 < num3 < num2
            System.out.println(num1 + " - " + num3 + " - " + num2);
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3){
            //num2 é menor
            //num3 é maior
            // num2 < num1 < num3
            System.out.println(num2 + " - " + num1 + " - " + num3);
        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1){
            //num2 é menor
            //num1 é maior
            // num2 < num3 < num1
            System.out.println(num2 + " - " + num3 + " - " + num1);
        } else if (num3 <= num1 && num3 <= num2 && num1 <= num2){
            //num3 é menor
            //num2 é maior
            // num3 < num1 < num2
            System.out.println(num3 + " - " + num1 + " - " + num2);    
        } else {
            //num3 é menor
            //num1 é maior
            // num3 < num2 < num1
            System.out.println(num3 + " - " + num2 + " - " + num1);  
        }
		}
	}
