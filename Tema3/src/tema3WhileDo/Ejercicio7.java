package tema3WhileDo;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Variable para guardar el primer número
		float num1;
		
		//Variable para guardar el segundo número
		float num2;
		
		//Variable para guardar el resultado
		float res;
		
		//Variable para guardar la selección
		char select;
				
		//Scanner para leer el número
		Scanner sc = new Scanner(System.in);
		
		//Pregunto los numeros y hago las operaciones
		do {
				
			//Pregunto el primer número
			System.out.println("Introduzca un número");
					
			//Leo el número del teclado
			num1 = sc.nextFloat();
			
			//Pregunto el segundo número
			System.out.println("Introduzca otro número");
					
			//Leo el número del teclado
			num2 = sc.nextFloat();
			
			//Pregunto la operación que quiere realizar
			System.out.println("Elija la operación que quiera realizar\n"
					+ "A.SUMAR LOS NÚMEROS\n"
					+ "B.RESTAR LOS NÚMEROS\n"
					+ "C.MULTIPLICAR LOS NÚMEROS\n"
					+ "D.DIVIDIR LOS NÚMEROS\n"
					+ "E.SALIR");
			
			//Leo la elección
			select = sc.next().charAt(0);
			
			//Realizo la operación indicada
			switch (select) {
			case 'A'->{
				res=num1+num2;
				System.out.println("El resultado de la operación elegida es: " + res);
			}
			case 'B'->{
				res=num1-num2;
				System.out.println("El resultado de la operación elegida es: " + res);
			}
			case 'C'->{
				res=num1*num2;
				System.out.println("El resultado de la operación elegida es: " + res);
			}
			case 'D'->{
				if(num2!=0) {
					res=num1/num2;
					System.out.println("El resultado de la operación elegida es: " + res);
				}else {
					System.out.println("No se puede dividir por cero");
				}
			}
			case 'E'->{
				System.out.println("Has salido de la calculadora");
			}
			default->{
				System.out.println("Elección no válida");
			}
			}
		} while (select != 'E');
		
		//Cierro el Scanner
		sc.close();

	}

}
