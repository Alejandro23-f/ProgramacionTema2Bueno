package es.studium.Ejercicio22;

import java.util.Scanner;

public class tiposDeTriangulos {
	public static void main(String[] args)
	{
		int lado1, lado2, lado3;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un numero:");
		lado1 = teclado.nextInt();
		System.out.println("Dame otro número:");
		lado2 = teclado.nextInt();
		System.out.println("Dame otro número más"); 
		lado3 = teclado.nextInt();
		if (lado1==lado2&&lado2==lado3)
		{
			System.out.println("El triángulo formado es equilátero");
		}
		//Se pone else y NO viene en "Ejercicious resueltos" :/
		else if (((lado1==lado2))||(lado1==lado3)||(lado3==lado2))
		{

			/* El DESIGUAL en java  se escribe así:    "  !=  " */
			System.out.println("El triángulo es isóceles");
		}
		else
		{
			System.out.println("El triángulo es escaleno");
		}
		teclado.close();
	}
}


