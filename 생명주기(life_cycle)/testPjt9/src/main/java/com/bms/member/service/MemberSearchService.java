package com.bms.member.service;

import org.springframework.beans.factory.annotation.*;

import com.bms.member.*;
import com.bms.member.dao.*;

public class MemberSearchService {
	
	@Autowired
	private MemberDao memberDao;
	
	public MemberSearchService() {}
	
	public Member search(String mId) {
		return memberDao.select(mId);
	}
}