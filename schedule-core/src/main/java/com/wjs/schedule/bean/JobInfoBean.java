package com.wjs.schedule.bean;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class JobInfoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 任务执行流水ID，用于回改状态等
	 */
	private Long jobLogId;
	
	
	/**
	 * 任务名称，用于与客户端寻找可执行器
	 */
	private String jobName;
	
	/**
	 * 日批任务执行日期参数
	 */
	private Integer txDate;
	
	/**
	 * 流式任务上一次执行开始参数
	 */
	private Long flowLastTime;
	
	/**
	 * 流式任务本次执行参数
	 */
	private Long flowCurrTime;
	
	/**
	 * 是否被强制触发任务。在手工调用时可以选择，默认为否
	 */
	private Boolean forceJob = false;
	
	
	/**
	 * 是否需要触发下次任务，默认是。在手工调用的时候，可以设置否
	 */
	private Boolean needTrigglerNext = true;
	
	/**
	 * 任务执行分片参数
	 */
	private String cuckooParallelJobArgs = "";
	
	
	

	public Long getJobLogId() {
		return jobLogId;
	}

	public void setJobLogId(Long jobLogId) {
		this.jobLogId = jobLogId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Integer getTxDate() {
		return txDate;
	}

	public void setTxDate(Integer txDate) {
		this.txDate = txDate;
	}

	public Long getFlowLastTime() {
		return flowLastTime;
	}

	public void setFlowLastTime(Long flowLastTime) {
		this.flowLastTime = flowLastTime;
	}

	public Long getFlowCurrTime() {
		return flowCurrTime;
	}

	public void setFlowCurrTime(Long flowCurrTime) {
		this.flowCurrTime = flowCurrTime;
	}
	
	
	public Boolean getForceJob() {
		return forceJob;
	}

	public void setForceJob(Boolean forceJob) {
		this.forceJob = forceJob;
	}

	public Boolean getNeedTrigglerNext() {
		return needTrigglerNext;
	}

	public void setNeedTrigglerNext(Boolean needTrigglerNext) {
		this.needTrigglerNext = needTrigglerNext;
	}
	

	public String getCuckooParallelJobArgs() {
		return cuckooParallelJobArgs;
	}

	public void setCuckooParallelJobArgs(String cuckooParallelJobArgs) {
		this.cuckooParallelJobArgs = cuckooParallelJobArgs;
	}

	@Override
	public String toString() {
		
		return ReflectionToStringBuilder.toString(this);
	}

}
