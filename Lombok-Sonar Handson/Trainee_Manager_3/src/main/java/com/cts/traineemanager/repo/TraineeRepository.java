package com.cts.traineemanager.repo;

import java.util.ArrayList;
import java.util.List;

import com.cts.traineemanager.model.Trainee;

public interface TraineeRepository {
	static final List<Trainee> tr = new ArrayList<>();
	public void add(Trainee trainee);
	public void remove(Trainee trainee);
	public List<Trainee> getAllTrainees();
}
