package com.ewallet.cms.appli.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewallet.cms.appli.bean.Application;
import com.ewallet.cms.appli.repository.ApplicationRepository;

/**
 * class pour la gestion des services des application
 * 
 * @author Diedhiou Abdou Aziz
 *
 */
@Service
public class ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;
			
	/**
	 * fonction qui retourne la liste des applications.
	 * 
	 * @return List<ApplicationBean> liste des applicationBean.
	 */
	public List<Application> getAllApplications(){
				
		List<Application>  applicationList = new ArrayList<>();
		applicationRepository.findAll().forEach(applicationList::add);
		
		return applicationList;
	}
	
	/**
	 * Methode pour retourner les informations d'une application selon son id
	 * 
	 * @param id identifiant de l'application
	 * @return les informations de l'application
	 */
	public Application getApplication(BigInteger id){
		return applicationRepository.findOne(id);
	}

	/**
	 * Methode pour la creation d'une application.
	 * 
	 * @param applicationBean ApplicationBean
	 */
	public void addApplication(Application applicationBean) {		
		applicationRepository.save(applicationBean);
	}

	/**
	 * Methode pour la mis a jours d'une application.
	 * 
	 * @param applicationBean ApplicationBean
	 * @param id BigInteger
	 */
	public void updateApplication(Application applicationBean, BigInteger id) {
		applicationRepository.save(applicationBean);		
	}
	/**
	 * Methode pour la suppression d'une application.
	 * 
	*@param id identifiant de l'ApplicationBean
	 */
	public void deleteApplication(BigInteger id) {		
		applicationRepository.delete(id);
	}
}