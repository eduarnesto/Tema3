package tema3WhileDo;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variable para contador
		int contador=1;
		
		//Variable para el numero
		int numero;
		
		//Variable para el resultado de las multiplicaciones
		int res;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto un numero
		System.out.println("Introduzca un número");
		
		//Leo el numero del teclado
		numero=sc.nextInt();
		
		//Muestro la tabla de multiplicar del número introducido
		do {
			res=contador*numero;
			System.out.println(numero + " * " + contador + " = " + res);
			contador++;
		} while (contador<=10);
		
		//Cierro el Scanner
		sc.close();
	}
	
}