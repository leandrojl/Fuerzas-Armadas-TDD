package ar.edu.unlam.pb2.vehiculos;

import ar.edu.unlam.pb2.interfaces.Acuatico;
import ar.edu.unlam.pb2.interfaces.Volador;
import ar.edu.unlam.pb2.interfazBatalla.TipoDeBatalla;

public class HidroAvion extends Vehiculo implements Volador, Acuatico{
	
	public HidroAvion(Integer codigo, String nombre) {
		super(codigo, nombre);
	}
	
	public HidroAvion() {
		
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

	@Override
	public TipoDeBatalla[] getTipo() {
		// TODO Auto-generated method stub
		return new TipoDeBatalla[] {TipoDeBatalla.ACUATICA, TipoDeBatalla.AIRE};
	}

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
