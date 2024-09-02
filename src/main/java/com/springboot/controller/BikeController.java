package com.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Bike;
import com.springboot.services.Bikeservice;
@RestController
@RequestMapping("/b")
public class BikeController
{
	Bikeservice bkser;
	//isme bikesrvice ka reference bnayenge kyoki ye class service se interact krta hai
	

	public BikeController(Bikeservice bkser) {
		
		this.bkser = bkser;
	}

	
	
//creating and storing the bike object
	@PostMapping
	public String addbike(@RequestBody Bike b) {
		String msg=bkser.addbike(b);
		return msg;
	}
	
	//fetching the specific bike details
	@GetMapping(value="{engNo}")
	public Bike getbike(@PathVariable String engNo) {
		Bike b=bkser.getbike(engNo);
		return b;
	}
	
	//fetching all the bike detail
	
	@GetMapping
	public List<Bike> getallbike(){
		List<Bike>blist=bkser.getallbike();
		return blist;
	}
	
	//updating the bike details
	@PutMapping
	public String updatebike(@RequestBody Bike b) {
		String msg=bkser.updatebike(b);
		return msg;
		
	}
	@PatchMapping
	public String updatebikebypatch(@RequestBody Bike b) {
		String msg=bkser.updatebikebypatch(b);
		return msg;
		
	}
	
	
	
	//deleting yhe bike details
	@DeleteMapping(value="{engNo}")
	public String deletebike(@PathVariable String engNo) {
		String msg=bkser.deletebike(engNo);
		return msg;
	}
}
