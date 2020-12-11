package com.bs.lec23.member.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.datasource.*;
import org.springframework.stereotype.Repository;

import com.bs.lec23.member.Member;
import com.mchange.v2.c3p0.*;
import com.mchange.v2.c3p0.DriverManagerDataSource;

@Repository
public class MemberDaoUseAutowired implements IMemberDao {

//	private String driver = "oracle.jdbc.driver.OracleDriver";
//	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private String userid = "c##ebichu";
//	private String userpw = "1234";
	
//	private ComboPooledDataSource dataSource;
	private JdbcTemplate template;
	
	@Autowired // 의존 객체 자동 주입
	public MemberDaoUseAutowired(ComboPooledDataSource dataSource) {
		
		// 반드시 예외 처리 필요함
//		dataSource = new ComboPooledDataSource();
//		try {
//			dataSource.setDriverClass(driver);
//			dataSource.setJdbcUrl(url);
//			dataSource.setUser(userid);
//			dataSource.setPassword(userpw);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
	@Override
	public int memberInsert(final Member member) {
		
		int result = 0;
		
		final String sql = "INSERT INTO member (memId, memPw, memMail) values (?,?,?)";
		result = template.update(sql, member.getMemId(), member.getMemPw(), member.getMemMail());
		
		return result;
	}

	@Override
	public Member memberSelect(final Member member) {
		
		List<Member> members = null;
		final String sql = "SELECT * FROM member WHERE memId = ? AND memPw = ?";
		
		members = template.query(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, member.getMemId());
				pstmt.setString(2, member.getMemPw());
			}
		}, new RowMapper<Member>() {
			
			 @Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				 Member mem = new Member();
				 mem.setMemId(rs.getString("memId"));
				 mem.setMemPw(rs.getString("memPw"));
				 mem.setMemMail(rs.getString("memMail"));
				 mem.setMemPurcNum(rs.getInt("memPurcNum"));
				 return mem;
			}
		});
		
		if(members.isEmpty()) return null;
		return members.get(0); // 첫번째 인덱스의 레코드를 리턴
	}

	@Override
	public int memberUpdate(final Member member) {
		
		int result = 0;
		
		final String sql = "UPDATE member SET memPw = ?, memMail = ? WHERE memId = ?";
		
		result = template.update(sql, member.getMemPw(), member.getMemMail(), member.getMemId());
		return result;
	}

	@Override
	public int memberDelete(final Member member) {
		
		int result = 0;
		final String sql = "DELETE from member WHERE memId = ? AND memPw = ?";
		result = template.update(sql, member.getMemId(), member.getMemPw());
		return result;
	}
}