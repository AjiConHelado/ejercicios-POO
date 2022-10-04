package vectorMayorMenor;

public class vectorMayorMenor {

	public static void main(String[] args) {
		int mayor=-1;
		int menor =99999999;
		int arreglo[]= {23,56,7,78,45,1,35,17,69,83,100,-2,1000,-50};
		// TODO Auto-generated method stub
		for (int i=0; i<arreglo.length; i++) {
			if(menor>arreglo[i]) {
				menor= arreglo[i];
			}
			
			if(mayor<arreglo[i]) {
				mayor= arreglo[i];
			}
		
			}
		
		System.out.println("el valor maximo del arreglo es:"+mayor);
		System.out.println("el valor minimo del arreglo es::"+menor);
		}
	}


