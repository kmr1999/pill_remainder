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
public interface UserRepository extends JpaRepository<User,String> 
{
	
	
	@Query("from User u where u.email=:email")
	User getUserById(@Param("email") String email);

	
	@Modifying
	@Query("update User u set u.password = :password where u.email = :email")
	void putUser(@Param("password") String password,@Param("email") String email);

}
