package com.miniproject.CollegeNetwork.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.CollegeNetwork.Entities.ProfilePic;

@Repository
public interface ProfilePicRepository extends CrudRepository<ProfilePic, Integer> {

}