package ems.member.service;

import java.util.*;

import ems.member.*;
import ems.member.dao.*;

public class StudentAllSelectService {
	private StudentDao studentDao;
	
	public StudentAllSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public Map<String, Student> allSelect() {
		return studentDao.getStudentDB();
	}
}