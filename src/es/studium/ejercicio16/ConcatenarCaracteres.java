package es.studium.ejercicio16;

import java.util.Scanner;

public class ConcatenarCaracteres {
	public static void main(String[] args)
	{
		char  letra1, letra2;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame una letra:");
		letra1 = teclado.next().charAt(0); // "Esto es una cadena... pues charAt(0) significa que cojamos el car�cter de la primera posici�n
		System.out.println("Dame otra letra:");
		letra2 = teclado.next().charAt(0);
		
		System.out.println(""+letra1+letra2); //Se le pone una CADENA vac�a, porque si no, suma los car�cteres en forma de ASCII
		teclado.close();
}
}