import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);

		System.out.println ("Ingresa el di�metro");
		double diametro = s.nextDouble();
		double radio = diametro/2;
		

		double area = (3.1416*radio*radio);
		int myArea = (int)area; 
		
		//System.out.println(area);
		System.out.println(myArea);
		//System.out.println("El �rea del c�rculo es: " + area);
		
		double perimetro = (2*3.1416*radio); //con decimal
		int myPerimetro = (int)perimetro; //con entero
		//System.out.println(perimetro);
		System.out.println(myPerimetro);
		//System.out.println("El per�metro del c�rculo es: "+ perimetro);
		
		

	}
	
}
//A = pi * r2
//P= 2*pi*r
