package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
	private int IN_ID_PERSONA;
	private String VC_NOMBRE;
	private String VC_DNI;
	public int getIN_ID_PERSONA() {
		return IN_ID_PERSONA;
	}
	public void setIN_ID_PERSONA(int iN_ID_PERSONA) {
		IN_ID_PERSONA = iN_ID_PERSONA;
	}
	public String getVC_NOMBRE() {
		return VC_NOMBRE;
	}
	public void setVC_NOMBRE(String vC_NOMBRE) {
		VC_NOMBRE = vC_NOMBRE;
	}
	public String getVC_DNI() {
		return VC_DNI;
	}
	public void setVC_DNI(String vC_DNI) {
		VC_DNI = vC_DNI;
	}

	
	
}
