package com.ewallet.cms.appli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ewallet.cms.appli.bean.Administrateurs;
import com.ewallet.cms.appli.service.AdministrateursService;

/**
 * Class controller pour la gestion des Administrateurs.
 * 
 * @author Diedhiou
 *
 */
@RestController
public class AdministrateursController {
	
	@Autowired
	private AdministrateursService administratorsService;
	/**
	 * Methode qui retourne les informations d'un ou des Administrateurs.
	 * @return
	 */
	@RequestMapping("/administrateurs")
	public List<Administrateurs> getAllAdministrators(){
		return administratorsService.getAllAdministrateurs();
	}
	/**
	 * Methode pour retourner les informations d'un administrateurs selon son id
	 * 
	 * @param id identifiant de l'administrateur
	 * 
	 * @return les informations de l'administrateur
	 */
	@RequestMapping("/administrateurs/{id}")
	public Administrateurs getAdministratorsBean(@PathVariable String id){
		return administratorsService.getAdministrateurs(id);
	}
	
	/**
	 * Methode pour la creation d'un administrateur.
	 * 
	 * @param adminBean
	 */
	@RequestMapping(method=RequestMethod.POST, value="/administrateurs")
	public void addAdministrateur(@RequestBody Administrateurs adminBean){
		administratorsService.addAdministrateur(adminBean);
	}
	
	/**
	 * Methode pour la mis a jours d'un administrateur.
	 * 
	 * @param adminBean AdministratorsBean
	 * 
	 * @param id identifiant de l'administrateur.
	 */
	@RequestMapping(method=RequestMethod.PUT, value="/administrateurs/{id}")
	public void updateAdministrateur(@RequestBody Administrateurs adminBean, @PathVariable String id){
		administratorsService.updateAdministrateur(adminBean, id);
	}
	

	/**
	 * Methode pour la suppression d'un administrateur.
	 * 
	*@param id identifiant de l'administrateur
	 */
	@RequestMapping(method=RequestMethod.DELETE, value="/administrateurs/{id}")
	public void deleteAdministrateur(@PathVariable String id){
		administratorsService.deleteAdministrateur(id);
	}
}
