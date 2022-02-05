package clases; // con Guillermo

public class Gatitos {
	
	//Atributos y/o Estado
	private String nombre; //Variable tipo cadena
	private String color;
	private String ojos;
	private String raza;
	int edad; 
	
	public static void main(String[] args) {
		
		Gatitos gatito1 = new Gatitos("Perejil", "Negro", "Cafés", "Esfinge", 3);
		Gatitos gatito2 = new Gatitos("Cilantro", "Blanco", "Azul", "Persa", 4);
		
		System.out.println(gatito1.getNombre());
		System.out.println(gatito2.getNombre());
		
		System.out.println("Mi gatito se llama "+ gatito2.getNombre()+ " es de color "+ gatito2.getColor() + " tiene ojos color " + gatito2.getOjos() + " es de raza " + gatito2.getRaza() + " y tiene " + gatito2.getEdad() + " años de edad");
	}
	
	//Constructor
	public Gatitos(String nombre, String color, String ojos, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.ojos = ojos;
		this.raza = raza;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
