package com.ewallet.cms.appli.bean;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;

import com.ewallet.cms.enumeration.ApplStatus;
import com.ewallet.cms.enumeration.Sexe;

/**
 * Class pour former le bean des Appliants.
 * 
 * @author Diedhiou
 *
 */

@Entity
public class Appliant {
	@Id
	private BigInteger id;
	private String firstname = StringUtils.EMPTY;
	private String lastname = StringUtils.EMPTY;
	private Date birthDate ;
	private Date creationDate;
	private Date creationDateGmt;
	private String creationContent;
	private String sexe = Sexe.Inconnu.genre();
	private String job;
	private String appliantStatus = ApplStatus.PUBLISH.status();
	private String address = StringUtils.EMPTY;
	private String city = StringUtils.EMPTY;
	private String country  = StringUtils.EMPTY;
	private String cellPhone = StringUtils.EMPTY;
	private String phone = StringUtils.EMPTY;
	private String postCode;
	private String email ;
	 
	/**
	* Contructeur de class sans parametre.
	*/
	public Appliant() {
		super();
	}

/**
 * 
 * @param firstname appliant first name
 * @param lastname appliant last naem
 * @param birthDate appliant birthday
 * @param creationDate appliant creation date
 * @param creationDateGmt appliant creation date GMT
 * @param creationContent appliant creation content
 * @param sexe appliant sexe
 * @param job appliant job
 * @param appliantStatus appliant Statu
 * @param address appliant adresse
 * @param city appliant City
 * @param country  appliant country
 * @param cellPhone appliant cell phone
 * @param phone appliant phone
 * @param postCode appliant postal code
 * @param email appliant email adresse
 */
	public Appliant(String firstname, String lastname, Date birthDate, Date creationDate, Date creationDateGmt,
			String creationContent, String sexe, String job, String appliantStatus, String address, String city,
			String country, String cellPhone, String phone, String postCode, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthDate;
		this.creationDate = creationDate;
		this.creationDateGmt = creationDateGmt;
		this.creationContent = creationContent;
		this.sexe = sexe;
		this.job = job;
		this.appliantStatus = appliantStatus;
		this.address = address;
		this.city = city;
		this.country = country;
		this.cellPhone = cellPhone;
		this.phone = phone;
		this.postCode = postCode;
		this.email = email;
	}

	/**
	 * getter standard.
	 * 
	 * @return BigInteger appliant id .
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * Setter standard.
	 * 
	 * @param BigInteger appliant id.
	 */
	public void setId(BigInteger id) {
		this.id = id;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant first name.
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant first name.
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant last name.
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant last name.
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * getter standard.
	 * 
	 * @return Date appliant birth date.
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * Setter standard.
	 * 
	 * @param Date appliant birth date.
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * getter standard.
	 * 
	 * @return Date appliant creation date.
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Setter standard.
	 * 
	 * @param Date appliant creation date.
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * getter standard.
	 * 
	 * @return Date appliant creation date gmt.
	 */
	public Date getCreationDateGmt() {
		return creationDateGmt;
	}

	/**
	 * Setter standard.
	 * 
	 * @param Date appliant creation date gmt.
	 */
	public void setCreationDateGmt(Date creationDateGmt) {
		this.creationDateGmt = creationDateGmt;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant creation content.
	 */
	public String getCreationContent() {
		return creationContent;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant creation content.
	 */
	public void setCreationContent(String creationContent) {
		this.creationContent = creationContent;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant sexe.
	 */
	public String getSexe() {
		return sexe;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant sexe.
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant job.
	 */
	public String getJob() {
		return job;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant job.
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant status.
	 */
	public String getAppliantStatus() {
		return appliantStatus;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant status.
	 */
	public void setAppliantStatus(String appliantStatus) {
		this.appliantStatus = appliantStatus;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant addresse.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant addresse.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant city.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant City.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant country.
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant country.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * getter standard.
	 * 
	 * @return String String appliant cell phone.
	 */
	public String getCellPhone() {
		return cellPhone;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant cell phone.
	 */
	public void setCellPhone(String cell_phone) {
		this.cellPhone = cell_phone;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant phon number.
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant phone number.
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant postal code .
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant postal code.
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * getter standard.
	 * 
	 * @return String appliant email addresse.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String appliant email addresse.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	 
	 
}
