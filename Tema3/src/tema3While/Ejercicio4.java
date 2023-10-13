package tema3While;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable para guardar el número
		int numero;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un número al usuario
		System.out.println("Introduzca un número. Introduzca el cero para salir");
		numero = sc.nextInt();	
		
		while(numero != 0) {
			if (numero%2==0) {
				System.out.println("El número es par");
			} else {
				System.out.println("El número es impar");
			}
			System.out.println("Introduzca otro número. Introduzca el cero para salir");
			numero = sc.nextInt();
		}
		
		sc.close();
	}

}