package uniandes.dpoo.aerolinea.modelo;
import java.util.Collection;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo 
{
	// Atributos de clase
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private Collection<Tiquete> tiquetes;
	
	// Metodos de clase
	public Vuelo(String fecha, Avion avion, Ruta ruta, Collection<Tiquete> tiquetes) {
		super();
		this.fecha = fecha;
		this.avion = avion;
		this.ruta = ruta;
		this.tiquetes = tiquetes;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public Collection<Tiquete> getTiquetes() {
		return tiquetes;
	}

	public void setTiquetes(Collection<Tiquete> tiquetes) {
		this.tiquetes = tiquetes;
	}
	
	public int venderTiquetes(Cliente cliente, calculadoraTarifas calculadora, int cantidad) {
		return -1;
	}
	
	public boolean equals(Object obj) {
		return false;
	}
}
