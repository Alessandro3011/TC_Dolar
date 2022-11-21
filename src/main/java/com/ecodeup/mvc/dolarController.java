package com.ecodeup.mvc;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.DAOFactory;
import entities.Dolar;
import interfaces.DolarInterfaces;
import lombok.Getter;
import lombok.Setter;


@Controller
@RequestMapping("/home")
public class dolarController {
	DAOFactory daoFactory=DAOFactory.getDAOFactory(DAOFactory.MYSQL8);
	
	DolarInterfaces dolarInt = daoFactory.getDolarInterface();
	
	@RequestMapping(value="/RegistroDolar",method=RequestMethod.GET)
	public String verDolar(ModelMap model) {
		return "registraTipoDeCambio";
	}
	
	@RequestMapping(value="/registraTipoDeCambio",method=RequestMethod.POST)
	@ResponseBody
	public String registrarDolar(String DC_TIPCAMB,ModelMap model) {
		String resultado = "";
		int resulDolar = -1;
		Dolar dolar = new Dolar();
		dolar.setDC_TIPCAMB(Double.parseDouble(DC_TIPCAMB));
		resulDolar = dolarInt.registrarDolar(dolar);
		if(resulDolar == 1) {
			resultado ="REGISTRO EXITOSO";
		}else {
			resultado ="REGISTRO ERRONEO";
		}
		return resultado;
	}
	
	
	
	@RequestMapping(value="/ListDolar", method=RequestMethod.GET)
	public String ListarDolar(Model model) {
		String query = "";
		List<Dolar> dolar = dolarInt.listadoDolar(query);	
		System.out.println(dolar);
		model.addAttribute("dolar", dolar);
		return "ListarDolar";
	}
	
	@RequestMapping(value="/convertidor")
	public String convertidor(ModelMap model) {
		return "convertidor";
	}
}
