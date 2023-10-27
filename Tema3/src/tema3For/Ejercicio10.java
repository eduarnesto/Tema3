package tema3For;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Variable para el número A
		int a;

		// Variable para el número B
		int b;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pregunto por el número A
		System.out.println("Introduzca el número A");

		// Leo del teclado
		a = sc.nextInt();

		// Pregunto por el número B
		System.out.println("Introduzca el número B");

		// Leo del teclado
		b = sc.nextInt();

		// Muestro los números desde el más grande al más pequeño
		if (a <= b) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = b; i <= a; i++) {
				System.out.println(i);
			}
		}

		// Cierro el Scanner
		sc.close();
	}

}
