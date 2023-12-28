package com.test1;

public class Commits {
	private long commitId;
	private String committedBy;
	private String commitOn;
	private String branchName;
	private boolean prCreated;
	private String status;
	private String graph;
	private boolean filesChanged;
	private String details;
	private long updates;
	private String creationDate;
	private String updatedRemarks;
	private String lastUpdated;

	public Commits() {

	}

	public Commits(long commitId, String committedBy, String commitOn, String branchName, boolean prCreated,
			String status, String graph, boolean filesChanged, String details, long updates, String creationDate,
			String updatedRemarks, String lastUpdated) {
		super();
		this.commitId = commitId;
		this.committedBy = committedBy;
		this.commitOn = commitOn;
		this.branchName = branchName;
		this.prCreated = prCreated;
		this.status = status;
		this.graph = graph;
		this.filesChanged = filesChanged;
		this.details = details;
		this.updates = updates;
		this.creationDate = creationDate;
		this.updatedRemarks = updatedRemarks;
		this.lastUpdated = lastUpdated;
	}

	public long getCommitId() {
		return commitId;
	}

	public void setCommitId(long commitId) {
		this.commitId = commitId;
	}

	public String getCommittedBy() {
		return committedBy;
	}

	public void setCommittedBy(String committedBy) {
		this.committedBy = committedBy;
	}

	public String getCommitOn() {
		return commitOn;
	}

	public void setCommitOn(String commitOn) {
		this.commitOn = commitOn;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public boolean isPrCreated() {
		return prCreated;
	}

	public void setPrCreated(boolean prCreated) {
		this.prCreated = prCreated;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGraph() {
		return graph;
	}

	public void setGraph(String graph) {
		this.graph = graph;
	}

	public boolean isFilesChanged() {
		return filesChanged;
	}

	public void setFilesChanged(boolean filesChanged) {
		this.filesChanged = filesChanged;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public long getUpdates() {
		return updates;
	}

	public void setUpdates(long updates) {
		this.updates = updates;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getUpdatedRemarks() {
		return updatedRemarks;
	}

	public void setUpdatedRemarks(String updatedRemarks) {
		this.updatedRemarks = updatedRemarks;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
