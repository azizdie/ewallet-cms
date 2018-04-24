package com.ewallet.cms.appli.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewallet.cms.appli.bean.Profils;
import com.ewallet.cms.appli.repository.ProfilsRepository;

/**
 * class pour la gestion des services des Profils
 * 
 * @author Diedhiou
 *
 */
@Service
public class ProfilsService {

	@Autowired
	private ProfilsRepository profilsRepository;
			
	/**
	 * fonction qui retourne la liste des Profils.
	 * 
	 * @param administrateursId String 
	 * @return List<Profils> liste des Profils.
	 */
	public List<Profils> getAllProfils(String administrateursId){
				
		List<Profils>  profilsList = new ArrayList<>();
		profilsRepository.findByAdministrateursId(administrateursId).forEach(profilsList::add);
		
		return profilsList;
	}
	
	/**
	 * Methode pour retourner les informations d'un Profil selon son id
	 * 
	 * @param id identifiant du profil
	 * @return les informations du profil
	 */
	public Profils getProfils(String id){
		return profilsRepository.findOne(id);
	}

	/**
	 * Methode pour la creation du profil.
	 * 
	 * @param profilsBean Profils
	 */
	public void addProfils(Profils profilsBean) {		
		profilsRepository.save(profilsBean);
	}

	/**
	 * Methode pour la mis a jours d'un profil.
	 * 
	 * @param profilsBean Profils
	 */
	public void updateProfils(Profils profilsBean) {
		profilsRepository.save(profilsBean);		
	}
	/**
	 * Methode pour la suppression du profil..
	 * 
	*@param id identifiant du profil
	 */
	public void deleteProfils(String id) {		
		profilsRepository.delete(id);
	}
}
