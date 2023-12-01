package u3.entregable;

import java.util.Scanner;

public class loteriaU3entregable {
	public static int [] creaBomboNumeros(int numBolas) {
		
		int [] numeroBolas = new int [100000];
		
		for (int i = 0; i<10000;i++) {
			
			numeroBolas [10000]  = i;
		}
		
		return numeroBolas ;
	}
	
	public static String[] creaBomboPremios(int numPremios) {
		
		String [] premios = new String [1807];
		
		for (int i = 0; i<premios.length;i++) {
			
			if (premios.length == 1) {
				
				premios[1] = "Primer Premio";
		}
			else if (premios.length == 2) {
				
				premios[2] = "Segundo Premio";
			}
			
			else if (premios.length == 3) {
				
				premios[3] = "Tercer Premio";
			}
			
			else if (premios.length >=4 && premios.length <=5) {
				
				premios[4] = "Cuarto Premio";
				premios[5] = "Cuarto Premio";
			}
			
			else if (premios.length >6 && premios.length <=13) {
				
				premios[i] = "Quinto Premio";
			}
			
			else 
				premios[i] = "Premio pedreas";
	}
		
		return premios;
	}
	
	public static int dameNumero(int[]Bombo) {
		
		int numeroAzar;
		
		numeroAzar = (int) (Math.random()*99999+1);
		
		creaBomboNumeros(numeroAzar);
		
		return numeroAzar;
		
	}
	
	public static String damePremio(String[]bombo) {
		
	}
	
	public static void main (String[]args) {
		
		Scanner sc  =new Scanner(System.in);
		
		System.out.println("LISTADO OFICIAL DE PREMIOS");
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		System.out.println("El numero "+numero+" es: "+creaBomboPremios(numero));
		
	}
	
}
