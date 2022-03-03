package ejerciciostecnicas4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 extends Ejercicio4 {
	
	private final ArrayList<Integer> listaNumerosOrdenador = new ArrayList<>();

    public void busquedaPc(Scanner teclado) {
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
        teclado.nextLine();
        teclado.nextLine();
        numRandom = random.nextInt(100) + 1;
        int eleccionPc = numRandom;
        listaNumerosOrdenador.add(eleccionPc);
        String respuesta;
        
        do {
            System.out.printf("Pruebo con %d, ¿es mayor, menor o es el número (+/-/=)?%n", eleccionPc);
            respuesta = teclado.next();
            int index = listaNumerosOrdenador.indexOf(eleccionPc);

            switch (respuesta) {
                case "+":
                    try {
                        eleccionPc = listaNumerosOrdenador.get(index) + 1
                                + random.nextInt(listaNumerosOrdenador.get(index + 1) - (listaNumerosOrdenador.get(index) + 1));
                    } catch (IndexOutOfBoundsException iob) {
                        eleccionPc = eleccionPc + random.nextInt(101 - eleccionPc);
                    } catch (IllegalArgumentException ia) {
                        eleccionPc = listaNumerosOrdenador.get(index) + 1
                                + random.nextInt(listaNumerosOrdenador.get(index + 1) + 2 - (listaNumerosOrdenador.get(index) + 1));
                    }
                    break;
                case "-":
                    try {
                        eleccionPc = listaNumerosOrdenador.get(index - 1)
                                + random.nextInt(listaNumerosOrdenador.get(index) - listaNumerosOrdenador.get(index - 1));
                    } catch (IndexOutOfBoundsException e) {
                        eleccionPc = 1 + random.nextInt(listaNumerosOrdenador.get(index) - 1);
                    } catch (IllegalArgumentException ia) {
                        eleccionPc = listaNumerosOrdenador.get(index - 1)
                                + random.nextInt((listaNumerosOrdenador.get(index) + 1) - listaNumerosOrdenador.get(index - 1));
                    }
                    break;
                case "=":
                    System.out.println("Felicidades, ¡has acertado!");
                    break;
            }

            if (!listaNumerosOrdenador.contains(eleccionPc)) {
            	listaNumerosOrdenador.add(eleccionPc);
            }
            Collections.sort(listaNumerosOrdenador);
        } while (!respuesta.equals("="));
    }
}
