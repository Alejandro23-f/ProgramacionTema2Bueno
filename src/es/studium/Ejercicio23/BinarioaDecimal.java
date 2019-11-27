package es.studium.Ejercicio23;

import java.util.Scanner;

public class BinarioaDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e, conversion;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Indique el valor de la primera cifra del número binario:");
		a = teclado.nextInt();
		System.out.println("Indique el valor de la segunda cifra del número binario:");
		b = teclado.nextInt();
		System.out.println("Indique el valor de la tercera cifra del número binario:");
		c = teclado.nextInt();
		System.out.println("Indique el valor de la cuarta cifra del número binario:");
		d = teclado.nextInt();
		System.out.println("Indique el valor de la qiomta cifra del número binario:");
		e = teclado.nextInt();
		conversion = funconversion (a,b,c,d,e); /*Esto solo para acordarme... este paso
											ya lo hice abajo en el Syste.out y haberlo escrito
											sería un paso más, menos efectivo si hubiera dejado
											funconversión como conversión en "ESCRIBIR" y
											sin los (a,b,c,d,e)*/
		System.out.println("El número decimal equivalente es "+funconversion(a,b,c,d,e));
		teclado.close();
	}
		
		public static int funconversion(int e, int d,int c,int b,int a)
		{
			int resultado=0;
			resultado = (a*1)+(b*2)+(c*4)+(d*8)+(e*16);
			
			return (resultado);
		}
}
			

		
	