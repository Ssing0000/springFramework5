package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//해당 클래스를 스프링 설정 클래스로 지정
@Configuration
public class AppContext{
	
	//Bean 어노텡이션이 붙이면, 해당 메서드가 생성한 객체를 스프링이 관리하는 빈 객체로 등록
	//여기서 메서드 이름인 geeter는 빈 객체를 참조할 때 사용된다.
	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요.");
		return g;
	}
	
	@Bean
	public Greeter greeter1() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요.");
		return g;
	}
}