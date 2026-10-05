package ar.edu.unlp.oo1.ejercicio14;

import java.util.List;

public interface Policy {
	public JobDescription next(List<JobDescription> jobs);
}
