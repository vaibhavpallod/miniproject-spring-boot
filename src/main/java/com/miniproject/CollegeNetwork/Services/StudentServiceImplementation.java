package com.miniproject.CollegeNetwork.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.CollegeNetwork.Entities.Login;
import com.miniproject.CollegeNetwork.Entities.Student;
import com.miniproject.CollegeNetwork.Interfaces.StudentInterface;
import com.miniproject.CollegeNetwork.Repositories.LoginRepository;
import com.miniproject.CollegeNetwork.Repositories.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentInterface {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	LoginRepository loginRepository;

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}

	@Override
	public boolean validateStudentLogin(Login login) {
		Iterable<Login> studentList = loginRepository.findAll();
		System.out.println("studentList size:" + ((List<Login>) studentList).size());
		for (Login login_each : studentList) {
			System.out.println("Check " + login.getId() + " " + login_each.getId() + " " + login.getPassword() + " "
					+ login_each.getPassword());
			if (login.getId() == login_each.getId() && login.getPassword().equals(login_each.getPassword())) {
				return true;
			}
		}

		return false;
	}

	@Override
	public void addLogin(Login login) {
		loginRepository.save(login);
	}

}
