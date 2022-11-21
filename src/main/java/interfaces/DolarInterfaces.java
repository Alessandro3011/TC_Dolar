package interfaces;

import java.util.ArrayList;
import java.util.List;

import entities.Dolar;


public interface DolarInterfaces {
	public int registrarDolar(Dolar obj);
	public int eliminarPersona(int IN_ID_TCDolarXdia);
	public int actualizarPersona(Dolar obj);
	public List<Dolar> listado(String fec1, String fec2);
	ArrayList<Dolar> listadoDolar(String query);
}
