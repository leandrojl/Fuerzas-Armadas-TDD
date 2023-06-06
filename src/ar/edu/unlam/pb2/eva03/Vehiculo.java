package ar.edu.unlam.pb2.eva03;

public abstract class Vehiculo {
	
	String nombre;
	Integer capacidad;

	public Vehiculo(Integer capacidad, String nombre) {
		this.capacidad = capacidad;
		this.nombre = nombre;
	}
	
	public Vehiculo() {
		
	}

	protected abstract Integer getVelocidad();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

}
