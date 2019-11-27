package es.studium.Ejercicio35;

import java.util.Scanner;

public class Multiplos5 {

	public static void main(String[] args) {
		

		int a, b, i; 
		 											
		c
		System.out.println("Dame un numero:");
		a = teclado.nextInt();
		System.out.println("Dame otro número:");
		b = teclado.nextInt();
		teclado.close();
		if (a<b)
		{
			for(i=a;i<b;i++)
			{
		if(i%5==0)
		{
			System.out.println("Múltiplo de 5:" +i ); 
		}
		}
	}
		else
		System.out.println("Error: a no pueder ser menor o igual que b");
}
}