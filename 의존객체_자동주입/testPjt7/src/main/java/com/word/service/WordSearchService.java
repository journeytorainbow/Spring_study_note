package com.word.service;

import org.springframework.beans.factory.annotation.*;

import com.word.*;
import com.word.dao.*;

public class WordSearchService {
	private WordDao wordDao;
	
	@Autowired
	public WordSearchService(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
	public WordSet search(String wordKey) {
		if(verify(wordKey)) {
			return wordDao.select(wordKey);
		} else {
			System.out.println("The word is not existed.");
		}
		return null;
	}

	private boolean verify(String wordKey) {
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet != null ? true : false;
	}
}
