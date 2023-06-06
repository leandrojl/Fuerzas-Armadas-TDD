package ar.edu.unlam.pb2.vehiculos;

import ar.edu.unlam.pb2.interfaces.Acuatico;
import ar.edu.unlam.pb2.interfaces.Terrestre;

public class Anfibio extends Vehiculo implements Terrestre,Acuatico{
	
	Integer profundidad;

	public Anfibio(Integer codigo, String nombre) {
		super();
	}
	
	public Anfibio() {
		
	}
	
	public Integer getProfundidad() {
		return profundidad;
	}


	public void setProfundidad(Integer profundidad) {
		this.profundidad = profundidad;
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
