
public class testCalculos {
	public static void main(String[] args) {
			Triangulo t1 = new Triangulo("triángulo", 10, 20, 10, 10, 10);
			Triangulo t2 = new Triangulo("triángulo", 15, 25, 15, 15, 15);
			Cuadrado c1 = new Cuadrado("cuadrado 1", 25);
			Rectangulo r1 = new Rectangulo("rectángulo 1",25, 15);
			Rombo rom1 = new Rombo(5, 10, 3, "rombo 1");
			Romboide romboide1 = new Romboide(12, 6, "romboide 1");
			Trapecio trapecio1 = new Trapecio(4, 6, 6, 10, 4, 10, 8, "trapecio 1");
			
			Calculos.calc(t1);
			Calculos.calc(t2);
			
			Calculos.calc(c1);
			
			Calculos.calc(r1);
			Calculos.calc(rom1);
			Calculos.calc(romboide1);
			Calculos.calc(trapecio1);
			
			

	}//main
} // class testCalculos