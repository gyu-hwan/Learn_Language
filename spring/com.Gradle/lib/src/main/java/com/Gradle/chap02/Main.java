package com.Gradle.chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		//자바설정에서 정보를 읽어와서 Bean객체의 생성,초기화,보관,제거를 관리함
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppContext.class);
		//AppContext에 등록되어있는 해당 클래스 타입의gree_ter bean객체를 가져온다
		//제공하는 bean객체의 리턴 타입이 greeter 타입이므로 해당 타입이 리턴되어 g에 선언된다.
		Greeterr g=ctx.getBean("gree_ter",Greeterr.class);
		
		//greet 메소드를 이용하여 ("%d,안녕하세요",스프링) 으로 선언된다.
		String msg=g.greet("스프링");
		//결과 "스프링,안녕하세요."가 출력된다.
		System.out.println(msg);
		ctx.close();
	}
}
