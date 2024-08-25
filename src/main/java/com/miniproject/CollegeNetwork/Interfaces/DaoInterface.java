package com.miniproject.CollegeNetwork.Interfaces;

import java.util.List;

import com.miniproject.CollegeNetwork.Entities.Achievement;

public interface DaoInterface {
//	public String getName(String id);
//
//	public User getUser(String id);
//
//	public String getEncodedString(ResultSet resultSet, int i);
//
	public List<Achievement> getAchievements(int id);

//
//	public ArrayList<Internship> getInternships(String id);
	public String getProfilePic(int id);

}
