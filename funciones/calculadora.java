package funciones;

import java.util.Scanner;

public class calculadora {
	
	static double suma(double a, double b) {
		return a+b;
	}
	static double resta(double a, double b) {
		return a-b;
	}
	static double multiplicacion(double a, double b) {
		return a*b;
	}
	static double division(double a, double b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner (System.in);
		System.out.println("Introduce el primer n�mero");
		double x = s1.nextDouble();
		Scanner s2 = new Scanner (System.in);
		System.out.println("Introduce el segundo n�mero");
		double y = s2.nextDouble();
		
		System.out.println("La suma es: " + suma(x,y));
		System.out.println("La resta es: " + resta(x,y));
		System.out.println("La multiplicaci�n es: " + multiplicacion(x,y));
		System.out.println("La divisi�n es: " + division(x,y));
		
	}
	
}
