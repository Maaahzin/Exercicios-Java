package PacoteJava;

import java.util.Scanner;

public class LacoRepDoWhile2 {

	public static void mains(String[]args) {
		Scanner leia = new Scanner (System.in);
		
		int num, cont=0, somaNum=0;
		float media;
		
		System.out.println("Insira um número");
		num=leia.nextInt();
		
		do
		{
			if(num%3==0)
			{
				cont++;
				somaNum+=num;
			}
			System.out.println("Insira um número");
			num=leia.nextInt();
			
		}while (num!=0);
		
		media=(float)somaNum/cont;
		System.out.printf("Informados %d número(s) múltiplo(s) de 3. A soma é de %d e a média  é %.2f", cont,somaNum,media);
		
	}
	
}

