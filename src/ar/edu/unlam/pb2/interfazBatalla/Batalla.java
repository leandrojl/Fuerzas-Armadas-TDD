package ar.edu.unlam.pb2.interfazBatalla;

import java.util.HashSet;

import ar.edu.unlam.pb2.excepciones.VehiculoIncompatibleException;
import ar.edu.unlam.pb2.excepciones.VehiculoInexistenteException;
import ar.edu.unlam.pb2.vehiculos.Vehiculo;


public class Batalla {
	
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	HashSet<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla(Double latitud, Double longitud, TipoDeBatalla tipo) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.vehiculosEnLaBatalla = new HashSet<>();
	}
	
	public Batalla() {
		
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public HashSet<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	public void setVehiculosEnLaBatalla(HashSet<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}

	public void agregarVehiculo(Vehiculo vehiculo) throws VehiculoInexistenteException, VehiculoIncompatibleException {
		validarVehiculo(vehiculo);
		this.vehiculosEnLaBatalla.add(vehiculo);
	}

	private Boolean validarVehiculo(Vehiculo vehiculo) throws VehiculoIncompatibleException {
		//String palabra = vehiculo.getClass().getSimpleName();
		//!vehiculo.getClass().getSimpleName().equals(this.tipo.toString())
		
			for(int i=0; i< vehiculo.getTipo().length;i++) {
				if(vehiculo.getTipo()[i].equals(this.tipo)) {
					return true;
				}
			}	
		
		
		throw new VehiculoIncompatibleException("vehiculo incompatible");
//		if(vehiculo.getCodigo()<0) {
//			throw new Exception("vehiculo incompatible");
//		}
	}

	

	
	
	
}
