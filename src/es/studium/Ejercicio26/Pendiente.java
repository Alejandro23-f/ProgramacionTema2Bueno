package es.studium.Ejercicio26;

import java.util.Scanner;

public class Pendiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int x1, x2, y1, y2;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Indique el valor de x1");
		x1= teclado.nextInt();
		System.out.println("Indique el valor de x2");
		x2= teclado.nextInt();
		System.out.println("Indique el valor de y1");
		y1= teclado.nextInt();
		System.out.println("Indique el valor de y2");
		y2= teclado.nextInt();
		funPendiente (x1 ,x2,y1,y2);
		teclado.close();
	}

	public static void funPendiente(int x1, int x2, int y1, int y2) //Se pone void, no double
	{
		System.out.print("La pendiente entre los dos puntos es:"+(((float)y2-(float)y1)/((float)x2)-(float)x1));
		//Float es lo mismo que Double
	}
}
