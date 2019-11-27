package es.studium.Ejercicio18;

import java.util.Scanner;

public class Ordena3Numeros {
	public static void main(String[] args)
	{
		int a,b,c; 
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un numero");
		a = teclado.nextInt();
		System.out.println("Dame otro número");
		b = teclado.nextInt();
		System.out.println("Ahora proporciona el último número");
		c= teclado.nextInt();
		if (a<=b&&b<=c) // Java no deja poner (a<b<c) así que dividimos la operación con &
		{
			System.out.println("El menor es "+c+" segiodo de " +b+" siendo el mayor el "+a);	
		}
		else if(a<=c&&c<=b)
		{
			System.out.println("El mayor es "+b+" segiodo de " +c+" siendo el menor el "+a);
		}        
		else if (b<=a&&a<=c)
		{
			System.out.println("El mayor es "+c+" segiodo de " +a+" siendo el menor el "+b);
	}
		else if (b<=c&&c<=a)
		{
		System.out.println("El mayor es "+a+" segiodo de " +c+" siendo el menor el "+b);
		}
		else if (c<=a&&a<=b)
		{
		System.out.println("El mayor es "+b+" segiodo de " +a+" siendo el menor el "+c);
		}
		else if (c<=b&&b<=a)
		{
			System.out.println("El mayor es "+a+" segiodo de " +b+" siendo el menor el "+c);
		}
	teclado.close();
}
}