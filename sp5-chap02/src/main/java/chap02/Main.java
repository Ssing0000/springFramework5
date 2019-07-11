package chap02;

// AnnotationConfigApplicationContext 
// 위 클래스는 자바 설정에서 정보를 읽어와 빈 객체를 생성, 관리한다.
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		// AnnotationConfigApplicationContext 객체를 생성. 
		// 앞서 @Configuration을 붙여 주었던 AppContext객체를 인자로 전달한다.
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);

		// AnnotationConfigApplicationContext는 AppContext에 정의한 @Bean 정보를 읽어와 Greeter 객체를 생성, 초기화 한다.
		// getBean 메서드는 빈 객체를 검색할때 사용.
		// getBean(메서드 이름이자 빈객체의 이름, 검색할 빈 객체의 타입)
		Greeter g = ctx.getBean("greeter", Greeter.class);
		
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}
}
