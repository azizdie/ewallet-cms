package com.ewallet.cms.appli.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewallet.cms.appli.bean.Credit;
import com.ewallet.cms.appli.repository.CreditRepository;

/**
 * class pour la gestion des services des credits.
 * 
 * @author Diedhiou Abdou Aziz.
 *
 */
@Service
public class CreditService {

	@Autowired
	private CreditRepository creditRepository;
			
	/**
	 * fonction qui retourne la liste des credits.
	 * 
	 * @return List<CreditBean> liste des CreditBean.
	 */
	public List<Credit> getAllCredits(){
				
		List<Credit>  creditList = new ArrayList<>();
		creditRepository.findAll().forEach(creditList::add);
		
		return creditList;
	}
	
	/**
	 * Methode pour retourner les informations d'un credit selon son id.
	 * 
	 * @param id identifiant du credit.
	 * @return les informations du credit.
	 */
	public Credit getCredit(BigInteger id){
		return creditRepository.findOne(id);
	}

	/**
	 * Methode pour la creation d'un credit.
	 * 
	 * @param creditBean CreditBean.
	 */
	public void addCredit(Credit creditBean) {		
		creditRepository.save(creditBean);
	}

	/**
	 * Methode pour la mis a jours d'un credit.
	 * 
	 * @param creditBean CreditBean
	 * @param id BigInteger
	 */
	public void updateCredit(Credit creditBean, BigInteger id) {
		creditRepository.save(creditBean);		
	}
	/**
	 * Methode pour la suppression d'un credit.
	 * 
	*@param id identifiant du credit
	 */
	public void deleteCredit(BigInteger id) {		
		creditRepository.delete(id);
	}
}