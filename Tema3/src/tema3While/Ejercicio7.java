package tema3While;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos objeto de la clase random
		Random r = new Random(); 
		
		//Creo una variable para guardar la solución
		int sol= r.nextInt(1,101);
		
		//Creo una variable para guardar la respuesta
		int res;
		
		//Creo un scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Produzco un número al azar
		
		//Pregunto por un número
		System.out.println("Introduzca un número, introduzca -1 para salir");
		
		//Leo el número del teclado
		res = sc.nextInt();
		
		//Compruebo si el número coincide con el resultado
		while (res!=sol && res!=-1) {
			if(res>=1&&res<=100) {
				if(res>sol) {
					System.out.println("El número es más pequeño");
				} else {
					System.out.println("El número es más grande");
				}
			} else {
				System.out.println("Recuerda, es un número entre el 1 y el 100");
			}
			System.out.println("Introduce otro número, introduzca -1 para salir:");
			res = sc.nextInt();
		}
		
		//Imprimo un mensaje de victoria o derrota
		if(res==-1) {
			System.out.println("Te has rendido, suerte la próxima vez");
		} else {
			System.out.println("Enhorabuena, has acertado el número");
		}
		
		//Cierro el scanner
		sc.close();
	}

}
