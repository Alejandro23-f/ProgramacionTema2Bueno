package es.studium.Ejercicio42;

import java.util.Scanner;

public class ConversionT {
	public static void main(String[] args)
	{
		int opcion;
		double cantidad;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Indique el n�mero correspondiente a una opci�n del sigueinte Men�:");
		{
			do
			{
				System.out.println("Indique el n�mero correspondiente a una opci�n del siguiente men�:\n* MEN� *\n1.Pasar de cent�grado a Fareheint\n2.Pasar de Fareheint a Cent�grado\n.3.Salir");
				{
					opcion = teclado.nextInt();
				}
				if (opcion==1 || opcion ==2)
				{
					System.out.println("Indique la cantidad de grados a convertir");
					cantidad = teclado.nextInt();
					if (opcion==1)
					{
						System.out.println("La cantidad indicada vale "+funConversionAF (cantidad) + " grados Fahrenheit");
					}
					if (opcion ==2)
					{
						System.out.println("La cantidad indicada vale "+funConversionAc (cantidad) + " grados Cent�grados");
					}
					
				
			}
			public static int funConversionAF(double grados)
			{
				int g;
				g = (int) (((9/5)*grados)+32);
				{
					return g;
				}
				public static int funConversionAc(double grados)
				{
					int g;
					g = (int) (((9/5)*grados)+32);
					{
						return g;
					}
			}

		}
