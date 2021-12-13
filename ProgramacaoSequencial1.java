package PacoteJava;

import java.util.Scanner;


public class ProgramacaoSequencial 
{
	
	public static void main(String[] args)
	{
		
		System.out.println("Qual sua idade?");
		Scanner leia = new Scanner(System.in);
		
		
		int anos, meses, dias, totalDias;
		
		System.out.println("\nQuantos anos viveu?");
		anos=leia.nextInt();
		
		System.out.println("Quantos meses viveu?");
		meses=leia.nextInt();
				
		System.out.println("Quantos dias viveu?");
		dias=leia.nextInt();
		
		totalDias = anos*365 + meses*30 + dias;
		
		System.out.println("Você viveu"+totalDias+"dia (s)");
		
	}
				
	}


	
