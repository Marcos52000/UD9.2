package Serie;

public class Serie {
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		super();
		this.titulo = titulo;
		this.numeroTemporadas = 3;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false; 
	}
	
	
	public Serie(String titulo, String creador) {
		super();
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


	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
	
	

}
