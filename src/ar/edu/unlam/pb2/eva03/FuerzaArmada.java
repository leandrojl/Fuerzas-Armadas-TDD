package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

}
