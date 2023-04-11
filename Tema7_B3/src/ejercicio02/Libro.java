package ejercicio02;

/**
 * Clase que guarda la información de cada libro de una biblioteca.
 * 
 * @author isabelkatharinaloerzer
 *
 */

public class Libro {

	/**
	 * Atributo título del libro.
	 */
	private String titulo;
	
	/**
	 * Atributo autor del libro.
	 */
	private String autor;
	
	/**
	 * Atributo referente a la cantidad de ejemplares de ese libro.
	 */
	private int numEjemplares;
	
	/**
	 * Atributo referente a la cantidad de ejemplares prestados de un libro.
	 */
	private int numEjemplaresPrestados;
	
	private enum Genero {Narrativo, Lirico, Dramatico, Poetico};
	
	private Genero genero;
	/**
	 * Constructor de la clase Libro sin parámetros. Tampoco devuelve nada.
	 */
	public Libro() {
		
	}
	
	/**
	 * Constructor de la clase Libro con parámetros.
	 * 
	 * @param titulo
	 * @param autor
	 * @param numEjemplares
	 * @param numEjemplaresPrestados
	 */
	public Libro (String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String genero) {
		
		this.titulo=titulo;
		this.autor=autor;
		this.numEjemplares=numEjemplares;
		this.numEjemplaresPrestados=numEjemplaresPrestados;
		
		this.genero=Genero.valueOf(genero);
		
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * Método que presta libros. En caso de que el número de ejemplares prestados sea
	 * menor que la cantidad de ejemplares que hay, significa que todavía hay libros 
	 * que se pueden prestar. Si eso ocurre, incrementa el numEjemplaresPrestados en 1
	 * y prestamo es true.
	 * 
	 * @return Devuelve un booleano que si es true es que ha habido un préstamo y si es
	 * false, no ha ocurrido nada.
	 */
	public boolean prestamo() {
		
		boolean prestamo=false;
		
		if (numEjemplares>=numEjemplaresPrestados) {
			
			numEjemplaresPrestados++;
			prestamo=true;
			
		}
		
		return prestamo;
	}
	
	/**
	 * Método que devuelve un libro. En el caso en el que haya libros prestados 
	 *(cuando numEjemplaresPrestados es mayor que 0) puede ocurrir una devolución.
	 *En este caso, decrementa numEjemplaresprestados y devolución es true.
	 * 
	 * @return Devuelve un booleano que si es true es que ha habido una devolución y si es
	 * false, no ha ocurrido nada.
	 */
	public boolean devolucion () {
		
		boolean devolucion=false;
		
		if (numEjemplares>=numEjemplaresPrestados&&numEjemplaresPrestados>0) {
			
			numEjemplaresPrestados--;
			devolucion=true;
		}
		
		return devolucion;
	}
	
	/**
	 * 
	 * Método que pasa a String todos los atributos y los devuelve a modo de mensaje
	 * 
	 * @return result mensaje tipo
	 */
	public String toString () {
		
		String result="";
		
		result+="Título del libro: "+titulo+"\n";
		result+="Autor/a del libro: "+autor+"\n";
		result+="Número de ejemplares disponibles: "+numEjemplares+"\n";
		result+="Número de ejemplares prestados: "+numEjemplaresPrestados+"\n";
		result+="Género del libro: "+genero+"\n";
		
		return result;
		
	}
}

