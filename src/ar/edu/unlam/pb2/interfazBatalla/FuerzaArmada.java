package ar.edu.unlam.pb2.interfazBatalla;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.vehiculos.Avion;
import ar.edu.unlam.pb2.vehiculos.Vehiculo;

public class FuerzaArmada {

	private HashSet<Vehiculo> convoy;
	private HashMap<String, Batalla> batallas;
	
	public FuerzaArmada(HashSet<Vehiculo> convoy, HashMap<String, Batalla> batallas) {
		super();
		this.convoy = convoy;
		this.batallas = batallas;
	}
	
	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}

	public Set<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(HashSet<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public HashMap<String, Batalla> getBatallas() {
		return batallas;
	}

	public void setBatallas(HashMap<String, Batalla> batallas) {
		this.batallas = batallas;
	}

	public Object getCapacidadDeDefensa() {
		// TODO Auto-generated method stub
		return null;
	}

	public void crearBatalla(String string, TipoDeBatalla terrestre, double d, double e) {
		// TODO Auto-generated method stub
		
	}

	public Object getBatalla(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	public void presentarBatalla() {
		// TODO Auto-generated method stub
		
	}

	public void crearBatalla(String string, double d, double d2, String string2) {
		// TODO Auto-generated method stub
		
	}

	public boolean enviarALaBatalla(String string, int i) {
		// TODO Auto-generated method stub
		return false;
	} 

}
