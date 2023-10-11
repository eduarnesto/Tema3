package tema3While;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variable para guardar el numero de positivos
		int positivos = 0;
		
		// Valor que vamos a leer del teclado
		int numero;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un número al usuario
		System.out.println("Introduzca un número. Valor negativo para salir");
		numero = sc.nextInt();	
		
		while(numero >= 0) {
			positivos++;
			
			// Pedimos un número al usuario
			System.out.println("Introduzca un número. Valor negativo para salir");
			numero = sc.nextInt();
		}
		
		// Imprimimos el resultado de la suma
		System.out.println("Total de números positivos introducidos: " + positivos);
		sc.close();
	}

}