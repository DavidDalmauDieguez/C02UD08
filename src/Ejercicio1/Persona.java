package Ejercicio1;

// Haz una clase llamada Persona que siga las siguientes condigciones:
// Sus atributos son: nombre,edad,sexo(H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. 
// Piensa que modificador de acceso es el mas adecuado, tambien su tipo. Si quieres algun atributo puedes hacerlo.

// Por defecto, todos los atributos menos DNI seran valores por defecto segun su tipo (0 numeros, cadena vacia para String, etc.). 
// Sexo sera hombre por defecto, usa una constante para ello

// Se implantar varios constructories: un constructor por defecto
// Un constructor con el nombre, edad y sexo, el resto por defecto
// Un constructor con todos los atributos como parametro

public class Persona {
	// Creamos parametros
	final private String NOMBRE = "David";
	final private int EDAD = 22;
	final private String DNI = "34939972C";
	final private String SEXO = "H";
	final private int PESO = 70;
	final private double ALTURA = 1.90;

	// Atributos de clase
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private int peso;
	private double altura;

	// Creamos el constructor con valores por defecto
	public Persona() {
		super();
		this.nombre = NOMBRE;
		this.edad = EDAD;
		this.dni = DNI;
		this.sexo = SEXO;
		this.peso = PESO;
		this.altura = ALTURA;
	}

	// Creamos el constructor con algunos valores por parametro
	public Persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = DNI;
		this.sexo = sexo;
		this.peso = PESO;
		this.altura = ALTURA;
	}

	// Creamos el constructor con valores por parametro
	public Persona(String nombre, int edad, String dni, String sexo, int peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	// Creamos los getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Creamos el getToString para poder imprimir
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	

	
	
}
