package ejerciciostecnicas4;

import java.util.Scanner;

public class Ejercicio2 extends Ejercicio1{

	public void notaMedia2(Scanner teclado){
		media = 0;
		double valor;
		
		do{
			System.out.print("Introduzca la nota (-1 para acabar): "); 
			valor = teclado.nextDouble(); 
			if(valor != -1){ 
				notas.add(valor);
			}
		}
		while(valor != -1);

		for (Double nota : notas) {
			media = media + nota;
		}

		System.out.print("La nota media es: " + media / notas.size());
	}
}
