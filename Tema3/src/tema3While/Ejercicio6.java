package tema3While;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		// Variable para guardar las edades
		int edad=0;
		
		//Variable para guardar la suma de las edades
		int suma=0;
		
		//Variable para guardar el número de alumnos
		int alumnos=0;
		
		//Variable para guardar cuantos son mayores de edad
		int mayores=0;
		
		//Variable para guardar la media
		float media = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por la edad
		System.out.println("Introduzca una edad, para salir introduzca una edad negativa");
		
		//Leo la edad del teclado
		edad=sc.nextInt();
		
		//Calculo las estadísticas de las edades
		while (edad>=0) {
			suma+=edad;
			alumnos++;
			if (edad>=18) {
				mayores++;
			}
			System.out.println("Introduzca una edad, para salir introduzca una edad negativa");
			edad=sc.nextInt();
		}
		
		//Calcula la media de las edades
		if(alumnos>0) {
			media = suma/alumnos;
		}
		
		//Imprimo las estadísticas
		System.out.println("La suma de todas las edades introducidas es " + suma);
		System.out.println("La media de las edades es " + media);
		System.out.println("Hay un total de " + alumnos + " alumnos");
		System.out.println(mayores + " alumnos son mayores de edad");
		
		//Cierro el Scanner
		sc.close();
	}
}
