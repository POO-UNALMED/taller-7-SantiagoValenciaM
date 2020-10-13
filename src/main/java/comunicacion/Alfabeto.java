package comunicacion;

public class Alfabeto extends Pictograma {
	
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion; 	
	}
	
	// getters and setters 
	
	public String[] getLetras() {
		return letras; 
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion; 
	}
	
	//methods
	
	public int cantidadLetras() {
		return this.getLetras().length;
	}
	public String interpretacion() {
		return this.interpretacion;
	}
	public String toString(){
        String l = "";
        for (int i = 0; i<letras.length ;i++){
            if(i<letras.length-1){
                l = l + letras[i]+", ";
            }
            else{
                l = l + letras[i];
            }
        }
        return l;
    }
}
