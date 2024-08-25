package com.miniproject.CollegeNetwork.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.CollegeNetwork.Entities.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {

}