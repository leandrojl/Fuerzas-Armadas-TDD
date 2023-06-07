package ar.edu.unlam.pb2.excepciones;

public class VehiculoInexistenteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public VehiculoInexistenteException(String mensaje) {
		super(mensaje); 
	}

}
