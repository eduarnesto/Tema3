package tema3For;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable para número
		int num;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pregunto por el número
		System.out.println("Elige un número");

		// Leo del teclado
		num = sc.nextInt();

		// Muestro los números multiplos de 3 hasta el número
		for (int i = 1; i <= num; i += 1) {
			if (i % 3 == 0)
				System.out.println(i);
		}

		// Cierro el Scanner
		sc.close();
	}

}
