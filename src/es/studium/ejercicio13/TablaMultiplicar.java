package es.studium.ejercicio13;

import java.util.Scanner;

public class TablaMultiplicar {
	public static void main(String[] args)
	{
		int numero;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un n�mero:");
		numero = teclado.nextInt();
		System.out.println("La tabla de multiplicar del n�mero "+" es:");
		for (int i=0; i<=10; i++)
		{
			System.out.println(numero + " x "+ i + " = "+ numero*i);
	}
		teclado.close();
}
}