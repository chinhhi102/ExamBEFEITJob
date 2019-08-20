package com.example.crudrestful.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.crudrestful.model.Job;
import org.springframework.stereotype.Repository;

@Repository
public class JobDAO {
	private static final Map<String, Job> jobMap = new HashMap<String, Job>();
	 
    static {
        initEmps();
    }
 
    private static void initEmps() {
    	Job job1 = new Job("E01", "Smith");
    	Job job2 = new Job("E02", "Allen");
    	Job job3 = new Job("E03", "Jones");
 
    	jobMap.put(job1.getId(), job1);
    	jobMap.put(job2.getId(), job2);
    	jobMap.put(job3.getId(), job3);
    }
 
    public Job getJob(String jobID) {
        return jobMap.get(jobID);
    }
 
    public Job addJob(Job job) {
    	jobMap.put(job.getId(), job);
        return job;
    }
 
    public Job updateJob(Job job) {
    	jobMap.put(job.getId(), job);
        return job;
    }
 
    public void deleteJob(String job) {
    	jobMap.remove(job);
    }
 
    public List<Job> getAllEmployees() {
        Collection<Job> c = jobMap.values();
        List<Job> list = new ArrayList<Job>();
        list.addAll(c);
        return list;
    }
}
