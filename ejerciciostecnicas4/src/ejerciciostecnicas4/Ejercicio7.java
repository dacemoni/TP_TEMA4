package ejerciciostecnicas4;

import java.util.Scanner;

public class Ejercicio7 {
	
	protected final String cdm = "Cuidado, es una auténtica carnicería.";
    protected final String jb = "Mezclado, no agitado, por favor.";
    protected final String vlrt = "No encuentro.";
    protected final String sw = "Yo soy tu padre.";
    protected int opcion = 0;

    public void citaPeliculas(Scanner teclado) {
        do {
            menuCitas();
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(cdm);
                    break;
                case 2:
                    System.out.println(jb);
                    break;
                case 3:
                    System.out.println(vlrt);
                    break;
                case 4:
                    System.out.println(sw);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("La opción no existe.");
            }

        } while (opcion != 5);
    }

    protected static void menuCitas() {
        System.out.println("\n1 - Una cita de la ciudad del miedo");
        System.out.println("2 - Una cita de James Bond");
        System.out.println("3 - Una cita de la vida es un largo río tranquilo");
        System.out.println("4 - Una cita de Star Wars");
        System.out.println("5 - Salir de esta magnífica aplicación\n");
    }
}
