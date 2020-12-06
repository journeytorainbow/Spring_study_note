package com.word.dao;

import java.util.*;

import com.word.*;

public class WordDao {
	
	private Map<String, WordSet> wordDB = new HashMap<>();
	
	public void insert(WordSet wordSet) {
		wordDB.put(wordSet.getWordKey(), wordSet);
	}
	
	public WordSet select(String wordKey) {
		return wordDB.get(wordKey);
	}
}