package tema3For;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variable para número
		int num;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el número
		System.out.println("Elige un número");
		
		//Leo del teclado
		num = sc.nextInt();
		
		//Muestro los números desde el 1 hasta el número
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
