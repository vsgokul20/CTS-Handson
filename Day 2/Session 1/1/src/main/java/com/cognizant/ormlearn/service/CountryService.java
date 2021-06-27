package com.cognizant.ormlearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;



@Service
public class CountryService {
	
	@Autowired
	private CountryRepository repository;
	
	@Transactional 
	public List<Country> findByNameContaining(String str){
		List<Country> list=repository.findByNameContaining(str);
		return list;
	}
	
	@Transactional 
	public List<Country> findByNameContainingOrderByAsc(String str){
		List<Country> list=repository.findByNameContainingOrderByNameAsc(str);
		return list;
	}
	
	@Transactional
	public List<Country> findByNameStartingWith(String str){
		return repository.findByNameStartingWith(str);
	}

	
	
}
