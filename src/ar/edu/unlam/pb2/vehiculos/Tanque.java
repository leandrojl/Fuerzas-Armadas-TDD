package ar.edu.unlam.pb2.vehiculos;

import ar.edu.unlam.pb2.interfaces.Terrestre;

public class Tanque extends Vehiculo implements Terrestre{

	public Tanque(Integer codigo, String nombre) {
		super();
	}
	
	public Tanque() {
		
	}

	@Override
	protected Integer getVelocidad() {
		// TODO Auto-generated method stub
		return 0;
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