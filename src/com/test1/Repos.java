package com.test1;

public class Repos {
	private long repoCode;
	private String repoName;
	private String repoType;
	private String owner;
	private String branchCount;
	private String tags;
	private String security;
	private String advancedSecurity;
	private String creationDate;
	private String modifiedDate;

	public Repos() {

	}

	public Repos(long repoCode, String repoName, String repoType, String owner, String branchCount, String tags,
			String security, String advancedSecurity, String creationDate, String modifiedDate) {
		super();
		this.repoCode = repoCode;
		this.repoName = repoName;
		this.repoType = repoType;
		this.owner = owner;
		this.branchCount = branchCount;
		this.tags = tags;
		this.security = security;
		this.advancedSecurity = advancedSecurity;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public long getRepoCode() {
		return repoCode;
	}

	public void setRepoCode(long repoCode) {
		this.repoCode = repoCode;
	}

	public String getRepoName() {
		return repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}

	public String getRepoType() {
		return repoType;
	}

	public void setRepoType(String repoType) {
		this.repoType = repoType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBranchCount() {
		return branchCount;
	}

	public void setBranchCount(String branchCount) {
		this.branchCount = branchCount;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getAdvancedSecurity() {
		return advancedSecurity;
	}

	public void setAdvancedSecurity(String advancedSecurity) {
		this.advancedSecurity = advancedSecurity;
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

}
