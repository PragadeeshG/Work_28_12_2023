package com.test1;

public class Pipeline {
	private Integer runId;
	private String pipelineBranch;
	private Integer stages;
	private String currStage;
	private String status;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public Pipeline() {

	}

	public Pipeline(Integer runId, String pipelineBranch, Integer stages, String currStage, String status,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.runId = runId;
		this.pipelineBranch = pipelineBranch;
		this.stages = stages;
		this.currStage = currStage;
		this.status = status;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRunId() {
		return runId;
	}

	public void setRunId(Integer runId) {
		this.runId = runId;
	}

	public String getPipelineBranch() {
		return pipelineBranch;
	}

	public void setPipelineBranch(String pipelineBranch) {
		this.pipelineBranch = pipelineBranch;
	}

	public Integer getStages() {
		return stages;
	}

	public void setStages(Integer stages) {
		this.stages = stages;
	}

	public String getCurrStage() {
		return currStage;
	}

	public void setCurrStage(String currStage) {
		this.currStage = currStage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
