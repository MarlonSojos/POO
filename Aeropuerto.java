import java.util.ArrayList;
public class Aeropuerto {
	private String nombreAeropuerto="";
	private String ciudad="";
	private String pais="";
	private String codigoAeropuerto="";
	private ArrayList<Pasajero>pasajerosAurotizados = new ArrayList<Pasajero>();
	
	
	public Aeropuerto(String nombreAeropuerto, String ciudad, String pais, String codigoAeropuerto
			) {
		super();
		this.nombreAeropuerto = nombreAeropuerto;
		this.ciudad = ciudad;
		this.pais = pais;
		this.codigoAeropuerto = codigoAeropuerto;
		
	}
	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}
	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCodigoAeropuerto() {
		return codigoAeropuerto;
	}
	public void setCodigoAeropuerto(String codigoAeropuerto) {
		this.codigoAeropuerto = codigoAeropuerto;
	}
	
	public void registrarPasajeros(Pasajero p1){
		pasajerosAurotizados.add(p1);	
	}
}
