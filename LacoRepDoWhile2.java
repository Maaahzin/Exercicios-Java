package PacoteJava;

import java.util.Scanner;

public class LacoRepDoWhile2 {

	public static void mains(String[]args) {
		Scanner leia = new Scanner (System.in);
		
		int num, cont=0, somaNum=0;
		float media;
		
		System.out.println("Insira um n�mero");
		num=leia.nextInt();
		
		do
		{
			if(num%3==0)
			{
				cont++;
				somaNum+=num;
			}
			System.out.println("Insira um n�mero");
			num=leia.nextInt();
			
		}while (num!=0);
		
		media=(float)somaNum/cont;
		System.out.printf("Informados %d n�mero(s) m�ltiplo(s) de 3. A soma � de %d e a m�dia  � %.2f", cont,somaNum,media);
		
	}
	
}

