package es.studium.ejercicio6;

import java.util.Scanner;

public class Dividir 
{
	public static void main(String[] args)
	{
		int denominador, numerador;
		double resultado;

		int numero1, numero2, i;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un numerador:");
		numerador = teclado.nextInt();
		System.out.println("Dame otro denominador:");
		denominador = teclado.nextInt();
		resultado = dividir(numerador, denominador);

		System.out.println("La división vale:" + resultado);
		teclado.close();
	}
	public static double dividir(int a, int b)
	{
		double resultado;
		resultado = (double) a/ (double) b;  //((CASTING)) Poner un double entre paréntesis sirve para camuflar. Esta es la original y mal	*/
		return(resultado);
	}
}
