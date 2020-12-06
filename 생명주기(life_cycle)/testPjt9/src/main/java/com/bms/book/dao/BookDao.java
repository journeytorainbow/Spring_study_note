package com.bms.book.dao;

import java.util.*;

import com.bms.book.*;

public class BookDao {
	
	private Map<String, Book> bookDB = new HashMap();
	
	public void insert(Book book) {
		bookDB.put(book.getbNum(), book);
	}
	
	public Book select(String bNum) {
		return bookDB.get(bNum);
	}
	
	public void update(Book book) {
		
	}
	
	public void delete(Book book) {
		
	}
	
	public Map<String, Book> getBookDB() {
		return bookDB;
	}
}