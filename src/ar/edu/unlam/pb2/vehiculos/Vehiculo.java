package ar.edu.unlam.pb2.vehiculos;

import java.util.Objects;

import ar.edu.unlam.pb2.interfazBatalla.TipoDeBatalla;

public abstract class Vehiculo implements Comparable<Vehiculo>{
	
	String nombre;
	Integer codigo;

	public Vehiculo(Integer codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public Vehiculo() {
		
	}

	public abstract Integer getVelocidad();
	
	public abstract TipoDeBatalla getTipo();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
	//	if (getClass() != obj.getClass())
	//		return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
