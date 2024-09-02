package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike,String>{
// above we pass entity class name,  datatype of id 
	//if we have more entity class make once repository and extend it jparepository
	
}
