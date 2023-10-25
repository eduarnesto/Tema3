package tema3For;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variable para número
		int num;
		
		//Variable para sumar los numeros
		int suma=0;
		
		//Variable para la media
		int media;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Muestro los números desde el 1 hasta el número
		for(int i=1;i<=10;i++) {
			//Pregunto por el número
			System.out.println("Elige un número");
			
			//Leo del teclado
			num = sc.nextInt();
			
			suma+=num;
		}
		
		//Calculo la media
		if(suma!=0) {
			media=suma/10;
			System.out.println("La media de los números introducidos es " + media);
		} else {
			System.out.println("No se puede calcular la media");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
