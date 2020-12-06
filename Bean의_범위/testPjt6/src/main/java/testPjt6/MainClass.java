package testPjt6;

import org.springframework.context.support.*;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		InjectionBean injectionBean = ctx.getBean("injectionBean",InjectionBean.class);
		
		DependencyBean dependencyBean01 = ctx.getBean("dependencyBean", DependencyBean.class);
		DependencyBean dependencyBean02 = ctx.getBean("dependencyBean", DependencyBean.class);
		
		if(dependencyBean01.equals(dependencyBean02)) {
			System.out.println("dependencyBean01 == dependencyBean02");
		} else {
			System.out.println("dependencyBean01 != dependencyBean02");
		}
		ctx.close();
	}
}