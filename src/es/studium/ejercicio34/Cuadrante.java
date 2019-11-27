package es.studium.ejercicio34;

import java.util.Scanner;

public class Cuadrante
{
	public static void main(String[] args)  // Esto no se puede olvidar en todos los ejercicios de programación
	{
		double x, y;
		int c;
// El ejercicio N 34 viene con 

		Scanner teclado = new Scanner (System.in);
		System.out.println("Indique el valor de la cordenada x:");
		x = teclado.nextDouble();
		System.out.println("Indique el valor de la cordenada y:");
		y = teclado.nextDouble();
		c = funCuadrante (x,y);
		System.out.println("El punto dado pertenece al cuadrante nº: "+c);
	}

	public static int funCuadrante(double x, double y)
	{
		int c; // Aquí se declara la variable de arriba
		if (x>=0 && y>=0)
		{
			c = 1; //Recordar ponerle ;   , además de sin paréntesis
		}
		if (x<0 && y>=0)
		{
			c = 2;
		}
		if (x<0 && y<0)
			c = 3;
			else
				c = 4;
	}
}




}
