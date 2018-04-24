package com.ewallet.cms.appli.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ewallet.cms.appli.bean.Appliant;
import com.ewallet.cms.appli.service.AppliantService;

/**
 * Class controller pour la gestion des appliants.
 * 
 * @author Diedhiou Abdou aziz
 *
 */
@RestController
public class AppliantController {
	
	@Autowired
	private AppliantService appliantService;
	
	/**
	 * Methode qui retourne les informations d'un ou des appliants.
	 * 
	 * @return List<AppliantBean>
	 */
	@RequestMapping("/appliants")
	public List<Appliant> getAllAppliant(){
		return appliantService.getAllAppliants();
	}
	
	/**
	 * Methode pour retourner les informations d'un appliant selon son id
	 * 
	 * @param id identifiant de l'appliant
	 * 
	 * @return les informations de l'appliant
	 */
	@RequestMapping("/appliants/{id}")
	public Appliant getAppliant(@PathVariable BigInteger id){
		return appliantService.getAppliant(id);
	}
	
	/**
	 * Methode pour la creation d'un appliant.
	 * 
	 * @param appliantBean
	 */
	@RequestMapping(method=RequestMethod.POST, value="/appliants")
	public void addAppliant(@RequestBody Appliant appliantBean){
		appliantService.addAppliant(appliantBean);
	}
	
	/**
	 * Methode pour la mis a jours d'un appliant.
	 * 
	 * @param appliantBean AppliantBean
	 * 
	 * @param id identifiant de AppliantBean.
	 */
	@RequestMapping(method=RequestMethod.PUT, value="/appliants/{id}")
	public void updateAppliant(@RequestBody Appliant appliantBean, @PathVariable BigInteger id){
		appliantService.updateAppliant(appliantBean, id);
	}
	

	/**
	 * Methode pour la suppression d'un appliant.
	 * 
	*@param id identifiant de l'appliant
	 */
	@RequestMapping(method=RequestMethod.DELETE, value="/appliants/{id}")
	public void deleteAppliant(@PathVariable BigInteger id){
		appliantService.deleteAppliant(id);
	}
}
