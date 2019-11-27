package es.studium.ejercicio13;

import java.util.Scanner;

public class TablaMultiplicar {
	public static void main(String[] args)
	{
		int numero;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un número:");
		numero = teclado.nextInt();
		System.out.println("La tabla de multiplicar del número "+" es:");
		for (int i=0; i<=10; i++)
		{
			System.out.println(numero + " x "+ i + " = "+ numero*i);
	}
		teclado.close();
}
}