package PacoteJava;

import java.util.Scanner;


public class LacoDe4 {

	public static void main(String[] args); {
		
		Scanner leia = new Scanner(System.in);
		
		double num;
		
		System.out.print("Insira um n�mero:");
		num = leia.nextFloat();
		
		if ((num%2==0)) {
			
			System.out.printf("O n�mero %.1f � par e a raiz quadrada � %.2f, num,Math.sqrt (num)"); 
			
		}else {
			
			System.out.println("O n�mero  "+num+" �  �mpar e  elevado ao quadrado � "+Math.pow(num,2)+");"
				
		}
	}
}