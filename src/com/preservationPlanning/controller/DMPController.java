package com.preservationPlanning.controller;

import java.io.File;
import java.net.URISyntaxException;
import java.text.Format;
import java.text.SimpleDateFormat;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.Document;

import com.preservationPlanning.model.DMPModel;

@Controller
@RequestMapping("/welcome")
public class DMPController
{
	@Autowired
	XMLParser parser;
	
	@RequestMapping(method = RequestMethod.GET)
	public String dmpData(ModelMap model) 
	{
		/*
		 * Normally this will be a value object in form of java bean that will contain the data to be displayed on our view.
		 * Here we are simply passing a string.
		 */
		Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//Administrative data
		try 
		{
			JAXBContext jaxbContext = JAXBContext.newInstance(DMPModel.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			DMPModel dmpModel = (DMPModel) jaxbUnmarshaller.unmarshal(new File(getClass().getResource("/../resources/dmp-document.xml").toURI()));
			
			String version = dmpModel.getAdministrativeData().getVersion();
			String date =  ""+dmpModel.getAdministrativeData().getDate();
			String contactPersons = "Contact persons: ";
			String authors = "Authors: ";
			String personalData = "";
			String storedUntil = "";
			String encryption = "";
			String license ="";
			String licenseLink ="";
			String backups ="";
			String storedAt ="";
			String volumeInKB ="";
	
			
			for(int i = 0; i<dmpModel.getAdministrativeData().getContactPersons().size(); i++)
				contactPersons += dmpModel.getAdministrativeData().getContactPersons().get(i).getName() + ", ";
			contactPersons = contactPersons.substring(0, contactPersons.length() - 2);
			
			for(int i = 0; i<dmpModel.getAdministrativeData().getAuthors().size(); i++)
				authors += dmpModel.getAdministrativeData().getAuthors().get(i).getName() + ", ";
			authors = authors.substring(0, authors.length() - 2);
			
			personalData =  ""+dmpModel.getEthics().isPersonalData();
			storedUntil =  ""+dmpModel.getEthics().getStoredUntil();
			encryption = dmpModel.getEthics().getEncryption();
			
			license = dmpModel.getIntelectualPropertyRights().getName();
			licenseLink = dmpModel.getIntelectualPropertyRights().getLink();
			
			for(int i = 0; i < dmpModel.getBackup().size(); i++)
				backups += "<tr>" + "<td>" +Integer.toString(i+1) + "</td>" + "<td>" +dmpModel.getBackup().get(i).getType() + "</td>"  
			+ "<td>" +dmpModel.getBackup().get(i).getResponsiblePerson() + "</td>" 
			+ "<td>" +dmpModel.getBackup().get(i).getLink() + "</td>" 
			+ "<td>" +dmpModel.getBackup().get(i).getNextBackup()+ "</td>" 
						+"</tr>" ;
			
			storedAt = dmpModel.getExperimentData().getStoredAt();
			volumeInKB = Integer.toString(dmpModel.getExperimentData().getVolumeInKB());
			
			model.addAttribute("version", version);
			model.addAttribute("date", date);
			model.addAttribute("contactPersons", contactPersons);
			model.addAttribute("authors", authors);
			model.addAttribute("personalData", personalData);
			model.addAttribute("storedUntil", storedUntil);
			model.addAttribute("encryption", encryption);
			model.addAttribute("license", license);
			model.addAttribute("licenseLink", licenseLink);
			model.addAttribute("backups", backups);
			model.addAttribute("storedAt", storedAt);
			model.addAttribute("volumeInKB", volumeInKB);
		} 
		catch (JAXBException e) 
		{

			e.printStackTrace();
		} 
		catch (URISyntaxException e) 
		{
			e.printStackTrace();
		}
		
		//Experiment data

		
		
		return "welcome"; 
	}
	
}
