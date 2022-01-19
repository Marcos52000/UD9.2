package Clases;

public class Serie implements Entregable {
	// atributos
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// constructores

	public Serie() {
		this.titulo = titulo;
		this.numeroTemporadas = 3;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = 3;
		this.genero = "";
		this.creador = creador;
		this.entregado = false;
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}

	// funciones

	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado = true;
	}

	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
	}

	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return this.entregado;
	}

	public boolean compareTo(Object a) {
		// TODO Auto-generated method stub
		if (this.numeroTemporadas > ((Serie) a).getNumeroTemporadas()) {
			return true;
		} else {
			return false;
		}
	}

	// getters y setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
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
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
