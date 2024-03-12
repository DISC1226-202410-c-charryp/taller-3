package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente 
{
	// Atributos de clase
	private Collection<Tiquete> tiquetesSinUsar;
	private Collection<Tiquete> tiquetesUsados;
	
	// Metodos de clase
	public Cliente() {
	}
	
	public abstract String tipoCliente();
	
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete) {
		
	}
	
	public int calcularValorTotalTiquetes() {
		return -1;
	}
	
	public void usarTiquetes(Vuelo vuelo) {
		
	}
}
