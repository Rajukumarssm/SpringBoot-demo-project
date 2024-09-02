package com.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.entity.Bike;
import com.springboot.repository.BikeRepository;
@Service
public class Bikeserviceimplementation implements Bikeservice {
	BikeRepository bikerepo;
	
	public Bikeserviceimplementation(BikeRepository bikerepo) {
		
		this.bikerepo = bikerepo;
	}
	@Override
     public String addbike(Bike b) {
		bikerepo.save(b);//used save method to add
		return "bike is added";
	}
	
	public Bike getbike(String engNo) {
		Bike b=bikerepo.findById(engNo).get();
		return b;
	}
	public List<Bike> getallbike(){
		List<Bike>blist=bikerepo.findAll();
		return blist;
	}
	public String updatebike(Bike b){
		Bike br=bikerepo.findById(b.getEngNo()).get();
		br.setBrand(b.getBrand());
		br.setCost(b.getCost());
		bikerepo.save(br);
		return "bike is updated";
	}
	public String updatebikebypatch( Bike b) {
		
		Bike br=bikerepo.findById(b.getEngNo()).get();
		br.setBrand(b.getBrand());
		br.setCost(b.getCost());
		bikerepo.save(br);
		return "bike is updated";
	}
	public String deletebike(String engNo) {
		bikerepo.deleteById(engNo);
		return "bike is deleted";
	}
}
