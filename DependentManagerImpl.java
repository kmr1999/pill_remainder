package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
@Service
public class DependentManagerImpl implements DependentManager {
	@Autowired
	DependentRepository repository;
	@Override
	public void addDependent(Dependent d) {
		repository.save(d);
		
	}
	@Override
	public Dependent getDependent(String s1, String s2) {
		return repository.getDependent(s1, s2);
	}
	@Override
	public void updateDependent(Dependent d) {
		repository.update(d.getBloodgroup(), d.getContact(), d.getDob(), d.getEmail(), d.getHeight(), d.getName(), d.getPemail(), d.getRelationship(), d.getWeight(), d.getId());
		
	}

	
}
