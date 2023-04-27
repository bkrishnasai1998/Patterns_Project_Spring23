package com.balupariClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.balupariClasses.DMS.Models.Dog;
/**
 * 
 * @author Krishna Sai Balupari
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
