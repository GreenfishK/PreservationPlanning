package com.preservationPlanning.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class ExperimentData 
{
	@XmlAttribute (name="storedAt") private String storedAt;
	@XmlAttribute (name="volumeInKB") private int volumeInKB;
	//@XmlElement (name="CSVFile") @XmlElementWrapper(name="InputData") private List<CSVFile> inputData;
	//@XmlElement (name="PNGFile") @XmlElementWrapper(name="ResultData") private List<CSVFile> resultData;
	//@XmlElement (name="TransformationScripts") private List<File> scripts;
	
	public String getStoredAt() {
		return storedAt;
	}
	public void setStoredAt(String storedAt) {
		this.storedAt = storedAt;
	}
	public int getVolumeInKB() {
		return volumeInKB;
	}
	public void setVolumeInKB(int volumeInKB) {
		this.volumeInKB = volumeInKB;
	}
	/*public List<CSVFile> getInputData() {
		return inputData;
	}
	public void setInputData(List<CSVFile> inputData) {
		this.inputData = inputData;
	}
	public List<CSVFile> getResultData() {
		return resultData;
	}
	public void setResultData(List<CSVFile> resultData) {
		this.resultData = resultData;
	}
	public List<File> getScripts() {
		return scripts;
	}
	public void setScripts(List<File> scripts) {
		this.scripts = scripts;
	}*/
	
	
}

