package testPjt4;

import org.springframework.context.support.*;

public class MainlClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext cxt = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TransportationWalk tw = cxt.getBean("tWalk", TransportationWalk.class);
		tw.move();
		
		cxt.close();
	}
}