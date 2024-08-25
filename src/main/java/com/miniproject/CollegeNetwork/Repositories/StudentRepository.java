package com.miniproject.CollegeNetwork.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.CollegeNetwork.Entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}