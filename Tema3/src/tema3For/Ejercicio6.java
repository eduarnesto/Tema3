package tema3For;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Variable para sumar los numeros
		int suma=0;
		
		//Variable para los numeros impares
		 int impar=1;
		
		//Muestro los 10 primeros números impares
		for(int i=1;i<=10;i+=1) {
			suma+=impar;
			impar+=2;
		}
		
		//Muestro la suma de los 10 primeros números impares
		System.out.println("La suma de los 10 primeros números impares es " + suma);

	}

}
