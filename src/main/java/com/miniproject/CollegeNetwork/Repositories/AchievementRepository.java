package com.miniproject.CollegeNetwork.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.CollegeNetwork.Entities.Achievement;

@Repository
public interface AchievementRepository extends CrudRepository<Achievement, Integer> {
	@Query(value = "SELECT * FROM achievement WHERE id = ?1", nativeQuery = true)
	List<Achievement> GetAllAchievements(int id);
}