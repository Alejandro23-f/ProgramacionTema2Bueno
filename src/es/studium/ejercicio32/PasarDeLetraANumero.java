package es.studium.ejercicio32;

import java.util.Scanner;

public class PasarDeLetraANumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra;
		int numero;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame una letra:");
		letra =  teclado.next().charAt(0);
		if (letra != '*')
		{
			switch (letra)
			{

			case 'a':
				//System.out.println("La letra" + letra + " es igual a n�mero 1");
				numero = 1;
				break;
			case 'b':
				/* EN realidad esta es la forma del profesor, es la correcta, no se repite m�s 
			        el System.out.println porque al ponerlo abajo del todo, vale para todos los casos */
				numero = 2;  
				break;
			case 'c':
				System.out.println("La letra" + letra + " es igual a n�mero 3");  //<-- No es necesario
				numero = 3;
				break;
			case 'd':
				System.out.println("La letra" + letra + " es igual a n�mero 4");
				numero = 4;
				break;
			case 'e':
				System.out.println("La letra" + letra + " es igual a n�mero 5");
				numero = 5;
				break;
			case 'f':
				System.out.println("La letra" + letra + " es igual a n�mero 6");
				numero = 6;
				break;
			case 'g':
				System.out.println("La letra" + letra + " es igual a n�mero 7");
				numero = 7;
				break;
			case 'h':
				System.out.println("La letra" + letra + " es igual a n�mero 8");
				numero = 8;
				break;
			case 'i':
				System.out.println("La letra" + letra + " es igual a n�mero 9");
				numero = 9;
				break;
			case 'z':  // As� hasta  llegar a Z
				numero = 27;
				break;

			default:
				numero = -1;
			}

			System.out.println("La letra" + letra + " es igual a n�mero "+ numero); /* Gracias a esto al final,
																					no es necesario poner las otras arriba */
		}

		while(letra!='*');
		System.out.println("Adi�s");
		teclado.close();
	}
}

}
