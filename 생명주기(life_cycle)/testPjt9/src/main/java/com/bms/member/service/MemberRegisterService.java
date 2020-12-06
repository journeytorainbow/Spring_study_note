package com.bms.member.service;

import org.springframework.beans.factory.annotation.*;

import com.bms.member.*;
import com.bms.member.dao.*;

public class MemberRegisterService {
	
	@Autowired
	private MemberDao memberDao;
	
	public MemberRegisterService() {}
	
	public void register(Member member) {
		memberDao.insert(member);
	}
}