package com.miniproject.CollegeNetwork.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.CollegeNetwork.Entities.Internship;

@Repository
public interface InternshipRepository extends CrudRepository<Internship, Integer> {

}