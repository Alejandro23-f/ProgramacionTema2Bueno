package es.studium.ejercicio39;

import java.util.Scanner;

public class PulsarF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escriba una letra");
		letra = teclado.next().charAt(0);
		while (!letra.equals("f")){
			System.out.println("La letra indicada es: "+letra);
			System.out.println("Escriba otra letra(f para fin)");
			letra = teclado.nextLine();
		}
		
		
		
		//////////////////////////////////////////////////
		System.out.println("UTILIZANDO DO WHILE");
		do{
			
		}
		{
			
		}
	}

}
