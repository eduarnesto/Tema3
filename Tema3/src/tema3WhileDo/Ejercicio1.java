package tema3WhileDo;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variable para contador
		int contador=1;
		
		//Muestro los 20 número naturales
		do {
			System.out.println(contador++);
		} while (contador<=20);
	}

}