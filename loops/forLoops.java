package loops;

import java.util.Scanner;

public class forLoops {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Introduce tu nombre: ");
		String nombres = s.nextLine();

		int contador = nombres.length();
		
		for (int i =0; i<= contador-1; i++) {
			System.out.println(nombres.charAt(i));
			}
		}


	}


