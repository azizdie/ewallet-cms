package com.ewallet.cms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewallet.cms.beans.Administrateurs;
import com.ewallet.cms.repository.AdministrateursRepository;

/**
 * class pour la gestion des services des administrateurs
 * 
 * @author Diedhiou
 *
 */
@Service
public class AdministrateursService {

	@Autowired
	private AdministrateursRepository administrateursRepository;
			
	/**
	 * fonction qui retourne la liste des administrateurs.
	 * 
	 * @return List<Administrateurs> liste des administrateurs.
	 */
	public List<Administrateurs> getAllAdministrateurs(){
				
		List<Administrateurs>  adminList = new ArrayList<>();
		administrateursRepository.findAll().forEach(adminList::add);
		
		return adminList;
	}
	
	/**
	 * Methode pour retourner les informations d'un administrateurs selon son id
	 * 
	 * @param id identifiant de l'administrateur
	 * @return les informations de l'administrateur
	 */
	public Administrateurs getAdministrateurs(String id){
		return administrateursRepository.findOne(id);
	}

	/**
	 * Methode pour la creation d'un administrateur.
	 * 
	 * @param adminBean Administrateurs
	 */
	public void addAdministrateur(Administrateurs adminBean) {		
		administrateursRepository.save(adminBean);
	}

	/**
	 * Methode pour la mis a jours d'un administrateur.
	 * 
	 * @param adminBean AdministratorsBean
	 * @param id String
	 */
	public void updateAdministrateur(Administrateurs adminBean, String id) {
		administrateursRepository.save(adminBean);		
	}
	/**
	 * Methode pour la suppression d'un administrateur.
	 * 
	*@param id identifiant de l'administrateur
	 */
	public void deleteAdministrateur(String id) {		
		administrateursRepository.delete(id);
	}
}