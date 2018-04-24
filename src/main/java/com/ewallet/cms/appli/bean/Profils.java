package com.ewallet.cms.appli.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Class pour former le bean des Profils.
 * 
 * @author Diedhiou
 *
 */
@Entity
public class Profils {
	
	@Id
	private String id;
	private String nom;
	private String description;
	@ManyToOne
	private Administrateurs administrateurs;
	
	
	/**
	 * Contructeur de class sans parametre.
	 */
	public Profils() {
		super();
	}
	
	/**
	 * Contructeur de classe avec parametres.
	 * 
	 * @param id du profil.
	  * @param nom du profil.
	 * @param description du profil.
	 */
	public Profils(String id,  String nom, String description, String adminId) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;		
		this.administrateurs = new Administrateurs(adminId, "", "", "");
	}
	/**
	 * getter standard.
	 * 
	 * @return String id du profil.
	 */
	public String getId() {
		return id;
	}
	
	
	/**
	 * getter standard.
	 * 
	 * @return String nom du profil
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String description du profil
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * getter standard.
	 * 
	 * @return Administrateurs administrateurs du profil
	 */
	public Administrateurs getAdministrateurs() {
		return administrateurs;
	}

	
	/**
	 * Setter standard.
	 * 
	 * @param id du profil
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	/**
	 * Setter standard.
	 * 
	 * @param nom du profil
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param description du profil
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param administrateurs du profil
	 */
	public void setAdministrateurs(Administrateurs administrateurs) {
		this.administrateurs = administrateurs;
	}
}
