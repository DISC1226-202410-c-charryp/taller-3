package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class calculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
	// Atributos de clase
	protected int COSTO_POR_KM_NATURAL = 600;
	protected int COSTO_POR_KM_CORPORATIVO = 900;
	protected double DESCUENTO_PEQ = 0.02;
	protected double DESCUENTO_MEDIANAS = 0.1;
	protected double DESCUENTO_GRANDES = 0.2;
	
	// Metodos de clase
	public int calcularCostoBase(Cliente client, Vuelo vuelo) {
		return -1;
	}
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return 1.0;
	}
}
