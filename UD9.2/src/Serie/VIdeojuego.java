package Serie;

public class VIdeojuego implements Entregable{
	// Atributos

	private String titulo;
	private double horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;

	// Constructores

	public VIdeojuego() {
		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compania = "";
	}

	public VIdeojuego(String titulo, double horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.compania = "";
	}

	public VIdeojuego(String titulo, double horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = genero;
		this.compania = compania;
	}
	
	//funciones 
	
		public void entregar() {
			// TODO Auto-generated method stub
			this.entregado=true;
		}

		public void devolver() {
			// TODO Auto-generated method stub
			this.entregado=false;
		}

		public boolean isEntregado() {
			// TODO Auto-generated method stub
			return this.entregado;
		}

		public boolean compareTo(Object a) {
			// TODO Auto-generated method stub
			if (this.horasEstimadas > ((VIdeojuego) a).getHorasEstimadas()) {
				return true;
			} else {
				return false;
			}
			
		}

	// Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(double horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	// toString

	@Override
	public String toString() {
		return "VIdeojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}

	


}
