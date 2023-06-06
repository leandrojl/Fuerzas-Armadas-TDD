package ar.edu.unlam.pb2.eva03;

public abstract class Vehiculo {
	
	String nombre;
	Integer codigo;

	public Vehiculo(Integer codigo, String nombre) {
		this.codigo = codigo;
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

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
