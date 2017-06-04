package com.preservationPlanning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;

@Controller
@RequestMapping("/welcome")
public class StartUpController
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
		
		Document doc = parser.getXMLDocument("input/dmp-document.xml");
		String root = "Root element :" + doc.getDocumentElement().getNodeName();
		String author1 = "Author 1: " + doc.getElementsByTagName("Author").item(0).getAttributes().getNamedItem("name").getNodeValue();
		String author2 = "Author 2: " + doc.getElementsByTagName("Author").item(1).getAttributes().getNamedItem("name").getNodeValue();
		
		model.addAttribute("root", root);
		model.addAttribute("author1", author1);
		model.addAttribute("author2", author2);
		
		return "welcome"; 
	}
	
}
