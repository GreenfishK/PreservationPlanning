package com.preservationPlanning.controller;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.nio.file.Files;


@Service
public class XMLParser 
{
	/**
	 * 
	 * @param path The root folder for the xml document is WEB-INF/resources
	 * @return
	 */
	public Document getXMLDocument(String path)
	{
		Document doc = null;
		
		try
		{
			File fXmlFile = new File(getClass().getResource("/../resources/" + path).toURI());
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
		}
		catch  (Exception e) 
		{
			e.printStackTrace();
	    }
		return doc;
	}
	
}
