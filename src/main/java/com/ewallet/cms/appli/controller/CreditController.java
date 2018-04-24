package com.ewallet.cms.appli.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ewallet.cms.appli.bean.Credit;
import com.ewallet.cms.appli.service.CreditService;

/**
 * Class controller pour la gestion des credits.
 * 
 * @author Diedhiou Abdou Aziz.
 *
 */
@RestController
public class CreditController {
	
	@Autowired
	private CreditService creditService;
	
	/**
	 * Methode qui retourne les informations d'un ou des credits.
	 * 
	 * @return List<CreditBean>.
	 */
	@RequestMapping("/credits")
	public List<Credit> getAllCredits(){
		return creditService.getAllCredits();
	}
	
	/**
	 * Methode pour retourner les informations d'un credit selon son id.
	 * 
	 * @param id identifiant du credit.
	 * 
	 * @return CreditBean les informations du Credit.
	 */
	@RequestMapping("/credits/{id}")
	public Credit getCredit(@PathVariable BigInteger id){
		return creditService.getCredit(id);
	}
	
	/**
	 * Methode pour la creation d'un credit.
	 * 
	 * @param creditBean bean du credit.
	 */
	@RequestMapping(method=RequestMethod.POST, value="/credits")
	public void addCredit(@RequestBody Credit creditBean){
		creditService.addCredit(creditBean);
	}
	
	/**
	 * Methode pour la mis a jours d'un  credit.
	 * 
	 * @param creditBean CreditBean.
	 * 
	 * @param id id identifiant de CreditBean.
	 */
	@RequestMapping(method=RequestMethod.PUT, value="/credits/{id}")
	public void updateCredit(@RequestBody Credit creditBean, @PathVariable BigInteger id){
		creditService.updateCredit(creditBean, id);
	}
	

	/**
	 * Methode pour la suppression d'un credit.
	 * 
	*@param id identifiant du credit
	 */
	@RequestMapping(method=RequestMethod.DELETE, value="/credits/{id}")
	public void deleteApplication(@PathVariable BigInteger id){
		creditService.deleteCredit(id);
	}
}
