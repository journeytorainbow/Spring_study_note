package com.bms.book.service;

import org.springframework.beans.factory.annotation.*;

import com.bms.book.*;
import com.bms.book.dao.*;

public class BookSearchService {
	
	@Autowired
	private BookDao bookDao;
	
	public BookSearchService() {}
	
	public Book search(String bNum) {
		Book book = bookDao.select(bNum);
		return book;
	}
	
	public void initMethod() {
		System.out.println("BookSearchService 빈 객체 생성");
	}
	
	public void destroyMethod() {
		System.out.println("BookSearchService 빈 객체 소멸");
	}
}