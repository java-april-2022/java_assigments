package com.spring.dojoandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.dojoandninjas.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
	List<Ninja> findByDojoId(Long dojoId);

}
