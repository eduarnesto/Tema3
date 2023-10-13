package tema3While;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable para guardar la suma
		int suma = 0;
		
		//Variable para guardar el numero de positivos
		int positivos = 0;
		
		//Variable para guardar la media
		float media=0;
		
		// Valor que vamos a leer del teclado
		int numero;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un número al usuario
		System.out.println("Introduzca un número. Valor negativo para salir");
		numero = sc.nextInt();	
		
		while(numero >= 0) {
			suma+=numero;
			positivos++;
			
			// Pedimos un número al usuario
			System.out.println("Introduzca un número. Valor negativo para salir");
			numero = sc.nextInt();
		}
		
		if(positivos>0) {
			media=suma/positivos;
		}
		
		// Imprimimos el resultado de la suma
		System.out.println("La media de los numeros positivos introducidos es: " + media);
		sc.close();
	}

}
