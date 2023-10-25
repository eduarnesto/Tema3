package tema3For;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Variable para número
		int num;
		
		//Variable para saber si es primo
		boolean primo=true;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el número
		System.out.println("Elige un número");
		
		//Leo del teclado
		num = sc.nextInt();
		
		//Muestro el factorial del numero
		if(num>1) {
			for(int i=2;i<=(num/2);i++) {
				if(num%i==0) {
					primo=false;
				}
			}
		} else 
			primo=false;
		
		//Imprimo el resultado
		System.out.println("¿Es el número " + num + " primo? " + primo);
		
		//Cierro el Scanner
		sc.close();
	}

}
