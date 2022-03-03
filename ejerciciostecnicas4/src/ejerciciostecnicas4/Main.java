package ejerciciostecnicas4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		Ejercicio1 ejercicio1 = new Ejercicio1();
		Ejercicio2 ejercicio2 = new Ejercicio2();
		Ejercicio3 ejercicio3 = new Ejercicio3();
		Ejercicio4 ejercicio4 = new Ejercicio4();
		Ejercicio5 ejercicio5 = new Ejercicio5();
		Ejercicio6 ejercicio6 = new Ejercicio6();
		Ejercicio7 ejercicio7 = new Ejercicio7();
		Ejercicio8 ejercicio8 = new Ejercicio8();
		Ejercicio9 ejercicio9 = new Ejercicio9();
		Ejercicio10 ejercicio10 = new Ejercicio10();
		Ejercicio11 ejercicio11 = new Ejercicio11();

		do {
			menu();
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				ejercicio1.notaMedia(teclado);
				break;
			case 2:
				ejercicio2.notaMedia2(teclado);
				break;
			case 3:
				ejercicio3.notaMedia3(teclado);
				break;
			case 4:
				ejercicio4.numeroAleatorio(teclado);
				break;
			case 5:
				ejercicio5.busquedaPc(teclado);
				break;
			case 6:
				ejercicio6.trampa(teclado);
				break;
			case 7:
				ejercicio7.citaPeliculas(teclado);
				break;
			case 8:
				ejercicio8.citaPeliculas2(teclado);
				break;
			case 9:
				ejercicio9.multiploTres(teclado);
				break;
			case 10:
				ejercicio10.arteASCII(teclado);
				break;
			case 11:
				ejercicio11.arteASCII2(teclado);
				break;
			case 12:
				System.out.println("Adios.");
				break;
			default:
				System.out.println("La opción elegida no existe.");
			} 
		}
		while (opcion != 12);	
	}

	private static void menu() {
		System.out.println("\nElija una de las siguiente opciones: ");
		System.out.println("1 - La nota media (versión 1)");
		System.out.println("2 - La nota media (versión 2)");
		System.out.println("3 - La nota media (versión 3)");
		System.out.println("4 - Adivine en qué número estoy pensando");
		System.out.println("5 - Ahora tengo que encontrarlo yo");
		System.out.println("6 - ¿Qué hace este algoritmo?");
		System.out.println("7 - Visualización de citas de películas (versión 1)");
		System.out.println("8 - Visualización de citas de películas (versión 2)");
		System.out.println("9 - Escribir un múltiplo de tres");
		System.out.println("10 - Arte ASCII 1");
		System.out.println("11 - Arte ASCII 2");
		System.out.println("12 - Salir.\n");
	}

}
