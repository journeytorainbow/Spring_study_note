package ems.member.config;

import org.springframework.context.annotation.*;

import ems.member.*;
import ems.member.dao.*;
import ems.member.service.*;

@Configuration // 스프링 컨테이너를 생성하는 클래스라는 의미
@Import({MemberConfig2.class, MemberConfig3.class})
public class MemberConfigUseImport {
	
	//<bean id="studentDao" class="ems.member.dao.StudentDao" />
	@Bean
	public StudentDao studentDao() {
		return new StudentDao();
	}
	
	/*<bean id="studentRegisterService" class="ems.member.service.StudentRegisterService">
		<constructor-arg ref="studentDao"></constructor-arg>
	</bean>*/
	@Bean
	public StudentRegisterService studentRegisterService() {
		return new StudentRegisterService(studentDao());
	}
	
	/*<bean id="studentSelectService" class="ems.member.service.StudentSelectService">
		<constructor-arg ref="studentDao"></constructor-arg>
	</bean>*/
	@Bean
	public StudentSelectService studentSelectService() {
		return new StudentSelectService(studentDao());
	}
}