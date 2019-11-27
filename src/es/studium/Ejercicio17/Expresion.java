package es.studium.Ejercicio17;

import java.util.Scanner;

public class Expresion {
	public static void main(String[] args)
	{
		int a, b, c;
		double r; //Double significa REAL
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un numero equivalente a la letra a:");
		a = teclado.nextInt();
		System.out.println("Dame otro número equivalente a la letra b:");
		b = teclado.nextInt();
		System.out.println("Dame otro número equivalente a la letra c");
		c = teclado.nextInt();
		if(a==0)
		{
		System.out.println(calcula(a,b,c));
		}
		else
		{
			System.out.println(calcula(a,b,c));
		}
		teclado.close();
	}
		public static double calcula (int a, int b, int c)
		{
			return ((double) ((b*b)-(4*a*c))/(double)(2*a));
				
		}
	}