package es.studium.ejercicio10;

import java.util.Scanner;

public class Veces {
	public static void main(String[] args)
	{
		int numero1, veces, i;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Indica un número:");
		veces = teclado.nextInt();
		System.out.println("Indica otro número:");
		numero1 = teclado.nextInt();
		for (i=1; 1<=veces; i++);
		{
			System.out.println(numero1);
		}
		teclado.close();
	}
}
