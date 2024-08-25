package com.miniproject.CollegeNetwork.Controller;

import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.miniproject.CollegeNetwork.Entities.Achievement;
import com.miniproject.CollegeNetwork.Entities.Login;
import com.miniproject.CollegeNetwork.Entities.Student;
import com.miniproject.CollegeNetwork.Interfaces.DaoInterface;
import com.miniproject.CollegeNetwork.Interfaces.StudentInterface;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class StudentController {

	@Autowired
	StudentInterface studentInterface;

	@Autowired
	ObjectFactory<HttpSession> httpSessionFactory;

	@Autowired
	DaoInterface daoInterface;

	@GetMapping("/login")
	public ModelAndView list() {
		System.out.println("Insidemodelandview");
		ModelAndView model = new ModelAndView("login2");
		return model;
	}

	@PostMapping("/LoginAction")
	public ModelAndView LoginAction(Login login, HttpSession session) {
		System.out.println("InsideLoginAction");

		if (studentInterface.validateStudentLogin(login)) {
			session.setAttribute("UserID", login.getId());
			Student student = studentInterface.getStudentById(login.getId());
			session.setAttribute("User", student);
			System.out.println("successful login");
			return new ModelAndView("profile_achievements");
		}
		Student student = new Student(login.getId());
		studentInterface.addStudent(student);
		studentInterface.addLogin(new Login(login.getId(), login.getPassword()));
		System.out.println("unsuccessful login and adding new student");
		return new ModelAndView("temp2");
	}

	@GetMapping("/profile_acheivements")
	public String ProfileAcheivements(@PathVariable Integer id, Model model) {
		System.out.println("InsideProfileAcheivements");
		List<Achievement> ac = daoInterface.getAchievements(id);
		System.out.println("size of ac:" + ac.size());
		model.addAttribute("profile_str", daoInterface.getProfilePic(id));
		model.addAttribute("achievements", daoInterface.getAchievements(id));

		return "profile_acheivements";
	}

}