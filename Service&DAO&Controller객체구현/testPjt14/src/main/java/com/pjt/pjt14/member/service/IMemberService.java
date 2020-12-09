package com.pjt.pjt14.member.service;

import com.pjt.pjt14.member.*;

public interface IMemberService {
	void memberRegister(String memId, String memPw, String memMail, String memPhone1, String memPhone2, String memPhone3);
	Member memberSearch(String memeId, String memPw);
	void memberModify();
	void memberRemove();
}