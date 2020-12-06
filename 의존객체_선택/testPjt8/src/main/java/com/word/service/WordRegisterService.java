package com.word.service;

import org.springframework.beans.factory.annotation.*;

import com.word.*;
import com.word.dao.*;

public class WordRegisterService {
	
	@Autowired
	@Qualifier("usedDao")
	private WordDao wordDao;
	
	public void register(WordSet wordSet) {
		String wordKey = wordSet.getWordKey();
		if(verify(wordKey)) {
			wordDao.insert(wordSet);
		} else {
			System.out.println("The word has already registered.");
		}
	}

	public boolean verify(String wordKey) {
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet == null ? true : false;
	}
}