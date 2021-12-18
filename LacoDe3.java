package PacoteJava;

import java.util.Scanner;

public class LacoDe3 {
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.print ("Digite sua idade:");
		idade = leia.nextInt();
		
		if (idade>=10 && idade < 15) {
		
			System.out.printf("Sua categoria é INFANTIL!");
			
	} else if (idade >=15 && idade < 18); {
			
			System.out.printf("Sua categoria é JUVENIL!");
			
		} else if (idade >= 18 && idade<= 25 ); {
			
			System.out.printf("Sua categoria é ADULTO!");
			
		}else{
			
			System.out.printf("Sua idade não se enquadra em nenhuma categoria!");
					
		}	
		
	}
	

}
