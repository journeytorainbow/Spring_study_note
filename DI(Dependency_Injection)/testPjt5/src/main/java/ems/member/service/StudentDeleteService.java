package ems.member.service;

import ems.member.*;
import ems.member.dao.*;

public class StudentDeleteService {
	StudentDao studentDao;
	
	public StudentDeleteService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void delete(Student student) { 
		if (verify(student.getsNum())) {
			studentDao.delete(student.getsNum());
		}
	}

	private boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
	}
}