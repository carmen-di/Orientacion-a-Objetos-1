package ar.edu.unlp.oo1.ejercicio14;

import java.util.List;

public class HighestPriority implements Policy {
	
	public JobDescription next(List<JobDescription> jobs) {
        JobDescription nextJob = null;
        nextJob = jobs.stream()
            .max((j1, j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
            .orElse(null);
        return nextJob;
    }

}
