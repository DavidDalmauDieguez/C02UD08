package Ejercicio3;

public class Electrodomestico {
	// Creamos variables estaticas
	final private int PRECIOBASE = 100;
	final private String COLOR = "blanco";
	final private char CONSUMOENERGETICO = 'F';
	final private int PESO = 5;
	
	// Creamos variables
	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
	
	// Enumeramos el contenido disponible
	enum consumoEnergia{A, B, C, D, F}
	enum Color{blanco, negro, rojo, azul,gris}
	
	// Creamos constructor con variables estaticas
	public Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = PESO;
	}

	// Creamos constructor con precioBase y peso variables
	public Electrodomestico(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
	}

	// Creamos constructor
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}


	//Creamos getters y setters
	public int getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}


	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}

	// Creamos metodo toString
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}	
}
