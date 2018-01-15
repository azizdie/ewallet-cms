package com.ewallet.cms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewallet.cms.beans.Clients;
import com.ewallet.cms.repository.ClientsRepository;

/**
 * class pour la gestion des services des Clients
 * 
 * @author Diedhiou
 *
 */
@Service
public class ClientsService {

	@Autowired
	private ClientsRepository clientsRepository;
			
	/**
	 * fonction qui retourne la liste des Clients.
	 * 
	 * @return List<Clients> liste des Clients.
	 */
	public List<Clients> getAllClients(String id){
				
		List<Clients>  clientsList = new ArrayList<>();
		clientsRepository.findAll().forEach(clientsList::add);
		
		return clientsList;
	}
	
	/**
	 * Methode pour retourner les informations d'un Client selon son id
	 * 
	 * @param id identifiant du Client
	 * @return les informations du Client
	 */
	public Clients getClients(String id){
		return clientsRepository.findOne(id);
	}

	/**
	 * Methode pour la creation du Client.
	 * 
	 * @param profilsBean Client
	 */
	public void addClients(Clients clientsBean) {		
		clientsRepository.save(clientsBean);
	}

	/**
	 * Methode pour la mis a jours d'un Client.
	 * 
	 * @param clientsBean Clients
	 */
	public void updateClients(Clients clientsBean) {
		clientsRepository.save(clientsBean);		
	}
	/**
	 * Methode pour la suppression du clients.
	 * 
	*@param id identifiant du clients
	 */
	public void deleteClients(String id) {		
		clientsRepository.delete(id);
	}
}
