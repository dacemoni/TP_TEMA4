package ejerciciostecnicas4;

import java.util.Scanner;

public class Ejercicio6 {
	
	int numIntento = 1;
    final int MAX_INTENTOS = 5;

    public void trampa(Scanner teclado) {
        teclado.nextLine();
        System.out.println("¿Cuál es la capital de Francia?");
        String valorIntroducido = teclado.nextLine();
        
        while (!valorIntroducido.equals("Paris") && !valorIntroducido.equals("paris") && MAX_INTENTOS - numIntento != 0) {
            int intentos = MAX_INTENTOS - numIntento;
            System.out.println("Respuesta incorrecta\nSolo quedan " + intentos + " intento(s)");
            numIntento++;
            System.out.println("¿Cuál es la capital de Francia?");
            valorIntroducido = teclado.nextLine();
        }

        if (MAX_INTENTOS - numIntento != 0) {
            System.out.println("Bravo");
        } else {
            System.out.println("Revise sus conocimientos de geografía");
        }
    }
}
