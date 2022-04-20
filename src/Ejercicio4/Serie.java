package Ejercicio4;

public class Serie {

	// Creamos variables estaticas
	final private String TITULO = "defecto";
	final private int NUMTEMPORADA = 3;
	final private boolean ENTREGADO = false;
	final private String GENERO = "defecto";
	final private String CREADOR = "defecto";
	
	// Creamos variables
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		super();
		this.titulo = TITULO;
		this.numTemporadas = NUMTEMPORADA;
		this.entregado = ENTREGADO;
		this.genero = GENERO;
		this.creador = CREADOR;
		
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = NUMTEMPORADA;
		this.entregado = ENTREGADO;
		this.genero = GENERO;
		this.creador = creador;
		
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";		
	}
}
