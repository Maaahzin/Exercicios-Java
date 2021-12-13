package PacoteJava;

import java.util.Scanner;


public class ProgramacaoSequencial2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, totalDias;
		
		System.out.println("Informe o total de dias que viveu?");
		
		totalDias=leia.nextInt();
		
		anos = totalDias/365;
		
		meses= (totalDias%365)/30;
		
		dias = meses*30;
		
		System.out.println("Você viveu"+anos+" ano (s), "+meses+", mês(es) e "+dias+" dia(s).");
		
		
	}

}
