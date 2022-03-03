package ejerciciostecnicas4;

import java.util.Scanner;

public class Ejercicio11 extends Ejercicio10 {

	int opcion = 0;

	public void arteASCII2(Scanner teclado) {
		do {
			System.out.println("\n¿Tamaño?");
			int tamanio = teclado.nextInt();
			System.out.println("\n¿Carácter?");
			teclado.nextLine();
			caracter = teclado.nextLine();
			System.out.println("\n¿Forma?");
			menu();
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				for (int filas = 0; filas < tamanio; filas++) {
					System.out.println();
					for (int columnas = 0; columnas < tamanio; columnas++) {
						System.out.print(caracter);
					}
				}
				break;
			case 2:
				for (int filas = 0; filas < tamanio; filas++) {
					for (int columnas = 0; columnas < tamanio; columnas++) {
						if (filas == 0 || filas == tamanio-1 || columnas == 0 || columnas == tamanio-1) {
							System.out.print(caracter);
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;
			case 3:
				for (int fila = 0; fila < tamanio; fila++) {
					System.out.println();
					for (int columna = 0; columna <= tamanio; columna++) {
						if (fila == columna || (fila + columna == tamanio - 1)) {
							System.out.print(caracter);
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
				break;
			case 4:
				for (int fila = 0; fila < tamanio; fila++) {
					System.out.println();
					for (int columna = 0; columna < tamanio; columna++) {
						if (fila == columna || columna == 0 || fila == tamanio - 1) {
							System.out.print(caracter);
						} else {
							System.out.print(" ");
						}
					}
				}
				break;
			case 5:
				for (int filas = 1; filas <= (tamanio / 2) + 1; filas++) {
					for (int columnas = 0; columnas < tamanio - filas; columnas++) {
						System.out.print(" ");
					}
					for (int columnas = 0; columnas < 2 * filas - 1; columnas++) {
						if (columnas == 0 || columnas == 2 * filas - 2) {
							System.out.print(caracter);
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				for (int filas = tamanio / 2; filas > 0; filas--) {
					for (int columnas = 0; columnas < tamanio - filas; columnas++) {
						System.out.print(" ");
					}
					for (int columnas = 0; columnas < 2 * filas - 1; columnas++) {
						if (columnas == 0 || columnas == 2 * filas - 2) {
							System.out.print(caracter);
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 6:
				for (int columnas = 1; columnas <= tamanio; columnas = columnas+2) {
					for (int filas = 1; filas <= tamanio; filas = filas+2) {
						System.out.print(caracter);
						System.out.print(" ");
					}
					System.out.println();
					for (int filas = 1; filas < tamanio; filas = filas+2) {
						System.out.print(" ");
						System.out.print(caracter);
					}
					System.out.println("");
				}
				break;
			case 7:
				break;
			default:
				System.out.println("La opción elegida no existe.");
			}
		} while (opcion != 7);
	}

	public static void menu() {
		System.out.println("1 - Rectángulo con relleno");
		System.out.println("2 - Rectángulo sin relleno");
		System.out.println("3 - Cruz de San Andrés");
		System.out.println("4 - Triángulo rectángulo");
		System.out.println("5 - Rombo");
		System.out.println("6 - Ajedrezado");
		System.out.println("7 - Salir");
	}
}
