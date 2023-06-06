package ar.edu.unlam.pb2.vehiculos;

import ar.edu.unlam.pb2.interfaces.Acuatico;
import ar.edu.unlam.pb2.interfaces.Volador;

public class HidroAvion extends Vehiculo implements Volador, Acuatico{
	
	public HidroAvion(Integer codigo, String nombre) {
		super();
	}
	
	public HidroAvion() {
		
	}

	@Override
	protected Integer getVelocidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sumergir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salirDelAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void estacionarEnElAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverseSobreElAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverseEnElAire() {
		// TODO Auto-generated method stub
		
	}

}
