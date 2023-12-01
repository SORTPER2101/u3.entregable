package u3.entregable;

import java.util.Scanner;

public class palindromoU3entregable {
	public static void main (String[]args) {
		Scanner sc  = new Scanner (System.in);
		int igual = 0;
		System.out.println("Escribe una frase");
		
		String frase = sc.next();
		
		for(int i = 0; i < frase.length(); i++) 
			for(int j = frase.length(); j >= 0 ; j--)
				
				if(i==j) {
					System.out.println("Es igual");
					igual++;
				}
				
				else
					System.out.println("No es igual");
			
			if (igual == frase.length()) {
				System.out.println("Es palindromo");
			}
		}
}
