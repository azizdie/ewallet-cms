package com.ewallet.cms.appli.bean;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;

import com.ewallet.cms.enumeration.ApplStatus;

@Entity
public class Credit {
	@Id
	private BigInteger id;
	private Date allocationDate;
	private Date allocationDateGmt;
	private String applicationAmount;
	private String creditAmount;
	private String status = ApplStatus.PUBLISH.status();
	private String allocationManager = StringUtils.EMPTY;
	private String allocationCondition = StringUtils.EMPTY;
	private String allocationNote = StringUtils.EMPTY;
	private String allocationType = StringUtils.EMPTY;
	private String methode = StringUtils.EMPTY;
	private String allocationWarning;
	
	/**
	* Contructeur de class sans parametre.
	*/
	public Credit() {
		super();
	}
	
	/**
	 * 
	 * @param allocationDate allocation date for credit.
	 * @param allocationDateGmt allocation date gmt for credit.
	 * @param applicationAmount application amount for credit.
	 * @param creditAmount credit amount
	 * @param status credit status.
	 * @param allocationManager credit allocation manager.
	 * @param allocationCondition credit allocation condition.
	 * @param allocationNote credit allocation note.
	 * @param allocationType credit allocation type.
	 * @param methode credit methode.
	 * @param allocationWarning credit allocation warning.
	 */
	public Credit(Date allocationDate, Date allocationDateGmt, String applicationAmount, String creditAmount,
			String status, String allocationManager, String allocationCondition, String allocationNote,
			String allocationType, String methode, String allocationWarning) {
		super();
		this.allocationDate = allocationDate;
		this.allocationDateGmt = allocationDateGmt;
		this.applicationAmount = applicationAmount;
		this.creditAmount = creditAmount;
		this.status = status;
		this.allocationManager = allocationManager;
		this.allocationCondition = allocationCondition;
		this.allocationNote = allocationNote;
		this.allocationType = allocationType;
		this.methode = methode;
		this.allocationWarning = allocationWarning;
	}

	/**
	 * getter standard.
	 * 
	 * @return allocationDate de type Date .
	 */
	
	public Date getAllocationDate() {
		return allocationDate;
	}

	/**
	 * Setter standard.
	 * 
	 * @param allocationDate de type Date.
	 */
	public void setAllocationDate(Date allocationDate) {
		this.allocationDate = allocationDate;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return Date allocationDateGmt.
	 */
	public Date getAllocationDateGmt() {
		return allocationDateGmt;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param allocationDateGmt de type date.
	 */
	public void setAllocationDateGmt(Date allocationDateGmt) {
		this.allocationDateGmt = allocationDateGmt;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String applicationAmount.
	 */
	public String getApplicationAmount() {
		return applicationAmount;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param applicationAmount de type String.
	 */
	public void setApplicationAmount(String applicationAmount) {
		this.applicationAmount = applicationAmount;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String de creditAmount.
	 */
	public String getCreditAmount() {
		return creditAmount;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param creditAmount de type String.
	 */
	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String status.
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param status de type String.
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String de allocationManager.
	 */
	public String getAllocationManager() {
		return allocationManager;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param allocationManager de type String.
	 */
	public void setAllocationManager(String allocationManager) {
		this.allocationManager = allocationManager;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String de la variable allocationCondition.
	 */
	public String getAllocationCondition() {
		return allocationCondition;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param allocationCondition de type String.
	 */
	public void setAllocationCondition(String allocationCondition) {
		this.allocationCondition = allocationCondition;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String, valeur de allocationNote.
	 */
	public String getAllocationNote() {
		return allocationNote;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param allocationNote de type allocationNote.
	 */
	public void setAllocationNote(String allocationNote) {
		this.allocationNote = allocationNote;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String, valeur de allocationType.
	 */
	public String getAllocationType() {
		return allocationType;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param allocationType de type String.
	 */
	public void setAllocationType(String allocationType) {
		this.allocationType = allocationType;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String, valeur de methode.
	 */
	public String getMethode() {
		return methode;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param methode de String.
	 */
	public void setMethode(String methode) {
		this.methode = methode;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return String, valeur de allocationWarning.
	 */
	public String getAllocationWarning() {
		return allocationWarning;
	}
	
	/**
	 * Setter standard.
	 * 
	 * @param allocationWarning de type String.
	 */
	public void setAllocationWarning(String allocationWarning) {
		this.allocationWarning = allocationWarning;
	}
	
	/**
	 * getter standard.
	 * 
	 * @return id de type BigInteger.
	 */
	public BigInteger getId() {
		return id;
	}
}
