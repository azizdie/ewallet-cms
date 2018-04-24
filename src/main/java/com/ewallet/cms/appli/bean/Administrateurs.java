package com.ewallet.cms.appli.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class pour former le bean des administrateurs.
 * 
 * @author Diedhiou
 *
 */
@Entity
public class Administrateurs {
	
	@Id
	private String id;
	private String prenom;
	private String nom;
	private String description;
	
	
	/**
	 * Contructeur de class sans parametre.
	 */
	public Administrateurs() {
		super();
	}
	
	/**
	 * Contructeur de classe avec parametres.
	 * 
	 * @param id de l'administrateur.
	 * @param prenom de l'administrateur.
	  * @param nom de l'administrateur.
	 * @param description de l'administrateur.
	 */
	public Administrateurs(String id, String prenom, String nom, String description) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.description = description;
	}
	/**
	 * getter standard.
	 * 
	 * @return String id de l'administrateur.
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String prenom de l'administrateur.
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * getter standard.
	 * 
	 * @return String nom de l'administrateur
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String description de l'administrateur
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param id de l'administrateur
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param prenom de l'administrateur
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * Setter standard.
	 * 
	 * @param nom de l'administrateur
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param description de l'administrateur
	 */
	public void setDescription(String description) {
		this.description = description;
	}	
}
