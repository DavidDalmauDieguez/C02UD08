package Ejercicio2;

import java.util.Random;

public class Password {
	// Creamos las variables
	private int longitud = 8;
	private String contrasena = "";

	// Creamos el constructor
	public Password(int longitud, String contrasena) {
		super();
		this.longitud = longitud;
		this.contrasena = contrasena;
	}

	// Creamos los getters y setters
	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	// Funcion para crear una contraseña aleatoria
	public String generarContraseña() {
		int[] longitudArray = new int[longitud];
		
		for (int i = 0; i < longitudArray.length; i++) {
			longitudArray[i] = (int)(Math.random()*8);
			contrasena +=longitudArray[i];
		}
		return contrasena;
	}
	
	
	// Creamos el toString
	@Override
	public String toString() {
		return "Tu contraseña es: " + generarContraseña();
	}




}