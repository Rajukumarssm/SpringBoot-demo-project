package com.springboot.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.entity.Bike;

public interface Bikeservice {
//	all method below are by default public abstract method
  String addbike(Bike b);
Bike getbike(String engNo);
List<Bike> getallbike();
String updatebike(Bike b);
String deletebike(String engNo);
String updatebikebypatch(Bike b); 
}
