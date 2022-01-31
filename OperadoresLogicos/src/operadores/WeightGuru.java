package operadores;
import java.util.Scanner;

public class WeightGuru {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter your weight: ");
		double weight = s.nextDouble();
		
		System.out.println("Enter your height: ");
		double height = s.nextDouble();
		
		double BMI = (weight/(height*height));
		
		if (BMI<19) {
			System.out.println("you are underweight");
		} else if (BMI >=19 && BMI <=24) {
			System.out.println("you're normal");
		} 	else if (BMI >= 25 && BMI <=29 ) {
		System.out.println("you're overweight");
		} else if (BMI >= 30 && BMI<=39) {
		System.out.println("you're obese");
		}
	}
}

