package ejerciciostecnicas4;

import java.util.Scanner;

public class Ejercicio9 {
	
	public void multiploTres(Scanner teclado) {
        System.out.println("Escriba un múltiplo de 3");
        int multiplo = teclado.nextInt();
        
        while (multiplo % 3 != 0) {
            System.out.printf("Error %d no es un multiplo de 3%n", multiplo);
            multiplo = teclado.nextInt();
        }
        
        System.out.printf("Ok: %d es un multiplo de 3%n", multiplo);
    }
}
