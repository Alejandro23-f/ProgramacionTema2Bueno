package es.studium.Ejercicio24;

public class Cuadrados {
	public static void main(String[] args) {

		System.out.println("La suma de los cuadrados de los 100 primeros números naturales es "+SumaCuadrados());
		//A la función no se le manda nada porque siempre es 100
	}
	public static int SumaCuadrados()
	{
		int i, resultado;
		resultado = 0;
		for(i=0;i<100;i++) 
		{
			resultado = resultado + (i*i);
		}
		return(resultado);
	}
}
