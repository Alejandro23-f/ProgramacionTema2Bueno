package es.studium.ejercicio4;

import java.util.Scanner;

public class Pares 
{
	
	public static void main(String[] args)
	{
		int numero1, numero2, i;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un n�mero:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro n�mero:");
		numero2 = teclado.nextInt();
	for (i=numero1; i <= numero2; i++)
	{
		if(i%2==0)
		{
				System.out.println(i);
			}
	}
	teclado.close();
}
}
