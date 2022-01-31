package controlDeFlujo;
import java.util.Scanner;

public class movieDiscounts {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresa tu edad:");
		int edad = s.nextInt();
		
		
		if (edad >= 0 && edad < 5) {
			System.out.println("Tienes descuento 60% el costo será "+ 7*.4);
		}
		else if (edad > 60) {
			System.out.println("Tienes descuento de 55% el costo será "+ 7*.45);
		}
		else if (edad >= 5 && edad <= 60) {
			System.out.println("No tienes descuento");
			System.out.println("Dime cuantos boletos quieres");
			int boletos = s.nextInt();
				if (boletos >= 2) {
					System.out.println("Tienes descuento de 20%, el costo será: " +boletos*7*.70);
				}
				else if (boletos == 1) {
					System.out.println("No tienes descuento");
				}
				else {
					System.out.println("Número de datos inválido");
				}
		}
				else {
			System.out.println("Edad inválida");
		}
	} 
	
}
