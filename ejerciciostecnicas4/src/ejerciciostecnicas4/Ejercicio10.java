package ejerciciostecnicas4;

import java.util.Scanner;

public class Ejercicio10 {

	protected String caracter;
	protected int anchura = 0;
	protected int altura = 0;

	public void arteASCII(Scanner teclado) {
		System.out.println("¿Anchura?");
		anchura = teclado.nextInt();
		System.out.println("¿Altura?");
		altura = teclado.nextInt();
		System.out.println("¿Carácter?");
		teclado.nextLine();
		caracter = teclado.nextLine();

		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < anchura; j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	}
}
