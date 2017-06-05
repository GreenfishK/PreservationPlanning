package com.preservationPlanning.model;

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="DataManagementPlan")
@XmlAccessorType(XmlAccessType.FIELD)
public class DMPModel 
{
	@XmlElement(name="AdministrativeData")
	private AdministrativeData administrativeData;
	@XmlElement(name="ExperimentData")
	private ExperimentData experimentData;
	@XmlElement(name="IntelectualPropertyRights")
	private IntelectualPropertyRights intelectualPropertyRights;
	@XmlElement(name="Ethics")
	private Ethics ethics;
	@XmlElement(name="Backup") 
	@XmlElementWrapper(name="Backups")
	private List<Backup> backup;
	
	public AdministrativeData getAdministrativeData() {
		return administrativeData;
	}
	public void setAdministrativeData(AdministrativeData administrativeData) {
		this.administrativeData = administrativeData;
	}
	
	public ExperimentData getExperimentData() {
		return experimentData;
	}
	public void setExperimentData(ExperimentData experimentData) {
		this.experimentData = experimentData;
	}
	
	public IntelectualPropertyRights getIntelectualPropertyRights() {
		return intelectualPropertyRights;
	}
	public void setIntelectualPropertyRights(IntelectualPropertyRights intelectualPropertyRights) {
		this.intelectualPropertyRights = intelectualPropertyRights;
	}
	public Ethics getEthics() {
		return ethics;
	}
	public void setEthics(Ethics ethics) {
		this.ethics = ethics;
	}
	public List<Backup> getBackup() {
		return backup;
	}
	public void setBackup(List<Backup> backup) {
		this.backup = backup;
	}

	
	
	
	
}
