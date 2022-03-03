package ejerciciostecnicas4;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {

	int numero = 0;
	Random random = new Random();
	int numRandom = random.nextInt(100) + 1;

	public void numeroAleatorio(Scanner teclado) {
		do {
			System.out.println("¿En qué número entre 1 y 100 estoy pensando?");
			numero = teclado.nextInt();
			if (numero < numRandom) {
				System.out.println("Mayor");
			} 
			else if (numero > numRandom) {
				System.out.println("Menor");
			} 
			else {
				System.out.println("Bravo, lo has encontrado.");
			}
		} 
		while (numero != numRandom);

	}
}
