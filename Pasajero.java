
public class Pasajero {
	private int pasaporte;
	private int numeroDeViajeroFrecuente;
	private String nombre="";
	private boolean checkedln;
	private String nacionalidad="";
	private int edad;
	private Genero tipoG;
	private ClaseCabina tipoC;
	
	public Pasajero(int pasaporte, int numeroDeViajeroFrecuente, String nombre, String nacionalidad,
			int edad, Genero tipoG, ClaseCabina tipoC) {
		super();
		this.pasaporte = pasaporte;
		this.numeroDeViajeroFrecuente = numeroDeViajeroFrecuente;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.tipoG = tipoG;
		this.tipoC = tipoC;
	}

	public int getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(int pasaporte) {
		this.pasaporte = pasaporte;
	}

	public int getNumeroDeViajeroFrecuente() {
		return numeroDeViajeroFrecuente;
	}

	public void setNumeroDeViajeroFrecuente(int numeroDeViajeroFrecuente) {
		this.numeroDeViajeroFrecuente = numeroDeViajeroFrecuente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isCheckedln() {
		return checkedln;
	}

	public void setCheckedln(boolean checkedln) {
		this.checkedln = checkedln;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Genero getTipoG() {
		return tipoG;
	}

	public void setTipoG(Genero tipoG) {
		this.tipoG = tipoG;
	}

	public ClaseCabina getTipoC() {
		return tipoC;
	}

	public void setTipoC(ClaseCabina tipoC) {
		this.tipoC = tipoC;
	}

	public  boolean confirmarCkeckdln(){
		boolean checkedln = true;
		
		return checkedln;
	}

	@Override
	public String toString() {
		return "Pasajero [pasaporte=" + pasaporte + ", numeroDeViajeroFrecuente=" + numeroDeViajeroFrecuente
				+ ", nombre=" + nombre + ", checkedln=" + checkedln + ", nacionalidad=" + nacionalidad + ", edad="
				+ edad + "]";
	}
	
}
