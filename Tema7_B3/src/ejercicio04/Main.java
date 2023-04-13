package ejercicio04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0; // opcion del menú
		int contador = 0; // contador que indica la siguiente posición libre

		Disco[] discos = new Disco[10]; // Esto es un array de tipo Disco, no confundir con los objetos.

		// Creamos 10 objetos, uno por cada posición del array.
		for (int i = 0; i < discos.length; i++) {

			discos[i] = new Disco();

		}

		// Hacemos un bucle que se repita hasta que nos salgamos del programa.
		do {

			// Presentamos el menú.
			menu();

			// Preguntamos la opción que quiere el usuario.
			System.out.println("Introduzca la opción que desea: ");
			opcion = sc.nextInt();

			// Hacemos un switch.
			switch (opcion) {

			case 1 -> {

				// Función de presentar el listado.
				listado(discos);

			}

			case 2 -> {

				// Buscamos la primera posición libre.
				contador = posicionLibre(discos);

				// En caso de que no encuentre ninguna posición libre.
				if (contador < 0) {
					System.out.println("No se pueden añadir más discos.");

					// En caso de que haya una posición libre, llamamos a la funcion para añadir un
					// disco nuevo.
				} else {
					nuevoDisco(discos, contador);

				}
			}

			case 3 -> {

				modificar(discos);
			}

			case 4 -> {

				borrarDisco(discos);
			}

			case 5 -> {

				System.out.println("Ha salido del programa.");
			}

			default -> {

				System.err.println("Opción introducida incorrecta");
			}
			}

		} while (opcion != 5);
	}

	private static void menu() {

		System.out.println("COLECCIÓN DE DISCOS." + "" + "\n===================" + "\n1. Listar discos"
				+ "\n2. Nuevo disco" + "\n3. Modificar disco" + "\n4. Borrar disco" + "\n5. Salir");

	}

	private static void listado(Disco[] discos) {

		// Recorremos el array
		for (Disco disco : discos) {

			// Imprimimos las posiciones cuyo codigo sea distinto de LIBRE.
			if (!disco.getCodigo().equals("LIBRE")) {

				System.out.println(disco);
			}
		}

	}

	private static int posicionLibre(Disco[] discos) {

		int index = 0;

		// Buscamos la primera posición que esté libre.
		while (index < discos.length && !discos[index].getCodigo().equals("LIBRE")) {
			index++;
		}

		// En caso de que no lo encuentre, index será -1
		if (index == discos.length) {
			index = -1;
		}

		// Devolvemos index.
		return index;
	}

	private static void nuevoDisco(Disco[] discos, int contador) {

		String cod;
		String autor, titulo;
		String genero;
		int duracion;

		// Le damos un valor a codigo, la primera posicion libre que hay en discos.
		cod = String.valueOf(contador);
		discos[contador].setCodigo(cod);

		sc.nextLine();
		System.out.println("Introduzca el autor del disco: ");
		autor = sc.nextLine();
		System.out.println("Introduzca el título del disco: ");
		titulo = sc.nextLine();
		System.out.println("Introduzca el genero del disco: ");
		genero = sc.nextLine();
		System.out.println("Introduzca la duración del disco: ");
		duracion = sc.nextInt();

		// Asiganmos todo a esa posición
		discos[contador] = new Disco(cod, autor, titulo, genero, duracion);
	}

	private static void modificar(Disco[] discos) {

		int cod;

		// Preguntamos por el codigo del disco que se quiere modificar.
		System.out.println("Introduzca el código del disco a modificar: ");
		cod = sc.nextInt();

		// Si el disco existe
		if (!discos[cod].getCodigo().equals("LIBRE")) {
			sc.nextLine();
			System.out.println("Introduzca el autor del disco nuevo: ");
			discos[cod].setAutor(sc.nextLine());
			System.out.println("Introduzca el título del disco nuevo: ");
			discos[cod].setTitulo(sc.nextLine());
			System.out.println("Introduzca el género del disco nuevo: ");
			discos[cod].setGenero(sc.nextLine());
			System.out.println("Introduzca la duración del disco nuevo: ");
			discos[cod].setDuracion(sc.nextInt());
			
		} else {

			System.err.println("El disco introducido no existe.");
		}
	}

	private static void borrarDisco(Disco[] discos) {

		int cod;

		System.out.println("Introduzca el código del disco a borrar: ");
		cod = sc.nextInt();

		// Buscamos el codigo y si existe lo cambiamos a libre.
		if (cod >= 0 && cod < discos.length && !discos[cod].getCodigo().equals("LIBRE")) {

			discos[cod].setCodigo("LIBRE");

		} else {

			System.out.println("Ese código no existe.");
		}
	}

}
