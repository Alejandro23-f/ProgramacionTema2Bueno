package es.studium.Ejercicio37;

import java.util.Scanner;

public class PasarAMayusculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra;
		int x, y;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame una min�scula"); 		
		letra = teclado.next().charAt(0);
		x = letra;
		y = x -32; // UTILIZAMOS la tabla ASCII. Las min�sculas son de las may�scilas las -32
		System.out.println("La letra "+letra + "en may�scula es "+(char) y+"�");   //Tenemos que transformar en char
		teclado.close();			
	}
}
