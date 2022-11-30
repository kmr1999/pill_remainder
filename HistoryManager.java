package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public interface HistoryManager {

	void addHistory(History h);
	
	List<History> getHistory(int i);
}
