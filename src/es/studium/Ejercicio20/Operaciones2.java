package es.studium.Ejercicio20;

import java.util.Scanner;

public class Operaciones2 {

	public static void main(String[] args)
	{
		int a,b; 
		 												//La correci�on NO ESTA COMPLETA
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un numero:");
		a = teclado.nextInt();
		System.out.println("Dame otro n�mero:");
		b = teclado.nextInt();
		System.out.println("La suma de los n�meros es "+funSuma(a+b)); 
		System.out.println("La resta de los n�meros vale "+funResta(a,b,c));
		System.out.println("La multiplicaci�n de los n�meros es "+funMultiplicacion(a,b,c));
		if (b==0)
		{
		System.out.println("El valor de b no puede ser 0 para poder hacer la divisi�n");
		}
		else
		{
		System.out.println("La divisi�n vale "+ funDivision(a,b,c));			
		}		

		public static int funSuma(int a, int b, int c)
		{
			return(a+b+c);
		}
		public static int funResta(int a, int b, int c)
		{
			return(a-b-c);
		}
		public static int funMultiplicacion(int a, int b, int c)
		{
			return (a*b*c);
		}
		public static double funDivision (int a, int b, int c)
		{
			return (a/b/c);
		}
		}
		}
		}