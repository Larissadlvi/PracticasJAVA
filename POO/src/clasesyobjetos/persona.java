package clasesyobjetos;

public class persona {
	
	//atributos
	private String nombre;
	private String apellido;
	private int edad;

	public static void main(String[] args) {
		
		persona persona1 = new persona("Larissa", "De La Vega",25);
		System.out.println("El nombre de la persona es: "+ persona1.getNombre());
		System.out.println("El apellido de la persona es: "+ persona1.getApellido());
		System.out.println("La edad de la persona es: "+ persona1.getEdad());
		
		
		persona persona2 = new persona("","",0);
		persona2.setNombre("Felipe");
		persona2.setApellido("Maqueda");
		persona2.setEdad(29);
		System.out.println("El nombre de la persona es: "+ persona2.getNombre());
		System.out.println("El apellido de la persona es: "+ persona2.getApellido());
		System.out.println("La edad de la persona es: "+ persona2.getEdad());
		
	}

	public persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	
}
