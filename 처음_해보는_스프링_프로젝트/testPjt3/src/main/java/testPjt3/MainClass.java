package testPjt3;

import org.springframework.context.support.*;

public class MainClass {
	public static void main(String[] args) {
//		TransportationWalk tw = new TransportationWalk();
//		tw.move();
		
		// applicationContect.xml로부터 컨테이너 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TransportationWalk tw = ctx.getBean("tWalk", TransportationWalk.class); // 컨테이너로부터 빈을 가져옴
		tw.move();
		
		// 자원 해제
		ctx.close();
	}
}