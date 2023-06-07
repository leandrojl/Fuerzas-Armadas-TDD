package ar.edu.unlam.pb2.vehiculos;

import ar.edu.unlam.pb2.interfaces.Terrestre;

public class Destructor extends Vehiculo implements Terrestre {
	
	public Destructor(Integer codigo, String nombre) {
		super(codigo, nombre);
	}
	
	public Destructor() {
		
	}

	@Override
	protected Integer getVelocidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void avanzarSobreTierra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detenerseSobreTierra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverseSobreTierra() {
		// TODO Auto-generated method stub
		
	}
}
