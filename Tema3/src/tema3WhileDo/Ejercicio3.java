package tema3WhileDo;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable para contador
		int contador=1;
		
		//Variable para el numero
		int numero;
		
		//Variable para la suma
		int suma=0;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto un numero
		System.out.println("Introduzca un número");
		
		//Leo el numero del teclado
		numero=sc.nextInt();
		
		//Realizo la suma de los números hasta el número introducido
		do {
			suma+=contador++;
		} while (contador<=numero);
		
		//Muestro la suma
		System.out.println("La suma de los números hasta el número introducido es " + suma);
		
		//Cierro el Scanner
		sc.close();
	}
	
}