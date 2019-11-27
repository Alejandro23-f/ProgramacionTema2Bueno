package es.studium.ejercicio33;

import java.util.Scanner;

public class Segundos 
{
	public static void main(String[] args)
	{
	 int edad;
	int segundos;

		Scanner teclado = new Scanner (System.in);
		System.out.println("Indique su edad en años:");
		edad = teclado.nextInt();

		segundos = funSeg(segundos);
		System.out.println("Su edad en segundos es;" + segundos);
	}

	public static int funSeg(int segundos)
	{
		{

		segundos = (edad*31536000);
		return segundos;
	}
}
}


// SIN TERMINAR