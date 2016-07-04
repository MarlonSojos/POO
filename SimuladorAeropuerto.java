import java.util.ArrayList;
public class SimuladorAeropuerto {
***/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pasajero p1=new Pasajero(1305, 5, "Hamilton","Ecuatoriana", 32, Genero.masculino, ClaseCabina.empresarial);
		Pasajero p2=new Pasajero(1306, 6, "Marlon","Ecuatoriana", 37, Genero.masculino, ClaseCabina.economica);
		Pasajero p3=new Pasajero(1307, 7, "Diana","Ecuatoriana", 26, Genero.femenino, ClaseCabina.vip);
		
		Aeropuerto a1 = new Aeropuerto("Simon Bolivar", "Guayaquil", "Ecuador", "GYE-12345");
		Aeropuerto a2 = new Aeropuerto("Mariscal Sucre", "Quito", "Ecuador", "UIO-12345");
		Aeropuerto a3 = new Aeropuerto("jmjmjBolivar", "Guaklklklkyaquil", "Ecuador", "iiGG-12345");
		
		a1.registrarPasajeros(p1);
		a2.registrarPasajeros(p2);
		a3.registrarPasajeros(p3);
		
		System.out.println("Pasajero: " + p1);
		System.out.println("Pasajero: " + p3);
		System.out.println("Pasajero: " + p2);
		
	}

}
