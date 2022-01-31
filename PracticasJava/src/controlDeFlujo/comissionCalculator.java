package controlDeFlujo;
import java.util.Scanner;

public class comissionCalculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresa el total de tu compra");
		int venta = s.nextInt();
		
		if(venta >= 10000) {
			System.out.println("tu comisión es de: " + venta*.30);
		}
		else if (venta >= 5001 && venta <= 9999) {
			System.out.println("tu comisión es de: " + venta*.20);
		}
		else if (venta >= 1001 && venta < 5001) {
			System.out.println("tu comisión es de: " + venta*.10);
		}
		else if (venta <= 1000 && venta <= 0) {
			System.out.println("no aplica comisión");
		}
		else {
			System.out.println("datos incorrectos");
		}

	}

}
