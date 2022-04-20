package Ejercicio4;

public class mainApp {

	public static void main(String[] args) {
		/* Instanciamos el objeto de la clase serie con los diferentes constructores */
		Serie claseSerie = new Serie();
		Serie claseSerie2 = new Serie("Juego de Tronos", "George");
		Serie claseSerie3 = new Serie("Dark", 5, "Misterio", "Jhonny");
		
		/* Imprimimos los atributos mediante el método toString.*/
		System.out.println(claseSerie);
		System.out.println();
		System.out.println(claseSerie2);
		System.out.println();
		System.out.println(claseSerie3);

	}

}
