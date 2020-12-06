package com.bms;

import org.springframework.context.support.*;

import com.bms.book.*;
import com.bms.book.service.*;
import com.bms.member.*;
import com.bms.member.service.*;

public class MainClass {

	public static void main(String[] args) {
		String[] bNums = { "739", "985", "184", "830", "816" };
		String[] bTitles = { "html", "css", "jQuery", "java", "spring" };
		
		String[] mIds = { "rabbit", "hippo", "raccoon", "elephan", "lion" };
		String[] mPws = { "96539", "94875", "15284", "48765", "28661" };
		String[] mNames = { "agatha", "barbara", "chris", "doris", "elva" };
		
		// 스프링 컨테이너 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
		
		// 더미 도서 목록 등록
		BookRegisterService brs = ctx.getBean("bookRegisterService", BookRegisterService.class);
		for (int i=0; i<bNums.length; i++) {
			Book book = new Book(bNums[i], bTitles[i], true, null);
			brs.register(book);
		}
		
		// 더미 도서 목록 출력
		BookSearchService bss = ctx.getBean("bookSearchService", BookSearchService.class);
		System.out.println("\nbNum\tbTitle\tbCanRen\tbLenderId");
		System.out.println("------------------------------------------");
		for (int i=0; i<bNums.length; i++) {
			Book book = bss.search(bNums[i]);
			System.out.print(book.getbNum() + "\t");
			System.out.print(book.getbTitle() + "\t");
			System.out.print(book.isbCanRental() + "\t");
			System.out.println(book.getbMember() == null ? null : book.getbMember().getmId());
		}
		
		// 더미 회원 목록 등록
		MemberRegisterService mrs = ctx.getBean("memberRegisterService", MemberRegisterService.class);
		for (int i=0; i<mIds.length; i++) {
			Member member = new Member(mIds[i], mPws[i], mNames[i]);
			mrs.register(member);
		}
		
		// 더미 회원 목록 출력
		MemberSearchService mss = 
				ctx.getBean("memberSearchService", MemberSearchService.class);
		System.out.println("\nmId\tmPw\tmName");
		System.out.println("------------------------------------------");
		for (int i = 0; i < mIds.length; i++) {
			Member member = mss.search(mIds[i]);
			System.out.print(member.getmId() + "\t");
			System.out.print(member.getmPw() + "\t");
			System.out.print(member.getmName() + "\n");
		}
		
		// 도서 대여 목록 등록
		brs.register(new Book("739", "html", false, mss.search("elephan")));
		brs.register(new Book("184", "jQuery", false, mss.search("hippo")));
		brs.register(new Book("816", "spring", false, mss.search("rabbit")));
		brs.register(new Book("985", "css", false, mss.search("rabbit")));
		
		// 도서 대여 목록 출력
		System.out.println("\nbNum\tbTitle\tbCanRen\tbLenderId");
		System.out.println("------------------------------------------");
		for (int i = 0; i < bNums.length; i++) {
			Book book = bss.search(bNums[i]);
			System.out.print(book.getbNum() + "\t");
			System.out.print(book.getbTitle() + "\t");
			System.out.print(book.isbCanRental() + "\t");
			System.out.println(book.getbMember() == null ? null : book.getbMember().getmId());
		}
		
		ctx.close();
	}
}