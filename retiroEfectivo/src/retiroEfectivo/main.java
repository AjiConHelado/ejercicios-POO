package retiroEfectivo;
import java.util.Scanner;
public class main {
	
	 static Scanner teclado = new Scanner(System.in);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println("hola pedazo de basura ");
	        System.out.println(" nombre ");
	        String nombre = teclado.next();
	        
	        
	        
	        System.out.println(" cedula");
	        int cedula = teclado.nextInt(); 
	        
	       
	        
	        System.out.println("email");
	        String email = teclado.next();
	        
	        
	        
	        
	        System.out.println("direccion ");
	        String direccion = teclado.next();
	        
	        
	        
	        System.out.println("saldo inicial");
	        int saldo = teclado.nextInt();
	        
			// TODO Auto-generated method stub
	        cliente rodolfo = new cliente(cedula,nombre,direccion,email,saldo); 
	        int counter=rodolfo.saldoinicai;
	        
	       while(counter>=0)
	        {
	        System.out.println("cuanto saldo quieres quitar");
	        int quitar = teclado.nextInt();
	        rodolfo.retirarsaldo(quitar);
	        counter=counter-quitar;
	        
	        }
	        
	        
		}
	}


