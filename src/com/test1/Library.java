package com.test1;

public class Library {
	private String libraryName;
	private String variableGroup;
	private String variableName;
	private String value;
	private String secureFile;
	private Integer securityCode;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public Library() {

	}

	public Library(String libraryName, String variableGroup, String variableName, String value, String secureFile,
			Integer securityCode, String creationDate, String modifiedDate, String entityState) {
		super();
		this.libraryName = libraryName;
		this.variableGroup = variableGroup;
		this.variableName = variableName;
		this.value = value;
		this.secureFile = secureFile;
		this.securityCode = securityCode;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getVariableGroup() {
		return variableGroup;
	}

	public void setVariableGroup(String variableGroup) {
		this.variableGroup = variableGroup;
	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSecureFile() {
		return secureFile;
	}

	public void setSecureFile(String secureFile) {
		this.secureFile = secureFile;
	}

	public Integer getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(Integer securityCode) {
		this.securityCode = securityCode;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
