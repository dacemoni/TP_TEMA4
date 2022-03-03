package ejerciciostecnicas4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 extends Ejercicio7 {

	private final String cdm2 = "Son dos, o esque he bebido. Son identicas.";
	private final String jb2 = "Mi nombre es Bond, James Bond.";
	private final String vlrt2 = "No encontrado 2.";
	private final String sw2 = "Tus ojos pueden engañarte, no confíes en ellos.";

	public void citaPeliculas2(Scanner teclado){
		do{
			menuCitas();
			opcion = teclado.nextInt();
			Random randomd  =new Random();
			int cita = randomd.nextInt(3);
			switch(opcion){
			case 1:
				if(cita == 1){
					System.out.println(cdm);
				}else{
					System.out.println(cdm2);
				}
				break;
			case 2:
				if(cita == 1){
					System.out.println(jb);
				}else{
					System.out.println(jb2);
				}
				break;
			case 3:
				if(cita == 1){
					System.out.println(vlrt);
				}else{
					System.out.println(vlrt2);
				}
				break;
			case 4:
				if(cita == 1){
					System.out.println(sw);
				}else{
					System.out.println(sw2);
				}
				break;
			case 5:
				System.out.println("Adiós");
				break;
			default:
				System.out.println("La opción no existe.");
			}

		}while(opcion !=5);
	}
}
