package com.preservationPlanning.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Ethics 
{
	@XmlAttribute(name="personalData") private boolean personalData;
	@XmlAttribute(name="storedUntil") private Date storedUntil;
	@XmlAttribute(name="encryption") private String encryption;
	
	public boolean isPersonalData() {
		return personalData;
	}
	public void setPersonalData(boolean personalData) {
		this.personalData = personalData;
	}
	public Date getStoredUntil() {
		return storedUntil;
	}
	public void setStoredUntil(Date storedUntil) {
		this.storedUntil = storedUntil;
	}
	public String getEncryption() {
		return encryption;
	}
	public void setEncryption(String encryption) {
		this.encryption = encryption;
	}
	
	
}
