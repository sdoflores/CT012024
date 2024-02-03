package ejemploJava;

public class Ejemplo_Switch {

	public static void main(String[] args) {
		
		int i = 0;
		
		switch (i) {
			case 0:
				System.out.println("i es cero");
				break;
			case 15:
				System.out.println("i es 15");
				break;
			case 20:
				System.out.println("i es 20");
				break; 
			default:
				System.out.println("i es mayor que 20");
		}

	}

}
