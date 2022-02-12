
public class Trapecio implements FiguraGeometrica {
	private float l1;
	private float l2;
	private float l3;
	private float l4;
	private float baseMenor;
	private float baseMayor;
	private float altura;
	private String nombre;
	public Trapecio(float l1, float l2, float l3, float l4, float baseMenor, float baseMayor, float altura,
			String nombre) {
		super();
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
		this.nombre = nombre;
	}//constructor
	
	public float getL1() {
		return l1;
	}//getLado1
	
	public void setL1(float l1) {
		this.l1 = l1;
	}//getLado2
	
	public float getL2() {
		return l2;
	}//getLado3
	
	public void setL2(float l2) {
		this.l2 = l2;
	}//getLado2
	
	public float getL3() {
		return l3;
	}//getLado3
	
	public void setL3(float l3) {
		this.l3 = l3;
	}//setLado3
	
	public float getL4() {
		return l4;
	}//getLado4
	
	public void setL4(float l4) {
		this.l4 = l4;
	}//setLado4
	
	public float getBaseMenor() {
		return baseMenor;
	}//getbaseMenor
	
	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}//setbaseMenor
	
	public float getBaseMayor() {
		return baseMayor;
	}//getbaseMayor
	
	public void setBaseMayor(float baseMayor) {
		this.baseMayor = baseMayor;
	}//setbaseMayor
	
	public float getAltura() {
		return altura;
	}//getAltura
	
	public void setAltura(float altura) {
		this.altura = altura;
	}//setAltura
	
	public String getNombre() {
		return nombre;
	}//getNombre
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	
	@Override
	public float area() {	
		return (altura * (baseMayor + baseMenor)/2);
	}//area
	
	@Override
	public float perimetro() {
		return l1+l2+l3+l4;
	}//perimetro
	
	
	
	
}//class trapecio
