package sumaMatrices;

import java.util.Scanner;

public class sumamatrices {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = new int[4][3]; 
		
		int [] suma = new int[4];
		int i=0;
		int j=0;		
		while(j<=3)
		{
			i=0;
			while(i<=2)
			{
				System.out.println ("que numeroo queres, mamaguevo");
				System.out.println (" en la suma");
				System.out.println (j+1);
				System.out.println ("casilla");
				System.out.println (i+1);
				int id = teclado.nextInt();
				matriz[j][i]=id;
				
				i=i+1;
			}
			j=j+1;
				
		}
		
		
		j=0;
		while(j<=3)
		{
			suma[j] = matriz[j][0]+matriz[j][1]+matriz[j][2];
			
			j=j+1;
				
		}
		j=0;
		System.out.println ("vector suma");
		while(j<=3)
		{
			System.out.println ("columna"+j+":"+suma[j]);
			
			j=j+1;
				
		}
		System.out.println ("matriz");
		j=0;
		while(j<=3)
		{
			
			System.out.println("fila:"+j+", columna"+0+":"+matriz[j][0]); 
			System.out.println("fila:"+j+", columna"+1+":"+matriz[j][1]); 
			System.out.println("fila:"+j+", columna"+2+":"+matriz[j][2]); 
			j=j+1;
				
		}

	}

}

