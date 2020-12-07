package ems.member.dao;

import java.util.*;

import ems.member.*;
import ems.member.service.*;

public class StudentDao {
	
	private Map<String, Student> studentDB = new HashMap<>();
	
	public void insert(Student student) {
		studentDB.put(student.getsNum(), student);
	}
	
	public Student select(String sNum) {
		return studentDB.get(sNum);
	}
	
	public Map<String, Student> getStudentDB() {
		return studentDB;
	}
}