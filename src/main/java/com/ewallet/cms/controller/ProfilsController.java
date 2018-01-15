package com.ewallet.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ewallet.cms.beans.Administrateurs;
import com.ewallet.cms.beans.Profils;
import com.ewallet.cms.service.ProfilsService;

/**
 * Class controller pour la gestion du profil.
 * 
 * @author Diedhiou
 *
 */
@RestController
public class ProfilsController {
	
	@Autowired
	private ProfilsService profilsService;
	/**
	 * Methode qui retourne les informations d'un ou du profil.
	 * @return
	 */
	@RequestMapping("/administrateurs/{id}/profils")
	public List<Profils> getAllProfils(@PathVariable String id){
		return profilsService.getAllProfils(id);
	}
	/**
	 * Methode pour retourner les informations d'un Profils selon son id
	 * 
	 * @param id identifiant du profil
	 * 
	 * @return les informations du profil
	 */
	@RequestMapping("/administrateurs/{idAdmin}/profils/{id}")
	public Profils getProfils(@PathVariable String id){
		return profilsService.getProfils(id);
	}
	
	/**
	 * Methode pour la creation du profil.
	 * 
	 * @param profilsBean Profils
	 */
	@RequestMapping(method=RequestMethod.POST, value="/administrateurs/{idAdmin}/profils")
	public void addProfils(@RequestBody Profils profilsBean, @PathVariable String idAdmin){
		profilsBean.setAdministrateurs(new Administrateurs(idAdmin, "", "", ""));
		profilsService.addProfils(profilsBean);
	}
	
	/**
	 * Methode pour la mis a jours du profil.
	 * 
	 * @param profilsBean Profils
	 * 
	 * @param id identifiant du profil.
	 */
	@RequestMapping(method=RequestMethod.PUT, value="/administrateurs/{idAdmin}/profils/{id}")
	public void updateProfils(@RequestBody Profils profilsBean, @PathVariable String idAdmin, @PathVariable String id){
		profilsBean.setAdministrateurs(new Administrateurs(idAdmin, "", "", ""));
		profilsService.updateProfils(profilsBean);
	}
	

	/**
	 * Methode pour la suppression du profil.
	 * 
	*@param id identifiant du profil
	 */
	@RequestMapping(method=RequestMethod.DELETE, value="/administrateurs/{idAdmin}/profils/{id}")
	public void deleteProfilsr(@PathVariable String id){
		profilsService.deleteProfils(id);
	}
}
