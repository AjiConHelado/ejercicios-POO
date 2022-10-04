package caculadora;
import java.util.Scanner;
public class main {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operaciones josue=new operaciones();
		int opcion=0;
		do{
		  System.out.println("ingresa el primer numero:");
          int valoruno = teclado.nextInt();   
          System.out.println("ingresa el segundo numero:");
          int valordos = teclado.nextInt();    
          
              System.out.println(" que operacion quieres hacer? ");
              System.out.println(" 1. suma #1");
              System.out.println(" 2. resta #2");
              System.out.println(" 3. division #3");
              System.out.println(" 4. multiplicacion #4");
              System.out.println(" 0. salir #0");
              System.out.println(" Ingrese una opcion: ");
              opcion = teclado.nextInt();         
              switch (opcion){
                  case 1:
                	  josue.suma(valoruno, valordos);
                      break;
                  case 2:
                      josue.resta(valoruno, valordos);
                      break;
                  case 3:
                      josue.div(valoruno, valordos);
                      break;
                  case 4:
                      josue.multi(valoruno, valordos);
              }
          } while (opcion != 0);
      }
  } 
	


