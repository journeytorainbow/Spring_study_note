package ems.member.config;

import org.springframework.context.annotation.*;

import ems.member.*;
import ems.member.dao.*;
import ems.member.service.*;

@Configuration
public class MemberConfig1 {
	
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