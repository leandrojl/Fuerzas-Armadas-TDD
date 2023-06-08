package ar.edu.unlam.pb2.vehiculos;

import ar.edu.unlam.pb2.interfaces.Acuatico;
import ar.edu.unlam.pb2.interfazBatalla.TipoDeBatalla;

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
	public Integer getVelocidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TipoDeBatalla[] getTipo() {
		// TODO Auto-generated method stub
		return new TipoDeBatalla[] {TipoDeBatalla.ACUATICA};
	}

}
