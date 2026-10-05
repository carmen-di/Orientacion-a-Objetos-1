package ar.edu.unlp.oo1.ejercicio14;

import java.util.List;

public class FIFO implements Policy {
	
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
		if (jobs != null) {
			nextJob = jobs.get(0);
			return nextJob;
		}
		return null;
	}
}
