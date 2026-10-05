package ar.edu.unlp.oo1.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Policy policy;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public Policy getPolicy() {
        return this.policy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public JobDescription next() {
    	JobDescription job = (this.policy.next(jobs));
		this.unschedule(job);
		return job;
    }

}
