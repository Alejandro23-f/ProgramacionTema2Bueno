package es.studium.ejercicio8;

import java.util.Scanner;

public class Potencia 
{

	public static void main(String[] args)
	{
		int base, exponente, resultado, i;
		resultado = 1;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame una base:");
		base = teclado.nextInt();
		System.out.println("Dame un exponente:");
		exponente = teclado.nextInt();
		for (i=1; i<=exponente; i++)
			resultado = resultado  *base;

		System.out.println("El número "+ base + "elevado a "+exponente + "es "+ resultado);
		teclado.close();
	}
}
