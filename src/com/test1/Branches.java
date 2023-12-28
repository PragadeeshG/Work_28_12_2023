package com.test1;

public class Branches {
	private long brnachId;
	private String branchName;
	private Integer files;
	private String mainBranch;
	private String featureBranch;
	private boolean releaseBranch;
	private String stale;
	private String author;
	private String creationDate;
	private String behind;
	private String ahead;

	public Branches() {

	}

	public Branches(long brnachId, String branchName, Integer files, String mainBranch, String featureBranch,
			boolean releaseBranch, String stale, String author, String creationDate, String behind, String ahead) {
		super();
		this.brnachId = brnachId;
		this.branchName = branchName;
		this.files = files;
		this.mainBranch = mainBranch;
		this.featureBranch = featureBranch;
		this.releaseBranch = releaseBranch;
		this.stale = stale;
		this.author = author;
		this.creationDate = creationDate;
		this.behind = behind;
		this.ahead = ahead;
	}

	public long getBrnachId() {
		return brnachId;
	}

	public void setBrnachId(long brnachId) {
		this.brnachId = brnachId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Integer getFiles() {
		return files;
	}

	public void setFiles(Integer files) {
		this.files = files;
	}

	public String getMainBranch() {
		return mainBranch;
	}

	public void setMainBranch(String mainBranch) {
		this.mainBranch = mainBranch;
	}

	public String getFeatureBranch() {
		return featureBranch;
	}

	public void setFeatureBranch(String featureBranch) {
		this.featureBranch = featureBranch;
	}

	public boolean isReleaseBranch() {
		return releaseBranch;
	}

	public void setReleaseBranch(boolean releaseBranch) {
		this.releaseBranch = releaseBranch;
	}

	public String getStale() {
		return stale;
	}

	public void setStale(String stale) {
		this.stale = stale;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getBehind() {
		return behind;
	}

	public void setBehind(String behind) {
		this.behind = behind;
	}

	public String getAhead() {
		return ahead;
	}

	public void setAhead(String ahead) {
		this.ahead = ahead;
	}

}
