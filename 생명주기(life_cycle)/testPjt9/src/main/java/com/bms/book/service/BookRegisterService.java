package com.bms.book.service;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.*;

import com.bms.book.*;
import com.bms.book.dao.*;

public class BookRegisterService implements InitializingBean, DisposableBean {
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("bean 객체 생성");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("bean 객체 소멸");
	}
	
	@Autowired
	private BookDao bookDao;
	
	public BookRegisterService() {}
	
	public void register(Book book) {
		bookDao.insert(book);
	}
}