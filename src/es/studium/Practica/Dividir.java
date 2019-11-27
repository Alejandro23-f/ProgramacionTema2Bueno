package es.studium.Practica;

import java.util.Scanner;

public class Dividir {
	public static void main(String[] args)
	{
		int base, exponente;
		double	resultado;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame una base:");
		base = teclado.nextInt();
		System.out.println("Dame un exponente:");
		exponente = teclado.nextInt();
		resultado = dividir (base, exponente);

		exponente = teclado.nextInt();
		System.out.println ("La división vale "+resultado);
	}
	public static double dividir(int a, int b)
	{
		double desenlace;
		desenlace = (double) a/ (double) b;
		return desenlace;
	}
}