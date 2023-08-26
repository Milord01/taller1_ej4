package Taller1;

import java.util.Scanner;
public class Cuadrado_Cubo {
	public static void main(String[] args) {
		double x;
		Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingrese x:");
	    x = entrada.nextDouble();
	    System.out.println("El cuadrado de x es: " + Math.pow(x,2));
	    System.out.println("El cubo de x es: " + Math.pow(x,3));
	}
}
