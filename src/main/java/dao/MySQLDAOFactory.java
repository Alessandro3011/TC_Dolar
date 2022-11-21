package dao;

import interfaces.DolarInterfaces;
import interfaces.PersonaInterface;
import interfaces.UsuarioInterface;

public class MySQLDAOFactory extends DAOFactory{

	@Override
	public UsuarioInterface getUsuarioInterface() {
		// TODO Auto-generated method stub
		return new UsuarioDAO();
	}

	@Override
	public PersonaInterface getPersonaInterface() {
		// TODO Auto-generated method stub
		return new PersonaDAO();
	}

	public DolarInterfaces getDolarInterface() {
		return new DolarDAO();
	}
	

}
