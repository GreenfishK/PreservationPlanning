package com.preservationPlanning.controller;

import java.io.File;
import java.net.URISyntaxException;

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
		
		//Administrative data
		try 
		{
			JAXBContext jaxbContext = JAXBContext.newInstance(DMPModel.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			DMPModel dmpModel = (DMPModel) jaxbUnmarshaller.unmarshal(new File(getClass().getResource("/../resources/dmp-document.xml").toURI()));
			
			String version = "Version: " +  dmpModel.getAdministrativeData().get(0).getVersion();
			String date = "Date: " +  dmpModel.getAdministrativeData().get(0).getDate();
			String contactPersons = "Contact persons: ";
			String authors = "Authors: ";
			String backups = "";
			
			for(int i = 0; i<dmpModel.getAdministrativeData().get(0).getContactPersons().size(); i++)
				contactPersons += dmpModel.getAdministrativeData().get(0).getContactPersons().get(i).getName() + ", ";
			contactPersons = contactPersons.substring(0, contactPersons.length() - 2);
			
			for(int i = 0; i<dmpModel.getAdministrativeData().get(0).getAuthors().size(); i++)
				authors += dmpModel.getAdministrativeData().get(0).getAuthors().get(i).getName() + ", ";
			authors = authors.substring(0, authors.length() - 2);
			
			//ethics = ""+ dmpModel.getEthics().get(0).isPersonalData(); //+ ", " + dmpModel.getEthics().get(0).getStoredUntil() + ", " + dmpModel.getEthics().get(0).getEncryption();
			
			model.addAttribute("version", version);
			model.addAttribute("date", date);
			model.addAttribute("contactPersons", contactPersons);
			model.addAttribute("authors", authors);
			//model.addAttribute("ethics", ethics);
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
