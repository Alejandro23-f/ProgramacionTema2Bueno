package es.studium.ejercicio7;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args)
	{
		int numero1, numero2;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un numerador:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro denominador:");
		numero2 = teclado.nextInt();
		if (numero1==numero2)
		{
			System.out.println("Los números son  iguales");
		}
		else
		{
			if (numero1<numero2)
		{
				System.out.println("El primero es mayor");
		}
			else
		{
				System.out.println("El segundo es mayor:");
	}
	}
	teclado.close();
}
}