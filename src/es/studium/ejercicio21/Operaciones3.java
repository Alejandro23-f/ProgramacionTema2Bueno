package es.studium.ejercicio21;

import java.util.Scanner;

public class Operaciones3 {
	public static void main(String[] args)
	{
	
		int a,b,c; 
Scanner teclado = new Scanner (System.in);
System.out.println("Dame un numero:");
a = teclado.nextInt();
System.out.println("Dame otro número:");
b = teclado.nextInt();
System.out.println("Dame otro número:");
c = teclado.nextInt();
System.out.println("La suma de los números es "+funSuma(a,b,c)); 
				
System.out.println("La multiplicación de los números es "+funMultiplicacion(a,b,c));
System.out.println("La media de los tres números es igual a "+funMedia(a,b, c));
teclado.close();
}


public static int funSuma(int a, int b, int c)
{
	return(a+b+c);
}

public static int funMultiplicacion(int a, int b, int c)
{
	return (a*b*c);
}
public static double funDivision (int a, int b, int c)
{
	return (a/b/c);
}

public static double funMedia (int a, int b, int c) //Recordad que en la función división se pone DOuble también
{
	return((double)funSuma(a,b,c)/(double)3);  /* Se pone el double entre paréntesis porque
	 											si no da problemas. Perderíamos los 0,5,  
	 											necesitamos ponerlo entre paréntesis para que solo afecte a eso
	 											Así convertimos el numerador y el denominador de ENTEROS A REALES*/
}
}
