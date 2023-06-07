package ar.edu.unlam.pb2.vehiculos;

import ar.edu.unlam.pb2.interfaces.Terrestre;
import ar.edu.unlam.pb2.interfazBatalla.TipoDeBatalla;

public class Camion extends Vehiculo implements Terrestre{

	public Camion(Integer codigo, String nombre) {
		super(codigo, nombre);
	}
	
	public Camion() {
		
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

	@Override
	public Integer getVelocidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoDeBatalla getTipo() {
		// TODO Auto-generated method stub
		return TipoDeBatalla.TERRESTRE;
	}
	
}
