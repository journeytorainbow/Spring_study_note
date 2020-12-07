package ems.member.service;

import ems.member.*;
import ems.member.dao.*;

public class StudentSelectService {
	
	private StudentDao studentDao;
	
	public StudentSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public Student select(String sNum) {
		if(verify(sNum)) {
			return studentDao.select(sNum);
		} else {
			System.out.println("The student is not existed.");
		}
		
		return null;
	}

	public boolean verify(String sNum) {
		return studentDao.select(sNum) != null ? true : false;
	}
}