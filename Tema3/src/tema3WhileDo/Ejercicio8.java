package tema3WhileDo;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Variable para guardar la primera tirada
		String tirada1;
		
		//Variable para guardar la segunda tirada
		String tirada2;
		
		//Variable para guardar la suma de las tiradas
		int suma;
		
		//Variable para guardar el valor de la primera tirada
		int num1 = 0;
		
		//Variable para guardar el valor de la segunda tirada
		int num2 = 0;
				
		//Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Obtengo el valor de la primera tirada
		do {
			//Pregunto la primera tirada
			System.out.println("Introduzca el número de la primera tirada en letras mayúsculas");
					
			//Leo la cadena del teclado
			tirada1 = sc.next();
			
			//Compruebo el valor de la primera tirada
			switch (tirada1) {
			case "UNO"->{
				num1=1;
			}
			case "DOS"->{
				num1=2;
			}
			case "TRES"->{
				num1=3;
			}
			case "CUATRO"->{
				num1=4;
			}
			case "CINCO"->{
				num1=5;
			}
			case "SEIS"->{
				num1=6;
			}
			default->{
				System.out.println("Elección no válida");
			}
			}
		} while(num1==0);
		
		//Obtengo el valor de la segunda tirada
		do {
			//Pregunto la primera tirada
			System.out.println("Introduzca el número de la segunda tirada en letras mayúsculas");
					
			//Leo la cadena del teclado
			tirada2 = sc.next();
			
			//Compruebo el valor de la segunda tirada
			switch (tirada2) {
			case "UNO"->{
				num2=1;
			}
			case "DOS"->{
				num2=2;
			}
			case "TRES"->{
				num2=3;
			}
			case "CUATRO"->{
				num2=4;
			}
			case "CINCO"->{
				num2=5;
			}
			case "SEIS"->{
				num2=6;
			}
			default->{
				System.out.println("Elección no válida");
			}
			}
		} while(num2==0);
		
		//Realizo la suma de las tiradas
		suma = num1 + num2;
		
		//Muestro el resultado
		System.out.println("La suma de las dos tiradas es " + suma);
		
		//Cierro el Scanner
		sc.close();

	}

}