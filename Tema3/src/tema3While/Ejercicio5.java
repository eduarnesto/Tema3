package tema3While;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variable para guardar el número
		int numero;
		
		//Variable para guardar la suma de los positivos
		int sumapos=0;
		
		//Variable para guardar el número de ceros
		int ceros=0;
		
		//Variable para guardar la suma de negativos
		int sumaneg=0;
		
		//Variable para guardar el número de negativos
		int negativos=0;
		
		//Variable para guardar la media
		float media = 0;
		
		//Variable para guardar cuantos números se han escrito
		int contador = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		while(contador < 10) {
			contador++;
			
			// Pedimos un número al usuario
			System.out.println("Introduzca un número");
			numero = sc.nextInt();	
			
			if (numero>0) {
				sumapos+=numero;
			}
			if (numero==0){
				ceros++;
			}
			if (numero<0){
				sumaneg+=numero;
				negativos++;
			}
		}
		//Calculo la media de los negativos
		
		if(negativos>0) {
			media=sumaneg/negativos;
		}
		
		//Muestro la suma de positivos
		System.out.println("La suma de los positivos es: " + sumapos);
		
		//Muestro la cantidad de ceros
		System.out.println("Se han introducido: " + ceros + " ceros");
		
		//Muetsro la media de los negativos
		System.out.println("La media de los números negativos es: " + media);
		
		//Cierro el Scanner
		sc.close();
	}
}