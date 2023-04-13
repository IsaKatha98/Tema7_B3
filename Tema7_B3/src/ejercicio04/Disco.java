package ejercicio04;

/**
 * Clase Disco que organiza álbumes de música
 * 
 * @author ikloerzer
 *
 */

public class Disco {

	/**
	 * Atributo privado inicializado como libre.
	 */
	private String codigo = "LIBRE";

	/**
	 * Atributo privado autor.
	 */
	private String autor = "";

	/**
	 * Atributo privado título.
	 */
	private String titulo = "";

	/**
	 * Atributo privado género.
	 */
	enum Genero {Rock, Pop, Electronica, Reggaeton};
	
	private Genero genero; 

	/**
	 * Atributo privado duración.
	 */
	private int duracion;

	/**
	 * Constructor por defecto.
	 */
	public Disco() {
		super();
	}

	/**
	 * Constructor por defecto con parámetros.
	 * 
	 * @param codigo
	 * @param autor
	 * @param titulo
	 * @param genero
	 * @param duracion
	 */
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = Genero.valueOf(genero);
		this.duracion = duracion;
	}

	/**
	 * Cosntructor copia
	 * 
	 * @param d
	 */
	public Disco(Disco d) {
		this.codigo = d.codigo;
		this.autor = d.autor;
		this.titulo = d.titulo;
		this.genero = d.genero;

		if (duracion > 0) {
			this.duracion = d.duracion;
		}

	}

	/**
	 * Método get del atributo código.
	 * 
	 * @return codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Método set del atributo código.
	 * 
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Método get del atributo autor.
	 * 
	 * @return autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Método set del atributo autor
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Método get del atributo título
	 * 
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Método set del atribiuto título
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Método get del atributo género
	 * 
	 * @return genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Método set del atributo género
	 * 
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero =Genero.valueOf(genero);
	}

	/**
	 * Método get del atributo duración.
	 * 
	 * @return
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * Método set del atributo duración, no puede ser menor que 0.
	 * 
	 * @param duracion
	 */
	public void setDuracion(int duracion) {
		if (duracion > 0) {
			this.duracion = duracion;
		}
	}

	/**
	 * Método que imprime la información
	 * 
	 * @return mensaje tipo
	 */
	public String toString() {

		String result;

		result = "Disco [código= " + this.codigo + ",\n" + "autor=" + this.autor + ", \n" + "título=" + this.titulo
				+ ",\n" + "género=" + this.genero + ",\n" + "duración=" + this.duracion + "]";

		return result;
	}
}
