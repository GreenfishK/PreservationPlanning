package com.preservationPlanning.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.*;

import org.springframework.web.bind.annotation.ModelAttribute;


@XmlAccessorType(XmlAccessType.FIELD)
public class AdministrativeData 
{
	@XmlElement (name="Author") @XmlElementWrapper(name="Authors")  private List<Author> authors;
	@XmlElement(name="ContactPerson") @XmlElementWrapper(name="ContactPersons") private List<ContactPerson> contactPersons;
	@XmlAttribute(name="version") private String version;
	@XmlAttribute(name="date") private Date date;
	
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public List<ContactPerson> getContactPersons() {
		return contactPersons;
	}
	public void setContactPersons(List<ContactPerson> contactPersons) {
		this.contactPersons = contactPersons;
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
}
