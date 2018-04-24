package com.ewallet.cms.appli.bean;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;

import com.ewallet.cms.enumeration.ApplStatus;

/**
 * Class pour former le bean des Applications.
 * 
 * @author Diedhiou
 *
 */

@Entity
public class Application {
	@Id
	private BigInteger id;
	private String applicationNote  = StringUtils.EMPTY;
	private Date creationDate;
	private Date creationDateGmt;
	private Date applicationDate;
	private Date applicationnDateGmt;
	private String content ;
	private String amount;
	private String status = ApplStatus.PUBLISH.status();
	private String address = StringUtils.EMPTY;
	private String city = StringUtils.EMPTY;
	private String country = StringUtils.EMPTY;
	private String applicationType = StringUtils.EMPTY;
	private String methode = StringUtils.EMPTY;
	private String device;
	
	/**
	* Contructeur de class sans parametre.
	*/
	public Application() {
		super();
	}
	
	/**
	 * 
	 * @param applicationNote application note.
	 * @param creationDate creation Date application.
	 * @param creationDateGmt creation date gmt application.
	 * @param applicationDate application date application.
	 * @param applicationnDateGmt application date gmt application.
	 * @param content content application.
	 * @param amount amount application.
	 * @param status status application.
	 * @param address addresse application.
	 * @param city of the application.
	 * @param country of the application.
	 * @param applicationType application. type.
	 * @param methode of the application.
	 * @param device of the application.
	 */
	public Application(String applicationNote, Date creationDate, Date creationDateGmt, Date applicationDate,
			Date applicationnDateGmt, String content, String amount, String status, String address, String city,
			String country, String applicationType, String methode, String device) {
		super();
		this.applicationNote = applicationNote;
		this.creationDate = creationDate;
		this.creationDateGmt = creationDateGmt;
		this.applicationDate = applicationDate;
		this.applicationnDateGmt = applicationnDateGmt;
		this.content = content;
		this.amount = amount;
		this.status = status;
		this.address = address;
		this.city = city;
		this.country = country;
		this.applicationType = applicationType;
		this.methode = methode;
		this.device = device;
	}

	/**
	 * getter standard.
	 * 
	 * @return String application note.
	 */
	public String getApplicationNote() {
		return applicationNote;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String application Note.
	 */
	public void setApplicationNote(String applicationNote) {
		this.applicationNote = applicationNote;
	}
	/**
	 * getter standard.
	 * 
	 * @return Date creation date.
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Setter standard.
	 * 
	 * @param creationDate type Date.
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return Date creation date gmt.
	 */
	public Date getCreationDateGmt() {
		return creationDateGmt;
	}

	/**
	 * Setter standard.
	 * 
	 * @param creationDateGmt type of date.
	 */
	public void setCreationDateGmt(Date creationDateGmt) {
		this.creationDateGmt = creationDateGmt;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return Date application date.
	 */
	public Date getApplicationDate() {
		return applicationDate;
	}

	/**
	 * Setter standard.
	 * 
	 * @param applicationDate type of date.
	 */
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	/**
	 * getter standard.
	 * 
	 * @return Date application date gmt.
	 */
	public Date getApplicationnDateGmt() {
		return applicationnDateGmt;
	}

	/**
	 * Setter standard.
	 * 
	 * @param applicationDateGmt type of date.
	 */
	public void setApplicationnDateGmt(Date applicationnDateGmt) {
		this.applicationnDateGmt = applicationnDateGmt;
	}

	/**
	 * getter standard.
	 * 
	 * @return String content.
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Setter standard.
	 * 
	 * @param content type of String.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * getter standard.
	 * 
	 * @return amount type of String.
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * Setter standard.
	 * 
	 * @param amount type of String.
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * getter standard.
	 * 
	 * @return String status of application.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Setter standard.
	 * 
	 * @param status String.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * getter standard.
	 * 
	 * @return address String.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Setter standard.
	 * 
	 * @param String address.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return city String.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter standard.
	 * 
	 * @param city type of String.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * getter standard.
	 * 
	 * @return String country.
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Setter standard.
	 * 
	 * @param country type of String.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * getter standard.
	 * 
	 * @return String applicationType.
	 */
	public String getApplicationType() {
		return applicationType;
	}

	/**
	 * Setter standard.
	 * 
	 * @param applicationType type of String.
	 */
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	/**
	 * getter standard.
	 * 
	 * @return String methode.
	 */
	public String getMethode() {
		return methode;
	}

	/**
	 * Setter standard.
	 * 
	 * @param methode type of String.
	 */
	public void setMethode(String methode) {
		this.methode = methode;
	}

	/**
	 * getter standard.
	 * 
	 * @return String device.
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * Setter standard.
	 * 
	 * @param device type of String.
	 */
	public void setDevice(String device) {
		this.device = device;
	}

	/**
	 * getter standard.
	 * 
	 * @return BigInteger id.
	 */
	public BigInteger getId() {
		return id;
	}
}
