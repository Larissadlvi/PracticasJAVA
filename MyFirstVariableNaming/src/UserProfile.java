
import java.util.Scanner;
public class UserProfile {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		Scanner i = new Scanner (System.in);
		
		System.out.println("�Cu�l es tu nombre?");
		String name = s.nextLine();
		System.out.println("�Cu�l es tu edad?");
		int age = i.nextInt();
		System.out.println("Dime tu g�nero");
		String gender = s.nextLine();
		System.out.println("Dime tu preferencia de trabajo");
		String jobPref = s.nextLine();
		System.out.println("Dime tu nacionalidad");
		String nationality = s.nextLine();
		System.out.println("Dime tu tipo de sangre");
		String blood = s.nextLine();
		int birthYear = 2022 - age ; 
		
		System.out.println("Hola "+ name + " tienes " + age + " a�os, eres de g�nero " + gender);
		System.out.println("Tu preferencia laboral es "+ jobPref + " tu nacionalidad es "+ nationality + " y tu tipo de sangre "+ blood);
		System.out.println("Tu a�o de nacimiento es: "+ birthYear);
	}

}
