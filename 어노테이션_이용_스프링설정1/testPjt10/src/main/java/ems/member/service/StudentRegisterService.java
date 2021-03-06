package ems.member.service;

import ems.member.*;
import ems.member.dao.*;

public class StudentRegisterService {
	
	private StudentDao studentDao;
	
	public StudentRegisterService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void register(Student student) {
		String sNum = student.getsNum();
		if (verify(student.getsNum())) {
			studentDao.insert(student);
		} else {
			System.out.println("The student is already existed.");
		}
	}
	
	private boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student == null ? true : false;
	}
}