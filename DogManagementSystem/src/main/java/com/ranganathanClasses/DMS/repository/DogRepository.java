package com.ranganathanClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ranganathanClasses.DMS.Models.Dog;
/* @author Aravind Ranganathan */
public interface DogRepository extends CrudRepository<Dog,Integer> {
List<Dog> findByName(String name);
}
