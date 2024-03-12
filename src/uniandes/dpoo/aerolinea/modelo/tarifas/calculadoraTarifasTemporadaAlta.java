package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class calculadoraTarifasTemporadaAlta extends CalculadoraTarifas {

	// Atributos de clase
	protected int COSTO_POR_KM = 1000;
	
	// Metodos de clase
	public int calcularCostoBase(Cliente client, Vuelo vuelo) {
		return -1;
	}
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return 1.0;
	}
}
