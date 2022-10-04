package retiroEfectivo;

public class cliente {
	int cedula;
	String nombre="";
	String direccion="";
	String email="";
	int saldoinicai;
	public cliente(int cedula,String nombre,String direccion,String email,int saldoinicai) 
	{
		this.cedula= cedula;
		this.nombre= nombre;
		this.direccion=direccion;
		this.email =email;
		this.saldoinicai = saldoinicai;
		
	}
	
	
	public void retirarsaldo(int retirar)
	{
	 if(retirar<saldoinicai)
	 {
		 saldoinicai=saldoinicai-retirar;
	     System.out.println(" saldo restante:");
	     System.out.println(saldoinicai);
	 }
	
	 else{
		 System.out.println(" saldo insuficiente pedazo de basura");
	 }
	 
	}

}
