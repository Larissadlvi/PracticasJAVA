package loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = 0;
		
		System.out.println("Enter n: ");
		n = console.nextInt();
		
		int i = 0;
		int past1 = 0;
		int past2 = 1;
		int fibonacci = 0;
		
		do {
			
			if (i > 1) {
				
				fibonacci = past1 + past2;
				System.out.println(i + " " + fibonacci);
				past1 = past2;
				past2 = fibonacci;
			} else {
				
				System.out.println(i + " " + 1);
				
			}
		
			i++;
			
		   }
			
			while(i <= n);

	}

}


	


