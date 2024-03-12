package uniandes.dpoo.aerolinea.modelo;

public class Avion 
{
	// Atributos de clase
	private int capacidad;
	private String nombre;
	
	// Metodos de clase
	public Avion(int capacidad, String nombre) {
		super();
		this.capacidad = capacidad;
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
