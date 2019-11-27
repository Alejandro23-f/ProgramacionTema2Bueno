package es.studium.ejercicio9;

import java.util.Scanner;

public class Según {

	public static void main(String[] args)
	{
		int a, b, resultado;
		resultado = 1;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un número:");
		a = teclado.nextInt();
		System.out.println("Dame otro número:");
		b = teclado.nextInt();
		if (a<b)
		{
			resultado = a+b;
			System.out.println("La suma del primer numero y el segundo número es "+ resultado);
		}
		else
		{
			resultado = a*b;
		}			System.out.println("El producto del primer número por el producto del segundo número, es "+ resultado);
	}	
}