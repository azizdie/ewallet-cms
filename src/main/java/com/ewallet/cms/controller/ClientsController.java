package com.ewallet.cms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class controller pour la gestion des clients.
 * 
 * @author Diedhiou
 *
 */
@RestController
public class ClientsController {
	/**
	 * Methode qui retourne les informations d'un client.
	 * @return
	 */
	@RequestMapping("/clients")
	public String clients(){
		return "Je suis le client ID: C0002017";
	}
}
