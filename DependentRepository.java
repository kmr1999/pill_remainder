package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DependentRepository extends JpaRepository<Dependent,Integer> 
{
	
	@Query("from Dependent d where d.pemail=:pemail and d.relationship=:relationship")
	Dependent getDependent(@Param("pemail") String pemail,@Param("relationship") String relationship);
	
	@Modifying
	@Query("update Dependent d set d.bloodgroup = :bloodgroup,d.contact = :contact,d.dob = :dob,d.email = :email,d.height = :height,d.name = :name,d.pemail=:pemail,d.relationship = :relationship,d.weight=:weight where d.id = :id")
	void update(@Param("bloodgroup") String bloodgroup,@Param("contact")String contact,@Param("dob") String dob,@Param("email") String email,@Param("height")String height,@Param("name")String name,@Param("pemail")String pemail,@Param("relationship")String relationship,@Param("weight")String weight,@Param("id")int id);
}
