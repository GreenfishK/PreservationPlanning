package com.preservationPlanning.model;

import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DataManagementPlan")
@XmlAccessorType(XmlAccessType.FIELD)
public class DMPModel 
{
	@XmlElement(name="AdministrativeData")
	private List<AdministrativeData> administrativeData;
	@XmlElement(name="ExperimentData")
	private List<ExperimentData> experimentData;
	@XmlElement(name="IntelectualPropertyRights")
	private List<IntelectualPropertyRights> intelectualPropertyRights;
	@XmlElement(name="Ethics")
	private List<Ethics> ethics;
	@XmlElement(name="Backup")
	private List<Backup> backup;
	
	public List<AdministrativeData> getAdministrativeData() {
		return administrativeData;
	}
	public void setAdministrativeData(List<AdministrativeData> administrativeData) {
		this.administrativeData = administrativeData;
	}
	public List<ExperimentData> getExperimentData() {
		return experimentData;
	}
	public void setExperimentData(List<ExperimentData> experimentData) {
		this.experimentData = experimentData;
	}
	public List<IntelectualPropertyRights> getIntelectualPropertyRights() {
		return intelectualPropertyRights;
	}
	public void setIntelectualPropertyRights(List<IntelectualPropertyRights> intelectualPropertyRights) {
		this.intelectualPropertyRights = intelectualPropertyRights;
	}
	public List<Ethics> getEthics() {
		return ethics;
	}
	public void setEthics(List<Ethics> ethics) {
		this.ethics = ethics;
	}
	public List<Backup> getBackup() {
		return backup;
	}
	public void setBackup(List<Backup> backup) {
		this.backup = backup;
	}

	
	
	
	
}
