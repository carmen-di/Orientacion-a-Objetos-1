package ar.edu.unlp.oo1.ejercicio14;

import java.util.List;

public class LIFO implements Policy {
	
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
		if (jobs != null) {
			nextJob = jobs.get(jobs.size() - 1);
			return nextJob;
		}
		return null;
	}
}
