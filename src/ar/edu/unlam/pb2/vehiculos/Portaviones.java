package ar.edu.unlam.pb2.vehiculos;

import ar.edu.unlam.pb2.interfaces.Acuatico;

public class Portaviones extends Vehiculo implements Acuatico{
	
	public Portaviones(Integer codigo, String nombre) {
		super(codigo, nombre);
	}
	
	public Portaviones() {
		
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

}
