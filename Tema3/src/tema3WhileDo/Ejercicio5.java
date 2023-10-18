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
			respuesta=sc.next();
			
			if(respuesta.equalsIgnoreCase("Menor")) {
				if(num>min) {
					max=num;
				}
			} else if (respuesta.equalsIgnoreCase("Mayor")) {
				if (num<max) {
					min=num;
				}
			}
			if(min==max-1) {
				System.out.println("Has hecho trampas");
			}
		} while (!respuesta.equalsIgnoreCase("Igual"));
		
		//Muestro el número
		System.out.println("Tu número es el " + num);
		
		//Cierro el Scanner
		sc.close();
	}
	
}