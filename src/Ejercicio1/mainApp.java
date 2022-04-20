package Ejercicio1;

public class mainApp {

	public static void main(String[] args) {
		// Instanciamos la clase Empleado con vvalores por defecto		
		Persona clasePersonaDefecto = new Persona();				
		System.out.println(clasePersonaDefecto);
		
		// Instanciamos la clase Empleado con vvalores por por parametro
		Persona clasePersonaSemiDefecto = new Persona();
		clasePersonaSemiDefecto.setNombre("Julia");
		clasePersonaSemiDefecto.setEdad(21);
		clasePersonaSemiDefecto.setSexo("M");
		System.out.println(clasePersonaSemiDefecto);
		
		// Instanciamos la clase Empleado con todos los vvalores por parametro
		Persona clasePersonaParametro = new Persona();
		clasePersonaParametro.setNombre("Hector");
		clasePersonaParametro.setEdad(45);
		clasePersonaParametro.setDni("35682395Z");
		clasePersonaParametro.setSexo("H");
		clasePersonaParametro.setPeso(93);
		clasePersonaParametro.setAltura(1.73);
		System.out.println(clasePersonaParametro);

	}

}
