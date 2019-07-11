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
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter1", Greeter.class);
		
		System.out.println("(g1==g2) = " + (g1==g2)); // (g1==g2) = true
		
		// g1,g2는 같은 객체를 리턴한다.
		// 별도의 설정을 하지 않으면 스프링은 한개의 빈 객체만을 생성.
		// 이때 객체는 싱글톤(Single object) 법위를 갖는다.
		ctx.close();
	}
}
