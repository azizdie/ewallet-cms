package com.ewallet.cms.appli.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewallet.cms.appli.bean.Appliant;
import com.ewallet.cms.appli.repository.AppliantRepository;

/**
 * class pour la gestion des services des Appliants
 * 
 * @author Diedhiou Abdou Aziz
 *
 */
@Service
public class AppliantService {

	@Autowired
	private AppliantRepository appliantRepository;
			
	/**
	 * fonction qui retourne la liste des appliants.
	 * 
	 * @return List<AppliantBean> liste des appliantBean.
	 */
	public List<Appliant> getAllAppliants(){
				
		List<Appliant>  appliantList = new ArrayList<>();
		appliantRepository.findAll().forEach(appliantList::add);
		
		return appliantList;
	}
	
	/**
	 * Methode pour retourner les informations d'un appliant selon son id
	 * 
	 * @param id identifiant de l'appliant
	 * @return les informations de l'appliant
	 */
	public Appliant getAppliant(BigInteger id){
		return appliantRepository.findOne(id);
	}

	/**
	 * Methode pour la creation d'un appliant.
	 * 
	 * @param appliantBean Appliant
	 */
	public void addAppliant(Appliant appliantBean) {		
		appliantRepository.save(appliantBean);
	}

	/**
	 * Methode pour la mis a jours d'un appliant.
	 * 
	 * @param appliantBean AppliantBean
	 * @param id BigInteger
	 */
	public void updateAppliant(Appliant appliantBean, BigInteger id) {
		appliantRepository.save(appliantBean);		
	}
	/**
	 * Methode pour la suppression d'un appliant.
	 * 
	*@param id identifiant de l'appliant
	 */
	public void deleteAppliant(BigInteger id) {		
		appliantRepository.delete(id);
	}
}