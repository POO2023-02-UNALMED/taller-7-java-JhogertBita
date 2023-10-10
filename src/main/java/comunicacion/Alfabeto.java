package comunicacion;

public class Alfabeto extends Pictograma {
	private static String[] letras;
	private String interpretacion;
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	public String interpretacion() {
		return this.interpretacion;
	}
    public String toString() {
        String alfabeto="";
		for (String letra:letras) {
			if(letra.equals("Z")) {
				alfabeto+=letra;
			}
			else {
				alfabeto+=letra+", ";
			}
		}
		return alfabeto;
    }

	public static String[] getLetras() {
		return letras;
	}
	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}