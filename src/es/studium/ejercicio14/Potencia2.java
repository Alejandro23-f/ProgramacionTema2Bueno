package es.studium.ejercicio14;

import java.util.Scanner;

public class Potencia2 {
	public static void main(String[] args)
	{
		int a,b; //La i se declara en la funci�n porque no nos har� m�s falta
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un numero para la base:");
		a = teclado.nextInt();
		System.out.println("Dame otro n�mero para el exponente:");
		b = teclado.nextInt();
		System.out.println("El n�mero�+ a + �elevado a�+ b + �es igual a:�+ pot (a,b)");
		teclado.close();
	}
	public static double pot(int a, int b) // Se pone double en lugar de int, para que no salgan n�meros muy grandes(Osea, comillas) /
	{
		double resultado=1;
		for (int i=1; i<=b; i++) // La i se declara en la funci�n AQU�
		{
			resultado *= a;
			//resultado = resultado * a;
		}
		return(resultado);
	
	}
	
}
