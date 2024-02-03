package ejemploJava;

public class Ejemplo_Array_Unidimensional {

	public static void main(String[] args) {
		//Ejemplos de declaracion de arreglos
		int intArray[];
		int [] intArray2;
		double doubleArray[];
		
		//declarar un arreglo de Strings
		String[] arr;
		
		//ejemplo de arreglo con enteros
		int [] intArr = new int [] {1,2,3,4,5,6,7,8};
		
		//Asignar memoria para 5 Strings
		arr = new String [5];		
		
		//Inicializar el primer elemento del arreglo
		arr[0]="cero";
		
		//Inicializar el segundo elemento del arreglo
		arr[1] = "uno";
		
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		for (int i = 0; i< arr.length; i++) {
			System.out.println("Elemento en el indice "+i+ ": "+arr[i]);
		}
		
	}

}
