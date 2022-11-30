package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
@Service
public class HistoryManagerImpl implements HistoryManager {
	@Autowired
	HistoryRepository repository;
	@Override
	public void addHistory(History h) {
		repository.save(h);
		
	}
	@Override
	public List<History> getHistory(int did) {
		// TODO Auto-generated method stub
		return repository.getHistory(did);
	}
	
	

}
