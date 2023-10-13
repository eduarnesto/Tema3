package tema3While;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Variable para guardar al altura de los árboles
		float altura;
		
		//Variable para guardar la mayor altura
		float mayor=0;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por la altura del árbol
		System.out.println("Introduzca la altura del árbol, para salir introduzca -1");
		
		//Leo la altura del teclado
		altura = sc.nextFloat();
		
		//Compruebo que arbol es el mas alto
		while(altura!=-1) {
			if(altura>mayor) {
				mayor=altura;
			}
			System.out.println("Introduzca la altura del árbol, para salir introduzca -1");
			altura = sc.nextFloat();
		}
		
		//Imprimo la altura del arbol mas grande
		System.out.println("El árbol más alto tiene " + mayor + "cm");
		
		//Cierro el scanner
		sc.close();
	}

}
