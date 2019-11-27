package es.studium.ejercicio28;

import java.util.Scanner;

public class dosmiltreinta {

	public static void main(String[] args)
	{
		//Preguntar al profesor por el resultado incorrecto al ejecutar el programa
		// TODO Auto-generated method stub
		int dia, mes, anyo;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escriba un día");
		dia = teclado.nextInt();
		System.out.println("Ponga un mes");
		mes = teclado.nextInt();
		System.out.println("Ponga un año");
		anyo = teclado.nextInt();
		teclado.close();
		if (dia<1 || mes<1 || anyo <1)
		{
			System.out.println("La fecha no es correcta");
		}
		else 
		{
			switch (mes)
			{
			case 1: 
				if (dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 3: 
				if (dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 5:
				if (dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 7:
				if (dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 8:		if (dia<=31)
				if (dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
		
			break;
			
			case 10:
				if (dia<=31)
					if (dia<=31)
					{
						System.out.println("La fecha si es correcta");
					}
					else
					{
						System.out.println("La fecha no es correcta");
					}
				break;
			case 12:
				if (dia<=30)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 4:	
				if (dia<=30)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break; 
			case 6:
				if (dia<=30)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break; 
			case 9:
				if (dia<=30)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break; 
			case 11:

				if (dia<=30)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 2:
				if (dia>29)
				{
					System.out.println("La fecha no es correcta");
				}
				if (dia == 29) 
				{
					if (anyo%4==0 &&anyo%100!=0 ||anyo%400==0)
					{
						System.out.println("La fecha es correcta");
					}
					else
						System.out.println("La fecha no es correcta");
				}
			}
			if (dia<29)
			{
				System.out.println("La fecha  es correcta");
			}
			else 
			{
				System.out.println("La fecha no es correcta");
			}
		}
	}
}
