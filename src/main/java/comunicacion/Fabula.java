package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion; 
	
	public Fabula (String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	// getters and setters 
	
	public String getEnsenanza() {
		return ensenanza;
	}
	
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion; 
	}
	
	//methods 
	
	public int palabrasTotales(int parametro) {
		return this.getPaginas()*parametro*1;
	}
	
	public String interpretacion() {
		return this.getInterpretacion();
	}
	
	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.getEnsenanza(); 
	}
}
