package com.cts.traineemanager.repo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cts.traineemanager.model.Trainee;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class TraineeRepositoyImplementation implements TraineeRepository{
	
	@Override
	public void add(Trainee t) {
		log.info("Adding trainee to  Repositry");
		tr.add(t);
	}

	@Override
	public void remove(Trainee t) {
		tr.remove(t);
		
	}
	public List<Trainee> getAllTrainees() {
		
		return tr;
	}

}
