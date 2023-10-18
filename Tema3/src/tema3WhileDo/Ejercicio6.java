package tema3WhileDo;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Variable para guardar piedra
		String piedra = "Piedra";
		
		//Variable para guardar papel
		String papel = "Papel";
		
		//Variable para guardar tijeras
		String tijeras = "Tijeras";
		
		//Variable para guardar la elección del jugador 1
		String eleccionJ1;
		
		//Variable para guardar la elección del jugador 2
		String eleccionJ2;
		
		//Variable para guardar si quieren seguir la partida
		char eleccion;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Juego de papel y tijera
		do {
			
			//Pregunta a los jugadores que escojan una opcion
			do {
				System.out.println("Jugador 1 elige: Piedra, Papel o Tijeras");
				eleccionJ1=sc.nextLine();
			} while (!eleccionJ1.equals(piedra) && !eleccionJ1.equals(papel) && !eleccionJ1.equals(tijeras));
			
			do {
				System.out.println("Jugador 2 elige: Piedra, Papel o Tijeras");
				eleccionJ2=sc.nextLine();
			} while (!eleccionJ2.equals(piedra) && !eleccionJ2.equals(papel) && !eleccionJ2.equals(tijeras));
			
			//Compruebo quien ha ganado
			if (eleccionJ1.equals(eleccionJ2)) {
				System.out.println("Es un empate");
			} else if (eleccionJ1.equals(piedra)&&eleccionJ2.equals(papel)){
				System.out.println("Jugador 2, has ganado");
			} else if (eleccionJ1.equals(papel)&&eleccionJ2.equals(tijeras)){
				System.out.println("Jugador 2, has ganado");
			} else if (eleccionJ1.equals(tijeras)&&eleccionJ2.equals(piedra)){
				System.out.println("Jugador 2, has ganado");
			} else if (eleccionJ2.equals(piedra)&&eleccionJ1.equals(papel)){
				System.out.println("Jugador 1, has ganado");
			} else if (eleccionJ2.equals(papel)&&eleccionJ1.equals(tijeras)){
				System.out.println("Jugador 1, has ganado");
			} else if (eleccionJ2.equals(tijeras)&&eleccionJ1.equals(piedra)){
				System.out.println("Jugador 1, has ganado");
			}
			
			do {
				//Pregunto si quieren seguir jugando
				System.out.println("¿Queréis seguir jugando? Introduce Sí o No");
				
				//Leo el valor del teclado
				eleccion=sc.nextLine().charAt(0);
			} while(eleccion != 'S' && eleccion != 'N');
			
	} while (eleccion == 'S' && eleccion != 'N');
		
	//Cierro el Scanner
	sc.close();
	}
}
