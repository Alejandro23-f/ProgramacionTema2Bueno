package es.studium.Ejercicio40;

import java.util.Scanner;

public class SaltoN 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i, a;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Indique el valor del salto entre números");
		a = teclado.nextInt();

		for (i =0; i<=1000; i++) //Aquí iniciamos. Recordad que en 1000 el valor es <=
		{

			if (i%a==0)
			{

				System.out.println(i);
				teclado.close();
			}
		}
	}
}




