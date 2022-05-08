package com.spring.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.dojoandninjas.models.Dojo;
import com.spring.dojoandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	private final DojoRepository repo;
	
	public DojoService(DojoRepository repo) {
		this.repo = repo;
	}
	
	public List<Dojo> all(){
		return repo.findAll();
	}
	
	public Dojo create(Dojo dojo) {
		System.out.println(dojo.getId());
		return repo.save(dojo);
	}
	
	public Dojo find(Long id) {
		Optional<Dojo> result = repo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}else {
			return null;
		}
	}
}
