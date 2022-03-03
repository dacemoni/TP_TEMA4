package ejerciciostecnicas4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	protected ArrayList<Double> notas = new ArrayList<>();
	protected int nNotas;
	protected double media;

	public void notaMedia(Scanner teclado){
		media = 0;
		System.out.println("Introduzca el número de notas de las que desea calcular la media: ");
		nNotas = teclado.nextInt();
		for (int i = 0; i < nNotas; i++) {
			System.out.print("Introduzca la nota: ");
			notas.add(teclado.nextDouble());
		}
		for (Double nota : notas) {
			media = media + nota;
		}
		System.out.println("La nota media es: " + media / nNotas);
	}
}