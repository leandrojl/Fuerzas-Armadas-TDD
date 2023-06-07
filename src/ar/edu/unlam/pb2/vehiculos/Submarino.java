package ar.edu.unlam.pb2.vehiculos;

import ar.edu.unlam.pb2.interfaces.Acuatico;

public class Submarino extends Vehiculo implements Acuatico{
	
	Integer profundidad;

	public Submarino(Integer codigo, String nombre) {
		super(codigo, nombre);
	}
	
	public Submarino() {
		
	}
	
	public Integer getProfundidad() {
		return profundidad;
	}


	public void setProfundidad(Integer profundidad) {
		this.profundidad = profundidad;
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
	protected Integer getVelocidad() {
		// TODO Auto-generated method stub
		return null;
	}

}
