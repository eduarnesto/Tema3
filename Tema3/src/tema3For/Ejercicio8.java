package tema3For;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Variable para número
		int num;
		
		//Variable para los suspensos
		int suspensos=0;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto 5 calificaciones
		for(int i=1;i<=5;i++) {
			//Pregunto por la calificación
			System.out.println("Introduzca la calificaión");
			
			//Leo del teclado
			num = sc.nextInt();
			
			if(num>1) {
				suspensos++;
			}
		}
		
		//Muestro la cantidad de suspensos
		System.out.println("Hay " + suspensos + " suspensos");
		
		//Cierro el Scanner
		sc.close();
	}

}
