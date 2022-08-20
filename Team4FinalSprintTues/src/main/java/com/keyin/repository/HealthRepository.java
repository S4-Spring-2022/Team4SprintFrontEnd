package com.keyin.repository;
import com.keyin.entity.Health;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.*;
@RepositoryRestResource(collectionResourceRel = "health",path = "health" )
public interface HealthRepository extends JpaRepository<Health, Long> {
    public List<Health> findById(@Param("health_id")String healthId);
    public List<Health> findByHeight(@Param("height")String height);
    public List<Health> findByWeight(@Param("weight") String weight);

}
