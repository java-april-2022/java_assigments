package com.spring.dojoandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.dojoandninjas.models.Dojo;
import com.spring.dojoandninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);

}
