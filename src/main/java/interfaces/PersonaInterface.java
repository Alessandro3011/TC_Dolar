package interfaces;

import entities.Persona;
import entities.Usuario;

public interface PersonaInterface {
	public int registrarPersona(Persona obj);
	public int obtenerUltimoCodigo();
	public String validarExistencia(Persona obj);
	public int eliminarPersona(int IN_ID_PERSONA);
	public int actualizarPersona(Persona obj);
}
