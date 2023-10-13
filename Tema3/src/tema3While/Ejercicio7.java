package tema3While;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Creo una variable para guardar la respuesta
		int res;
		
		//Creo una variable para guardar la solución
		int sol;
		
		//Creo un scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Produzco un número al azar
		Random r = new Random();
		sol = r.nextInt(1,101);
		
		//Pregunto por un número
		System.out.println("Introduzca un número");
		
		//Leo el número del teclado
		res = sc.nextInt();
		
		//Compruebo si el número coincide con el resultado
		while (res!=sol) {
			System.out.println("Ese número no es el correcto, introduzca otro número");
			res = sc.nextInt();
		}
		
		//Imprimo un mensaje de victoria
		System.out.println("Enhorabuena, has acertado el número");
		
		//Cierro el scanner
		sc.close();
	}

}
