package PacoteJava;

import java.util.Scanner;

public class LacoRepWhile1{

	public static void main(String[] args)[]) {
		
		Scanner ler = new  Scanner (System.in);
		
		int x, idade, TotalPM21=0, TotalPMA50=0;
		
		
	System.out.println("Informe sua idade, por gentileza:");
	
	idade = ler.nextInt();
	
	while(idade!=-99)
		
	{
		
	if(idade<21)
	{
		TotalPM21++;
	}
	else if (idade>50)
	{
		TotalPMA50++;
	}
	else
	{
		
	System.out.println("Idade não aceita!");
	}
	System.out.println("Total de pessoas com menos de 21 anos é:"+TotalPM21);
	System.out.println("Total de pessoas com mais de 50 anos é:"+TotalPMA50);
	
	}
	
}
