package ar.edu.unlam.pb2.vehiculos;

import ar.edu.unlam.pb2.interfaces.Volador;
import ar.edu.unlam.pb2.interfazBatalla.TipoDeBatalla;

public class Avion extends Vehiculo implements Volador{

	public Avion(Integer codigo, String nombre) {
		super(codigo, nombre);
	}

	public Avion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer getVelocidad() {
		// TODO Auto-generated method stub
		return null;
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
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TipoDeBatalla[] getTipo() {
		// TODO Auto-generated method stub
		return new TipoDeBatalla[] {TipoDeBatalla.AIRE};
	}

}
