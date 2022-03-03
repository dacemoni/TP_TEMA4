package ejerciciostecnicas4;

import java.util.Scanner;

public class Ejercicio3 extends Ejercicio2{

	public void notaMedia3(Scanner teclado){
		notaMedia2(teclado);

		double superior10 = 0;
		for (Double nota : notas) {
			if(nota>=10){
				superior10++;
			}
		}

		System.out.print(" (" + (superior10 / notas.size())*100 + "% >= 10)\n");
	}
}
