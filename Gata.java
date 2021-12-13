package PacoteJava;

import java.util.Scanner;


public class Gata {
	public static void main(String[] args) {
		
		System.out.println("Informe a idade da tua gata:");
		Scanner in = new Scanner(System.in);
		
		int idadeGata= in.nextInt();
		idadeGata = idadeGata * 7;
		
		System.out.println("A sua gata tem  "+idadeGata+" anos.");
	}


}
