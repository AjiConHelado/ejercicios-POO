package calculadoraGeometria;
import java.util.Scanner;
public class main {
	  static Scanner teclado = new Scanner(System.in);
	    public static void main(String[] args) {
	        int opcion=0;
	        do{
	            System.out.println(" MENU DE OPCIONES ");
	            System.out.println(" 1. cuadrado");
	            System.out.println(" 2. rectangulo ");
	            System.out.println(" 3. triangulo");
	            System.out.println(" 4. rombo");
	            System.out.println(" 5. circulo");
	            System.out.println(" 6. pentagono");
	            System.out.println(" 7. trapecio");
	            System.out.println(" 8. romboide");
	            System.out.println(" Ingrese una opcion: ");
	            opcion = teclado.nextInt();         
	            switch (opcion){
	                case 1:
	                	System.out.println(" ingrese el lado");
	                	int ladocuadrado = teclado.nextInt();  
	                	
	                	Figura cuadrado= new Figura(0,0,ladocuadrado,0,0);
	                	
	                	int areacuadrado = cuadrado.lado *cuadrado.lado;
	                	
	                	 System.out.println(areacuadrado);
	                    //Codigo;
	                    break;
	                case 2:
	                	System.out.println(" ingrese la base");
	                	int baserectangulo = teclado.nextInt();  
	                	System.out.println(" ingrese la altura");
	                	int alturarectangulo = teclado.nextInt(); 
	                	
	                	Figura rodolfo = new Figura(alturarectangulo,baserectangulo,0,0,0); 
	                	
	                    int arearectangulo = rodolfo.altura * rodolfo.base;
	                    //int are= rodolfo.medida(rodolfo.altura,rodolfo.base);
	                    
	                    System.out.println(arearectangulo);
	                    
	                    
	                    System.out.println(" ");
	                    
	                    
	                    break;
	                case 3:
	                	System.out.println(" ingrese la base");
	                	int basetriangulo = teclado.nextInt();  
	                	System.out.println(" ingrese la altura");
	                	int alturatriangulo = teclado.nextInt(); 
	                	
	                	Figura triangulo= new Figura(alturatriangulo,basetriangulo,0,0,0);
	                	
	                	int areatriangulo = (triangulo.altura* triangulo.base)/2;
	                	
	                	 System.out.println(areatriangulo);
		                    
	                    //Codigo;
	                    break;
	                case 4:
	                	System.out.println(" ingrese la diagonal 1");
	                	int diagarombo = teclado.nextInt();  
	                	System.out.println(" ingrese la diagonal 2");
	                	int diagbrombo= teclado.nextInt(); 
	                	
	                	Figura osvaldo= new Figura(0,0,0,diagarombo,diagbrombo);
	                	
	                	int arearombo = osvaldo.diagonala* osvaldo.diagonalb;
	                	
	                	 System.out.println(arearombo);
	                    //Codigo;
	                    break;
	                case 5:
	                	System.out.println(" ingrese el radio");
	                	int radio = teclado.nextInt();  
	                	Figura circulo = new Figura(0,0,0,radio,0);
	                	float pi = 3.14f;
	                	float areacirculo= pi*circulo.diagonala* circulo.diagonala;
	                	 System.out.println(areacirculo);
	                	
	                    //Codigo;
	                    break;
	                case 6:
	                	System.out.println(" ingrese el radio");
	                	int radiopentagono = teclado.nextInt();  
	                	System.out.println(" ingrese el lado");
	                	int ladopentagono= teclado.nextInt(); 
	                	
	                	Figura penta =new Figura(0,0,ladopentagono,radiopentagono,0);
	                	
	                	int areapentagono= (2* penta.lado*penta.diagonala)/2;
	                	
	                	System.out.println(areapentagono);
	                	
	                	
	                    //Codigo;
	                    break;
	                case 7:
	                	System.out.println(" ingrese la base");
	                	int basetrapecio = teclado.nextInt();  
	                	System.out.println(" ingrese el lado superior");
	                	int ladotrapecio= teclado.nextInt(); 
	                	System.out.println(" ingrese la altura");
	                	int alturatrapecio = teclado.nextInt();  
	                	 
	                	Figura jairo = new Figura(alturatrapecio,basetrapecio,ladotrapecio,0,0);
	                	
	                	int areatrapecio= jairo.altura*((jairo.base+jairo.lado)/2);
	                	System.out.println(areatrapecio);
	                	
	                    //Codigo;
	                    break;   
	                case 8:
	                	System.out.println(" ingrese la base");
	                	int baseromboide = teclado.nextInt();  
	                	System.out.println(" ingrese la altura");
	                	int alturaromboide = teclado.nextInt(); 
	                	
	                	Figura eustaquio = new Figura(alturaromboide,baseromboide,0,0,0); 
	                	
	                    int arearomboide = eustaquio.altura * eustaquio.base;
	                    //int are= rodolfo.medida(rodolfo.altura,rodolfo.base);
	                    
	                    System.out.println(arearomboide);
	                    //Codigo;
	                    break;

	            }
	        } while (opcion != 0);
	    }
}
