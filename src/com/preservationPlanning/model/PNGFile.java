package com.preservationPlanning.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class PNGFile
{
	@XmlAttribute(name="name") private String pngFile;

	public String getPngFile() {
		return pngFile;
	}

	public void setPngFile(String pngFile) {
		this.pngFile = pngFile;
	}
	
	
}
