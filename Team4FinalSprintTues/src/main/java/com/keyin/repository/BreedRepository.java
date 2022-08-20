package com.keyin.repository;

import com.keyin.entity.Breed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.*;
@RepositoryRestResource(collectionResourceRel = "breed",path = "breed" )
public interface BreedRepository extends JpaRepository <Breed,Long> {
    public List<Breed> findById(@Param("breed_id")String breedID);
    public List<Breed> findByBreedName(@Param("breed_name")String breedName);
    public List<Breed> findByScientificName(@Param("scientific_name")String scientificName);
    public List<Breed> findByCountry(@Param("country_of_origin")String country);
    public List<Breed> findByYears (@Param("life_expectancy")String lifeExpectancy);
}
