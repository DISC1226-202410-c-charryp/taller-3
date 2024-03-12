package uniandes.dpoo.aerolinea.modelo.tarifas;

public abstract class CalculadoraTarifas 
{
	// Atributos de clase
	public double IMPUESTO = 0.28;
	
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return -1;
	}
	
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return -1;
	}
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		return 1.0;
	}
	protected int calcularDistanciaRuta(Ruta ruta) {
		return -1;
	}
	protected int calcularValorImpuestos(int costoBase) {
		return -1;
	}
}
