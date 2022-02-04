package funciones;
import java.util.Scanner;

public class ejercicioUno
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        printNameCharacters( name );
        printNameLength( name );
        
        System.out.println("Enter your last name: ");
        String lastname = console.next();
        printFullName(name, lastname);
        console.close();
    }

    private static void printFullName(String name, String lastname) {
		String fullName = name +" "+ lastname;
		System.out.println(fullName);
		
	}

	private static void printNameLength( String name )
    {
        int length = name.length();
        System.out.println("La longitud del nombre es "+ length);
    }

    private static void printNameCharacters( String name )
    {
    	for (int i =0; i< name.length(); i++) {
			System.out.println(name.charAt(i));
    }
    

}
}