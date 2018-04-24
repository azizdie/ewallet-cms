package com.ewallet.cms.appli.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ewallet.cms.appli.bean.Application;
import com.ewallet.cms.appli.service.ApplicationService;

/**
 * Class controller pour la gestion des applications.
 * 
 * @author Diedhiou Abdou aziz
 *
 */
@RestController
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;
	
	/**
	 * Methode qui retourne les informations d'un ou des applications.
	 * 
	 * @return List<ApplicationBean>
	 */
	@RequestMapping("/applications")
	public List<Application> getAllApplications(){
		return applicationService.getAllApplications();
	}
	
	/**
	 * Methode pour retourner les informations d'une application selon son id
	 * 
	 * @param id identifiant de l'application
	 * 
	 * @return ApplicationBean les informations de l'application
	 */
	@RequestMapping("/applications/{id}")
	public Application getApplication(@PathVariable BigInteger id){
		return applicationService.getApplication(id);
	}
	
	/**
	 * Methode pour la creation d'une application.
	 * 
	 * @param applicationBean
	 */
	@RequestMapping(method=RequestMethod.POST, value="/applications")
	public void addApplication(@RequestBody Application applicationBean){
		applicationService.addApplication(applicationBean);
	}
	
	/**
	 * Methode pour la mis a jours d'une application.
	 * 
	 * @param applicationBean ApplicationBean
	 * 
	 * @param applicationBean id identifiant de ApplicationBean.
	 */
	@RequestMapping(method=RequestMethod.PUT, value="/applications/{id}")
	public void updateApplication(@RequestBody Application applicationBean, @PathVariable BigInteger id){
		applicationService.updateApplication(applicationBean, id);
	}
	

	/**
	 * Methode pour la suppression d'une application.
	 * 
	*@param id identifiant de l'applications
	 */
	@RequestMapping(method=RequestMethod.DELETE, value="/applications/{id}")
	public void deleteApplication(@PathVariable BigInteger id){
		applicationService.deleteApplication(id);
	}
}
