package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface HistoryRepository extends JpaRepository<History,Integer> 
{
	
	
	@Query("from History h where h.did=:did")
	List<History> getHistory(@Param("did") int did);

}
