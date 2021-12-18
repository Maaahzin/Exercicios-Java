package PacoteJava;

import java.util.Scanner;


public class LacoDe4 {

	public static void main(String[] args); {
		
		Scanner leia = new Scanner(System.in);
		
		double num;
		
		System.out.print("Insira um número:");
		num = leia.nextFloat();
		
		if ((num%2==0)) {
			
			System.out.printf("O número %.1f é par e a raiz quadrada é %.2f, num,Math.sqrt (num)"); 
			
		}else {
			
			System.out.println("O número  "+num+" é  ímpar e  elevado ao quadrado é "+Math.pow(num,2)+");"
				
		}
	}
}
