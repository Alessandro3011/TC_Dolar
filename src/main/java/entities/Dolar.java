package entities;

import java.util.Date;

import lombok.Data;


@Data
public class Dolar {
	
	private int IN_ID_TCDolarXdia;
	private double DC_TIPCAMB;
	private Date DT_FEC_REG;
	public int getIN_ID_TCDolarXdia() {
		return IN_ID_TCDolarXdia;
	}
	public void setIN_ID_TCDolarXdia(int iN_ID_TCDolarXdia) {
		IN_ID_TCDolarXdia = iN_ID_TCDolarXdia;
	}
	public double getDC_TIPCAMB() {
		return DC_TIPCAMB;
	}
	public void setDC_TIPCAMB(double dC_TIPCAMB) {
		DC_TIPCAMB = dC_TIPCAMB;
	}
	public Date getDT_FEC_REG() {
		return DT_FEC_REG;
	}
	public void setDT_FEC_REG(Date dT_FEC_REG) {
		DT_FEC_REG = dT_FEC_REG;
	}
	
	
	
	
}
