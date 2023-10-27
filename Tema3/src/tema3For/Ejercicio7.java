package tema3For;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variable para número
		int num;

		// Variable para el factorial
		int factorial = 1;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pregunto por el número
		System.out.println("Elige un número");

		// Leo del teclado
		num = sc.nextInt();

		// Muestro el factorial del numero
		for (int i = num; i >= 2; i -= 1) {
			factorial = factorial * i;
		}

		System.out.println("El factorial de " + num + " es " + factorial);

		// Cierro el Scanner
		sc.close();
	}

}
