package es.studium.ejercicio15;

import java.util.Scanner;

public class Meses {
	public static void main(String[] args)
	{
		int mes;
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame el número entre 1 y 12:");
		mes = teclado.nextInt();
		switch(mes)
		{
		case 1:
			System.out.println("Enero");
			break;       //EL break se pone para que no se meta en el lugar del otro
			//mes == 1
		case 2:
			System.out.println("Febrero");
			break;
			//mes == 2
		case 3:
			System.out.println("Marzo");
			break;
			//mes ==3
		case 4:
			System.out.println("Abril");
			break;
			//mes == 4
		case 5:
			System.out.println("Mayo");
			break;
			//mes == 5
		case 6: 
			System.out.println("Junio");
			break;
			//mes == 6
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:	
			System.out.println("Diciembre");
			break;
			
			default:
				System.out.println("No es un mes válido");
		}
		teclado.close();
}
}
