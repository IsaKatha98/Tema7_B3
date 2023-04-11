package ejercicio02;

public class Main {

	public static void main(String[] args) {
		
		//Creamos un objeto.
		Libro lib=new Libro("Frankestein","Mary Shelley",10, 2, "Poetico");
		
		
		lib.prestamo();
		lib.devolucion();
		System.out.println(lib);
		
		Libro lib2=new Libro ("Berserk 01", "Kentaro Miura", 5, 1, "Narrativo");
		
		lib2.prestamo();
		
		System.out.println(lib2);

	}

}
