package com.example.crudrestful.model;

public class Job {
	private String id;
    private String jobName;
//    private String position;
 
    public Job() {
 
    }
 
    public Job(String id, String jobName) {
        this.id = id;
        this.jobName = jobName;
//        this.position = position;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getJobName() {
        return jobName;
    }
 
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
