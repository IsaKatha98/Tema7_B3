package ejercicio03;

public class Main {

	public static void main(String[] args) {
		
		//Creamos el objeto.
		Articulo art= new Articulo ("Colonia", 10.50, 7, "Alimentacion");
		
		double precio=art.getPVP();
		double precioDescuento=art.getPVPDescuento(0.25);
		
		
		System.out.println(art);
		
		System.out.println("Este es el precio de un artículo: "+precio);		
		System.out.println("Este es el precio con descuento: "+precioDescuento);
		
		art.vender(5);
		
		System.out.println(art);
			
	}

}
