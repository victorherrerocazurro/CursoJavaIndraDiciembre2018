package es.curso.java;

public class Saludo extends Object {

	Long id = null;
	
	private String sufijo = null;
	private String prefijo;




	public Saludo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Saludo(String sufijo, String prefijo) {
		super();
		this.sufijo = sufijo;
		this.prefijo = prefijo;
	}
	







	public String getSufijo() {
		return sufijo;
	}

	public void setSufijo(String sufijo) {
		
		if(sufijo.length() == 1) {
			this.sufijo = sufijo;
		} else {
			this.sufijo = null;
		}
	}

	public String getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}

	/**
	 * Metodo que debera retornar un saludo compuesto 
	 * con los atributos prefijo y sufijo y el 
	 * parametro aQuienSaludar
	 * 
	 * @param aQuienSaludar
	 * @return retorna un saludo en formato 
	 * prefijo + aQuienSaludar + sufijo
	 */
	
	public String saludar(String aQuienSaludar) {
		String saludo = 
				prefijo + aQuienSaludar + sufijo;
		return saludo;
	}
		
	
	
}