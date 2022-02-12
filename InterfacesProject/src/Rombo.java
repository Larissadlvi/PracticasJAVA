
public class Rombo implements FiguraGeometrica{

	private float diagonalMenor;
	private float diagonalMayor;
	private float lado;
	private String nombre;
	
	public Rombo(float diagonalMenor, float diagonalMayor, float lado, String nombre) {
		super();
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
		this.lado = lado;
		this.nombre = nombre;
	} //constructor
	
	public float getDiagonalMenor() {
		return diagonalMenor;
	}//getDiagonalMenor

	public void setDiagonalMenor(float diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}//setDiagonalMenor

	public float getDiagonalMayor() {
		return diagonalMayor;
	}//getDiagonalMayor

	public void setDiagonalMayor(float diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}//setDiagonalMayor


	public float getLado() {
		return lado;
	}//getLado

	public void setLado(float lado) {
		this.lado = lado;
	}//setLado

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	@Override
	public float area() {
		return (diagonalMayor * diagonalMenor)/2;	
	}//area

	@Override
	public float perimetro() {
		return (lado*4);
	}//perimetro

	@Override
	public String getNombre() {
		return nombre;
	}//getNombre
	
	
	
}//Rombo
