package com.test1;

public class Releases {
	private long releaseId;
	private String releaseName;
	private String prsCreated;
	private String workItems;
	private String filters;
	private String createdBy;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public Releases() {

	}

	public Releases(long releaseId, String releaseName, String prsCreated, String workItems, String filters,
			String createdBy, String creationDate, String modifiedDate, String entityState) {
		super();
		this.releaseId = releaseId;
		this.releaseName = releaseName;
		this.prsCreated = prsCreated;
		this.workItems = workItems;
		this.filters = filters;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getReleaseId() {
		return releaseId;
	}

	public void setReleaseId(long releaseId) {
		this.releaseId = releaseId;
	}

	public String getReleaseName() {
		return releaseName;
	}

	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
	}

	public String getPrsCreated() {
		return prsCreated;
	}

	public void setPrsCreated(String prsCreated) {
		this.prsCreated = prsCreated;
	}

	public String getWorkItems() {
		return workItems;
	}

	public void setWorkItems(String workItems) {
		this.workItems = workItems;
	}

	public String getFilters() {
		return filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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
