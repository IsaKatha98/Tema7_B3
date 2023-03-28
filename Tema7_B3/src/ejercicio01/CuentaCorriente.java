package ejercicio01;

public class CuentaCorriente {
	
	private String dNI;
	private String nombre;
	private int saldo;
	
	
	public CuentaCorriente(String dNI, int saldo) {
	
		this.dNI = dNI;
		this.saldo = saldo;
	}


	public CuentaCorriente(String dNI, String nombre, int saldo) {

		this.dNI = dNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public int sacarDinero(int saldoR) {
		
		if (this.saldo>saldoR) {
			
			this.saldo-=saldoR;
		}
		
		return this.saldo;
		
	}
	
	public int ingresoDinero (int ingreso) {
		
		this.saldo+=ingreso;
		
		return this.saldo;
	}
	
	public String toString() {
		
		String result;
		
		result= "DNI: "+this.dNI+" ;\n"
				+"titular de la cuenta: "+this.nombre+" ;\n"
				+"saldo de la cuenta: "+this.saldo;
				
		return result;
	}
	
	
	
	
	

}
