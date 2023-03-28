package ejercicio01;

public class Main {

	public static void main(String[] args) {
		
		CuentaCorriente cuenta= new CuentaCorriente("00000000P", "Loailo", 1000);

		System.out.println(cuenta);
		
		cuenta.sacarDinero(500);
		
		cuenta.ingresoDinero(20);
		
		System.out.println(cuenta);
	}

}
