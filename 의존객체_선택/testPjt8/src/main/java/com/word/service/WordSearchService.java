package com.word.service;


import javax.inject.*;

import org.springframework.beans.factory.annotation.Qualifier;

import com.word.*;
import com.word.dao.*;

public class WordSearchService {
	
	@Inject
	@Named(value="wordDao1")
	private WordDao wordDao;
	
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