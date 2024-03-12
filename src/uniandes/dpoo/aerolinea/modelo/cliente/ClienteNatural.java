package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente
{
	// Atributos de clase
	public String NATURAL = "Natural";
	private String nombre;
	
	// Metodos de clase
	public ClienteNatural(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String tipoCliente() {
		return "";
	}
	
	public String getIdentificador() {
		return "";
	}
}
