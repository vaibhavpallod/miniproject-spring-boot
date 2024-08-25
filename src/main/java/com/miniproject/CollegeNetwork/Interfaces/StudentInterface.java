package com.miniproject.CollegeNetwork.Interfaces;

import java.util.List;

import com.miniproject.CollegeNetwork.Entities.Login;
import com.miniproject.CollegeNetwork.Entities.Student;

public interface StudentInterface {

	public List<Student> getAllStudents();

	public Student getStudentById(int id);

	public void addStudent(Student student);

	public void deleteStudent(int id);

	public boolean validateStudentLogin(Login login);

	public void addLogin(Login login);

}
