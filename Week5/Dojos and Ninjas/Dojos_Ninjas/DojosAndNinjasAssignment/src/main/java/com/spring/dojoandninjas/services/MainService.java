package com.spring.dojoandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dojoandninjas.models.Dojo;
import com.spring.dojoandninjas.models.Ninja;
import com.spring.dojoandninjas.repositories.DojoRepo;
import com.spring.dojoandninjas.repositories.NinjaRepo;

@Service
public class MainService {
	
	@Autowired 
	private DojoRepo dRepo;
	
	public List<Dojo> getAllDojos(){
		return dRepo.findAll();
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dRepo.save(dojo);
	}
	
	@Autowired
	private NinjaRepo nRepo;
	
	public List<Ninja> getAllNinjas(){
		return nRepo.findAll();
	}
	
	public Ninja createNinja(Ninja ninja) {
		return nRepo.save(ninja);
	}
	
	public List<Ninja> getAllByDojoId(Long dojoId){
		return nRepo.findByDojoId(dojoId);
	}
	
	public Dojo dojoInfo(Long id) {
		return dRepo.findById(id).orElse(null);
	}
}
