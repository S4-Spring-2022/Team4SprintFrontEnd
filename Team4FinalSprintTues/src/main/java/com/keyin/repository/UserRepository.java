package com.keyin.repository;


import com.keyin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.*;
@RepositoryRestResource(collectionResourceRel = "user",path = "user" )
public interface UserRepository extends JpaRepository<User,Long>{
    public List<User>findById(@Param("user_id")String userID);
    public List<User>findByEmail(@Param("user_email")String userEmail);
    public List<User>findByUserName (@Param("user_name")String userName);
}
