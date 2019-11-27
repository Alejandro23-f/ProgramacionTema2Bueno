package es.studium.ejercicio11;

import java.util.Scanner;

public class Intercambio {
	public static void main(String[] args)
	{
		int numero1, numero2, comodin;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un número:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro número:");
		numero2 = teclado.nextInt();
		comodin = numero2;
		numero2 = numero1;
		numero1 = comodin;
}
}