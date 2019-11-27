package es.studium.ejercicio19;

import java.util.Scanner;

public class Operaciones {
	public static void main(String[] args)
	{
		int numero1, numero2; /* Quitamos de la variable "suma , resta, producto y
		 												división para ponerlos directamente con el ESCRIBIR*/
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un numero:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro número:");
		numero2 = teclado.nextInt();
		System.out.println("La suma de los números es "+(numero1+numero2)); /*En vez de hacer suma = (numero1 + numero2)
																se escribe (numero1+numero2) en el propio System.out.println */
		System.out.println("La resta de los números vale "+(numero1-numero2));
		System.out.println("La multiplicación de los números es "+(numero1*numero2));
		if (numero2==0)
		{
			System.out.println("El valor de b no puede ser 0 para poder hacer la división");
		}
		else
		{
		System.out.println("La división vale "+ (numero1/numero2));
	}
		teclado.close();
	}
}
