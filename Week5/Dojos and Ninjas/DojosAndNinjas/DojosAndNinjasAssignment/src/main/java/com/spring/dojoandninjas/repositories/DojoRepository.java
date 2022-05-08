package com.spring.dojoandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.dojoandninjas.models.Dojo;

public interface DojoRepository extends CrudRepository <Dojo, Long> {
	List<Dojo> findAll();

}
