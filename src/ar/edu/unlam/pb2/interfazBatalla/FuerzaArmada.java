package ar.edu.unlam.pb2.interfazBatalla;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.excepciones.BatallaInexistenteException;
import ar.edu.unlam.pb2.excepciones.VehiculoInexistenteException;
import ar.edu.unlam.pb2.interfaces.Acuatico;
import ar.edu.unlam.pb2.interfaces.Terrestre;
import ar.edu.unlam.pb2.interfaces.Volador;
import ar.edu.unlam.pb2.vehiculos.Avion;
import ar.edu.unlam.pb2.vehiculos.Vehiculo;

public class FuerzaArmada {

	private LinkedHashSet<Vehiculo> convoy;
	
	private HashMap<String, Batalla> batallas;
	
	public FuerzaArmada(LinkedHashSet<Vehiculo> convoy, HashMap<String, Batalla> batallas) {
		super();
		this.convoy = convoy;
		this.batallas = batallas;
	}
	
	public FuerzaArmada() {
		this.convoy = new LinkedHashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}

	public Set<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(LinkedHashSet<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public HashMap<String, Batalla> getBatallas() {
		return batallas;
	}

	public void setBatallas(HashMap<String, Batalla> batallas) {
		this.batallas = batallas;
	}

	public void crearBatalla(String nombreBatalla, TipoDeBatalla tipoDeBatalla, Double latitud, Double longitud) {
		
		this.batallas.put(nombreBatalla, new Batalla(latitud, longitud,tipoDeBatalla));
		
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		this.convoy.add(vehiculo);
		
	}

	public void presentarBatalla() {
		// TODO Auto-generated method stub
		
	}
/*
 * 1) Buscar batalla
 * 2) Buscar vehiculo en el convoy
 * 3) Enviar el vehiculo a la batalla
 */
	public boolean enviarALaBatalla(String nombreBatalla, Integer codigoVehiculo) throws Exception {
		Batalla batalla = buscarBatallaPorNombre(nombreBatalla);
		Vehiculo vehiculo = buscarVehiculo(codigoVehiculo);
		batalla.agregarVehiculo(vehiculo);
		
		return true;
		
//		if(batallas.containsKey(nombreBatalla)) {
//			
//			for(Vehiculo vehiculo : convoy){
//				
//				if(vehiculo.getCodigo().equals(codigoVehiculo)) {
//					
//					Vehiculo vehiculoEncontado = vehiculo;
//					
//					if(vehiculoEncontado instanceof Volador && batallas.get(nombreBatalla).getTipo() == TipoDeBatalla.AIRE) {
//						
//						batallas.get(nombreBatalla).getVehiculosEnLaBatalla().add(vehiculoEncontado);
//						
//						return true;
//						
//					}else if(vehiculoEncontado instanceof Terrestre && batallas.get(nombreBatalla).getTipo() == TipoDeBatalla.TERRESTRE) {
//						
//						batallas.get(nombreBatalla).getVehiculosEnLaBatalla().add(vehiculoEncontado);
//						
//						return true;
//						
//					}else if(vehiculoEncontado instanceof Acuatico && batallas.get(nombreBatalla).getTipo() == TipoDeBatalla.ACUATICA) {
//						
//						batallas.get(nombreBatalla).getVehiculosEnLaBatalla().add(vehiculoEncontado);
//						
//						return true;
//						
//					}else {
//						
//						return false;
//					}
//					
//				}
//			}
//			
//		}else {
//			return false;
//		}
//		
//		return false;
	}

	private Vehiculo buscarVehiculo(Integer codigoVehiculo) throws VehiculoInexistenteException {
		
		for(Vehiculo vehiculo : convoy) {
			if(vehiculo.getCodigo().equals(codigoVehiculo)) {
				
				return vehiculo;
				
			}
		}
		
		 throw new VehiculoInexistenteException("vehiculo inexistente");
	}

	private Batalla buscarBatallaPorNombre(String nombreBatalla) throws BatallaInexistenteException {
		
		if(this.batallas.containsKey(nombreBatalla)) {
			
			return this.batallas.get(nombreBatalla);
			
		}
		
		 throw new BatallaInexistenteException("batalla inexistente");
	} 

}
