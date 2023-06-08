package ar.edu.unlam.pb2.vehiculos;

import ar.edu.unlam.pb2.interfaces.Acuatico;
import ar.edu.unlam.pb2.interfazBatalla.TipoDeBatalla;

public class Portaviones extends Vehiculo implements Acuatico{
	
	public Portaviones(Integer codigo, String nombre) {
		super(codigo, nombre);
	}
	
	public Portaviones() {
		
	}

	@Override
	public Integer getVelocidad() {
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
