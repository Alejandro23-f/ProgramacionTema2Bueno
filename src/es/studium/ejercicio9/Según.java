package es.studium.ejercicio9;

import java.util.Scanner;

public class Seg�n {

	public static void main(String[] args)
	{
		int a, b, resultado;
		resultado = 1;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un n�mero:");
		a = teclado.nextInt();
		System.out.println("Dame otro n�mero:");
		b = teclado.nextInt();
		if (a<b)
		{
			resultado = a+b;
			System.out.println("La suma del primer numero y el segundo n�mero es "+ resultado);
		}
		else
		{
			resultado = a*b;
		}			System.out.println("El producto del primer n�mero por el producto del segundo n�mero, es "+ resultado);
	}	
}