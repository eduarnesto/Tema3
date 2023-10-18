package tema3WhileDo;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variable para contador
		int contador=2;
		
		//Muestro los numeros pares hasta 200
		do {
			System.out.println(contador);
			contador=contador+2;
		} while (contador<=200);
	}
}