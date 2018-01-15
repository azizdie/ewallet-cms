package com.ewallet.cms.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class pour former le bean des clients.
 * 
 * @author Diedhiou
 *
 */
@Entity
public class Clients {
	@Id
	private String id;
	private String prenom;
	private String nom;
	private String description;
	
	
	/**
	 * Contructeur de class sans parametre.
	 */
	public Clients() {
		super();
	}
	
	/**
	 * Contructeur de classe avec parametres.
	 * 
	 * @param id du client.
	 * @param prenom du client.
	  * @param nom du client.
	 * @param description du client.
	 */
	public Clients(String id, String prenom, String nom, String description) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.description = description;
	}
	/**
	 * getter standard.
	 * 
	 * @return String id du client.
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String prenom du client.
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * getter standard.
	 * 
	 * @return String nom du client
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String description du client
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param id du client
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param prenom du client.
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * Setter standard.
	 * 
	 * @param nom du client.
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param description du client.
	 */
	public void setDescription(String description) {
		this.description = description;
	}	
}
