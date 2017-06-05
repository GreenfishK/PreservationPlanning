package com.preservationPlanning.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Backup
{
	@XmlAttribute(name="type") private String type;
	@XmlAttribute(name="responsiblePerson") private String responsiblePerson;
	@XmlAttribute(name="link") private String link;
	@XmlAttribute(name="nextBackup") private String nextBackup;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getResponsiblePerson() {
		return responsiblePerson;
	}
	public void setResponsiblePerson(String responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getNextBackup() {
		return nextBackup;
	}
	public void setNextBackup(String nextBackup) {
		this.nextBackup = nextBackup;
	}
	
	
}
