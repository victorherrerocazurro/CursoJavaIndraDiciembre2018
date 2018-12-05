package es.curso.java.back.servicios;

import es.curso.java.back.negocios.Negocio;
import es.curso.java.back.persistencias.ClientesDao;

public class ServicioImpl implements Servicio {

	private Negocio negocio;
	
	private ClientesDao persistencia;

	public ServicioImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServicioImpl(Negocio negocio, ClientesDao persistencia) {
		super();
		this.negocio = negocio;
		this.persistencia = persistencia;
	}

	/* (non-Javadoc)
	 * @see es.curso.java.back.servicios.Servicio#setNegocio(es.curso.java.back.negocios.Negocio)
	 */
	@Override
	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}

	/* (non-Javadoc)
	 * @see es.curso.java.back.servicios.Servicio#setPersistencia(es.curso.java.back.persistencias.Persistencia)
	 */
	@Override
	public void setPersistencia(ClientesDao persistencia) {
		this.persistencia = persistencia;
	}
	
}