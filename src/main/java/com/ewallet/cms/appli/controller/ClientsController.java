package com.ewallet.cms.appli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ewallet.cms.appli.bean.Clients;
import com.ewallet.cms.appli.service.ClientsService;

/**
 * Class controller pour la gestion des clients.
 * 
 * @author Diedhiou
 *
 */
@RestController
public class ClientsController {
	@Autowired
	private ClientsService clientsService;
	/**
	 * Methode qui retourne les informations d'un ou des clients.
	 * 
	 * @return List<Clients>
	 */
	@RequestMapping("/clients")
	public List<Clients> getAllClients(){
		return clientsService.getAllClients();
	}
	/**
	 * Methode pour retourner les informations d'un client selon son id
	 * 
	 * @param id identifiant du client
	 * 
	 * @return les informations du client
	 */
	@RequestMapping("/clients/{id}")
	public Clients getClient(@PathVariable String id){
		return clientsService.getClients(id);
	}
	
	/**
	 * Methode pour la creation d'un client.
	 * 
	 * @param clientBean
	 */
	@RequestMapping(method=RequestMethod.POST, value="/clients")
	public void addClient(@RequestBody Clients clientBean){
		clientsService.addClients(clientBean);
	}
	
	/**
	 * Methode pour la mis a jours d'un client.
	 * 
	 * @param clientBean type ClientBean
	 * 
	 * @param id identifiant du client.
	 */
	@RequestMapping(method=RequestMethod.PUT, value="/clients/{id}")
	public void updateClient(@RequestBody Clients clientBean, @PathVariable String id){
		clientsService.updateClients(clientBean);
	}
	

	/**
	 * Methode pour la suppression d'un client.
	 * 
	*@param id identifiant du client.
	 */
	@RequestMapping(method=RequestMethod.DELETE, value="/clients/{id}")
	public void deleteClient(@PathVariable String id){
		clientsService.deleteClients(id);
	}
}
