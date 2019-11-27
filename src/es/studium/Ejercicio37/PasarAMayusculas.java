package es.studium.Ejercicio37;

import java.util.Scanner;

public class PasarAMayusculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra;
		int x, y;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame una minúscula"); 		
		letra = teclado.next().charAt(0);
		x = letra;
		y = x -32; // UTILIZAMOS la tabla ASCII. Las minúsculas son de las mayúscilas las -32
		System.out.println("La letra "+letra + "en mayúscula es "+(char) y+"´");   //Tenemos que transformar en char
		teclado.close();			
	}
}
