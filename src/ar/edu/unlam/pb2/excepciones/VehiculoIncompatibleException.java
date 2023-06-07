package ar.edu.unlam.pb2.excepciones;

public class VehiculoIncompatibleException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public VehiculoIncompatibleException(String mensaje) {
		super(mensaje); 
	}

}
