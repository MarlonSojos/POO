import java.util.ArrayList; 
public class Vuelo {
	private static int codigoDeVuelo;
	private String aeropuertoDeOrigen="";
	private String aeropuertoDeDestino="";
	private int kilometros;
	private String piloto="";
	private String fecha="";
	private String duracion="";
	private String horaDePartida="";
	private String horaDeArribo="";
	public static int numeroMaximoPasajeros = 40;
	private ArrayList<Pasajero> pasajeroRegistrados=new ArrayList<Pasajero>();
	public Vuelo(String aeropuertoDeOrigen, String aeropuertoDeDestino, int kilometros, String piloto, String fecha,
			String duracion, String horaDePartida, String horaDeArribo, ArrayList<Pasajero> pasajeroRegistrados) {
		super();
		this.aeropuertoDeOrigen = aeropuertoDeOrigen;
		this.aeropuertoDeDestino = aeropuertoDeDestino;
		this.kilometros = kilometros;
		this.piloto = piloto;
		this.fecha = fecha;
		this.duracion = duracion;
		this.horaDePartida = horaDePartida;
		this.horaDeArribo = horaDeArribo;
		this.pasajeroRegistrados = pasajeroRegistrados;
	}
	public static int getCodigoDeVuelo() {
		return codigoDeVuelo;
	}
	public static void setCodigoDeVuelo(int codigoDeVuelo) {
		Vuelo.codigoDeVuelo = codigoDeVuelo;
	}
	public String getAeropuertoDeOrigen() {
		return aeropuertoDeOrigen;
	}
	public void setAeropuertoDeOrigen(String aeropuertoDeOrigen) {
		this.aeropuertoDeOrigen = aeropuertoDeOrigen;
	}
	public String getAeropuertoDeDestino() {
		return aeropuertoDeDestino;
	}
	public void setAeropuertoDeDestino(String aeropuertoDeDestino) {
		this.aeropuertoDeDestino = aeropuertoDeDestino;
	}
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getHoraDePartida() {
		return horaDePartida;
	}
	public void setHoraDePartida(String horaDePartida) {
		this.horaDePartida = horaDePartida;
	}
	public String getHoraDeArribo() {
		return horaDeArribo;
	}
	public void setHoraDeArribo(String horaDeArribo) {
		this.horaDeArribo = horaDeArribo;
	}
	public ArrayList<Pasajero> getPasajeroRegistrados() {
		return pasajeroRegistrados;
	}
	public void setPasajeroRegistrados(ArrayList<Pasajero> pasajeroRegistrados) {
		this.pasajeroRegistrados = pasajeroRegistrados;
	}
	
	

}
