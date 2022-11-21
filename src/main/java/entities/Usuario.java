package entities;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

public class Usuario {
	private int IN_ID_USUARIO;
	private int IN_ID_PERSONA;
	private String VC_USER;
	private String VC_PASSWORD;
	private Date DT_FEC_REG;
	private String VC_NOMBRE;
	private String VC_DNI;
	public int getIN_ID_USUARIO() {
		return IN_ID_USUARIO;
	}
	public void setIN_ID_USUARIO(int iN_ID_USUARIO) {
		IN_ID_USUARIO = iN_ID_USUARIO;
	}
	public int getIN_ID_PERSONA() {
		return IN_ID_PERSONA;
	}
	public void setIN_ID_PERSONA(int iN_ID_PERSONA) {
		IN_ID_PERSONA = iN_ID_PERSONA;
	}
	public String getVC_USER() {
		return VC_USER;
	}
	public void setVC_USER(String vC_USER) {
		VC_USER = vC_USER;
	}
	public String getVC_PASSWORD() {
		return VC_PASSWORD;
	}
	public void setVC_PASSWORD(String vC_PASSWORD) {
		VC_PASSWORD = vC_PASSWORD;
	}
	public Date getDT_FEC_REG() {
		return DT_FEC_REG;
	}
	public void setDT_FEC_REG(Date dT_FEC_REG) {
		DT_FEC_REG = dT_FEC_REG;
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
