package com.spring.safetravels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.safetravels.models.Travel;
import com.spring.safetravels.repositories.TravelRepository;

@Service
public class TravelService {
	@Autowired
	private TravelRepository tRepo;
	
	public List<Travel> getAll(){
		return tRepo.findAll();
	}
	
	public void createExpense(Travel travel){
		tRepo.save(travel);
	}
	
	public void updateExpense(Travel travel) {
		tRepo.save(travel);
	}
	
	public Travel expenseInfo(Long id) {
		return tRepo.findById(id).orElse(null);
	}
	
	public void deleteExpense (Long id) {
		tRepo.deleteById(id);
	}
}
