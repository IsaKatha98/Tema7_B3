package ejercicio03;

public class Articulo {
	
	/**
	 * Atributo privado de tipo String, nombre.
	 */
	private String nombre;
	
	/**
	 * Atributo privado de tipo entero, precio.
	 */
	private double precio;
	
	/**
	 * Atributo público y constante de tipo double, IVA.
	 */
	public static final double IVA=0.21;
	
	/**
	 * Atributo privado de tipo entero, referente a la cantidad de artículos que quedan.
	 */
	private int cuantosQuedan;
	
	private enum Departamento {Electronica, Alimentación, Droguería};
	
	private Departamento departamento;
	
	/**
	 * Constructor de la clase Articulo que no devuelve nada.
	 * 
	 * @param nombre
	 * @param precio
	 * @param cuantosQuedan
	 */
	public Articulo (String nombre, double precio, int cuantosQuedan, String departamento) {
		
		if (!nombre.isEmpty()&&nombre!=null) {
			
			this.nombre=nombre;
		
		} else {
			
			System.out.println("El nombre introducido no es válido.");
		
		}
	
		if (precio>0) {
			
			this.precio=precio;
			 
		} else {
			
			System.out.println("El precio no puede ser negativo.");
		}
		
		if (cuantosQuedan>=0) {
			
			this.cuantosQuedan=cuantosQuedan;
			
		} else {
			
			System.out.println("El precio no puede ser negativo.");
			
		}
		
		this.departamento= Departamento.valueOf(departamento);
		
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public double getPrecio() {
		return precio;
	}




	public void setPrecio(double precio) {
		this.precio = precio;
	}




	public int getCuantosQuedan() {
		return cuantosQuedan;
	}




	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}




	public Departamento getDepartamento() {
		return departamento;
	}




	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}




	/**
	 *  Método que pasa a String todos los atributos y los devuelve a modo de mensaje
	 *  
	 *  @return result mensaje tipo
	 */
	public String toString () {
		
		String result="";
		
		result+="Nombre: "+this.nombre+"\n";
		result+="Precio: "+this.precio+"\n";
		result+="IVA: "+IVA+"\n";
		result+="Cantidades en stock: "+this.cuantosQuedan+"\n";
		result+="Departamento al que pertenece: "+this.departamento+"\n";
		
		return result;
		
	}
	
	/**
	 * Método get del precio final de un artículo; esto es, el precio por el precio más el IVA.
	 * 
	 * @return PVP precio al consumidor
	 */
	public double getPVP() {
		
		double PVP;
		
		PVP=this.precio+(this.precio*IVA);
		
		return PVP;
	}
	
	/**
	 * Método que aplica un descuento al PVP. 
	 * 
	 * @param descuento un double que indica el porcentaje a descontar del PVP
	 * @return precioDescuento PVP con el descuento aplicado.
	 */
	public double getPVPDescuento (double descuento) {
		
		double precioDescuento; 
		double precioPVP=getPVP();
		
		precioDescuento=precioPVP-(precioPVP*descuento);
		
		return precioDescuento;
		
	}

	/**
	 * Método que vende una cantidad de un artículo. Se comprueba si se puede realizar una venta
	 * y si se puede, se resta la cantidad de artículos a la cantidad total de artículos que hay.
	 * 
	 * @param cantidad hace referencia a la cantidad que se quiere vender
	 * @return venta indica si se ha efectuado la venta.
	 */
	public boolean vender (int cantidad) {
		
		boolean venta=false;
		
		if (this.cuantosQuedan>=cantidad) {
			
			this.cuantosQuedan-=cantidad;
			venta=true;
		}
	
		return venta;
	}
	
	/**
	 * Método que actualiza las cantidades existentes. Se añade la cantidad que
	 * se pasa por un parámetro.
	 * 
	 * @param cantidad se añade a las cantidades ya existentes.
	 */
	public void almacenar (int cantidad) {
		
		this.cuantosQuedan+=cantidad;
	}
	
}
