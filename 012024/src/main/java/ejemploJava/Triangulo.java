package ejemploJava;

public class Triangulo extends DosDimensiones {

	String estilo;
	
	double area() {
		return base * altura;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: "+estilo);
	}
}
