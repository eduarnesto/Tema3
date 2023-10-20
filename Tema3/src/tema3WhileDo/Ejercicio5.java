package tema3WhileDo;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variable para el número que adivine el ordenador
		int num;
		
		//Variable para numero minimo adivinado
		int min=1;
		
		//Variable para numero maximo adivinado
		int max=101;
		
		//Variable para guardar la respuesta del usuario
		String respuesta;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//El ordenador adivina el número
		do {
			Random r = new Random();
			num = r.nextInt((min+1),max);
			
			//Muestro el numero adivinado del ordenador
			System.out.println("¿Tu número es mayor, igual o menor que " + num + "?");
			
			//Leo la cadena del teclado
			respuesta=sc.nextLine();
			
			if(respuesta.equalsIgnoreCase("Menor")) {
				max=num;
			} else if (respuesta.equalsIgnoreCase("Mayor")) {
				min=num;
			}
		} while (!respuesta.equalsIgnoreCase("Igual")&&min!=max-1);
		
		//Compruebo si ha hecho trampas
		if(min==max-1) {
			System.out.println("Has hecho trampas");
		} else {
			System.out.println("Tu número es el " + num);
		}
		
		//Cierro el Scanner
		sc.close();
	}
	
}