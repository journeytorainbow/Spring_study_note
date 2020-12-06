package testPjt6;

public class DependencyBean {
	private InjectionBean injectionBean;
	
	public DependencyBean(InjectionBean injectionBean) {
		System.out.println("DependencyBean의 생성자 호출");
		this.injectionBean = injectionBean;
	}
}