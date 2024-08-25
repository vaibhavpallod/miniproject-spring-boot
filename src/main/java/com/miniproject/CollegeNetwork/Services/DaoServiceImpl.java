package com.miniproject.CollegeNetwork.Services;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.CollegeNetwork.Entities.Achievement;
import com.miniproject.CollegeNetwork.Entities.ProfilePic;
import com.miniproject.CollegeNetwork.Interfaces.DaoInterface;
import com.miniproject.CollegeNetwork.Repositories.AchievementRepository;
import com.miniproject.CollegeNetwork.Repositories.InternshipRepository;
import com.miniproject.CollegeNetwork.Repositories.ProfilePicRepository;
import com.miniproject.CollegeNetwork.Repositories.StudentRepository;

@Service
public class DaoServiceImpl implements DaoInterface {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	ProfilePicRepository profilePicRepository;

	@Autowired
	AchievementRepository achievementRepository;

	@Autowired
	InternshipRepository internshipRepository;

	@Override
	public String getProfilePic(int id) {
		ProfilePic pic = profilePicRepository.findById(id).get();
		return getEncodedString(pic.getPicture(), 3);
	}

	private String getEncodedString(Blob blob, int i) {
		String fileName = "image.png";
		String encodeString = "null";
		try {
			encodeString = Base64.getEncoder().encodeToString(blob.getBinaryStream().readAllBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return encodeString;

	}

	@Override
	public List<Achievement> getAchievements(int id) {
		List<Achievement> ac = achievementRepository.GetAllAchievements(id);
		return ac;
	}

}
