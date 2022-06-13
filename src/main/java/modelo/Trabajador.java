package modelo;

public class Trabajador extends Persona {
	private static String afp;
	private static String isapre;

	public Trabajador () {
		super("Juan", "Ramirez", "123456789");
		afp = "Provida";
		isapre = "Cruz blanca";
	}

	public String getAfp() {
		return afp;
	}

	public static void setAfp(String afp) {
		Trabajador.afp = afp;
	}

	public String getIsapre() {
		return isapre;
	}

	public static void setIsapre(String isapre) {
		Trabajador.isapre = isapre;
	}

	public String toString() {
		return ("Nombre: " + super.nombre + " " + super.apellido + "\nRut: " + super.rut +
				"\nAFP: " + Trabajador.afp + "\nIsapre: " + Trabajador.isapre);
	}
}