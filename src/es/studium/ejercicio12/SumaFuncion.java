package es.studium.ejercicio12;

import java.util.Scanner;

public class SumaFuncion {

	public static void main(String[] args)
	{
		int numero1, numero2, r;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un numero:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro número:");
		numero2 = teclado.nextInt();
		r = suma(numero1, numero2);
		System.out.println("La suma de los dos siguientes números es "+ r);
		teclado.close();
	}

	public static int suma(int a, int b)
	{
		return(a+b);
	}
}