package es.studium.Aleatorios2;
	import java.util.Random;
	public class Aleatorios2
	{
		public static void main(String[] args) 
		{
			Random rnd=new Random();
			int i,x;
			for(i=0;i<10;i++)
			{
				x=rnd.nextInt(6)+1;  //Le ponemos el +1 fuera del paréntesis porque de no hacerlo el dado iría de 0 a 5, y no existen dados con 0 */
			System.out.println(x);
			}
			}
		}
		
