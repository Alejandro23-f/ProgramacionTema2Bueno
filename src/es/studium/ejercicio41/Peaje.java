package es.studium.ejercicio41;

import java.util.Scanner;

public class Peaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float  km, td;
		String vehiculo, coche, camion, moto , autobus;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Indique el tipo de veh�culo");
		veh�culo = teclado.next();
		System.out.println("Indique los Km reocrridos");
		km = teclado.nextInt();
		switch (vehiculo)
		{
		case 1:
			
			System.out.println("La cantidad a pagar es 3,2�");
			break;
		case 2: 
			System.out.println("Indicar los kil�metros recorridos");
			km = teclado.nextFloat();
			System.out.println("la cantidad a pagar es "+((0,1km + "�");
			break;
		case 3:
			System.out.println("Indicar los kil�metros recorridos");
			km = teclado.nextInt();
			System.out.println("�Cu�ntas toneladas transporta el cami�n?");
			td = teclado.nextInt();
			System.out.println("la cantidad a pagar es "+((km*0,1*km)+(0,1*td + "�");
			break;
			
		case 4:
			System.out.println("La cantidad a pagar es "+0,2*km+ "�");
			
			
		}
	}

}
