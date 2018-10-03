package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import study.controller.restController;

//Spring은 Application.java 를 위치를 기준으로 하위 클래스들을 스캔해 빈으로 등록
/*
@EnableAutoConfiguration은 스프링 부트를 움직이는 원동력이다.
스프링 부트 자동 구성 auto-Configuration이 바로 이 애노테이션에서 시작된다.
스프링 부트는 클래스패스, 애노테이션, 구성파일을 보고 가장 적절한 앱에 가장 알맞은 기술을 넣어 구성을 마친다.
결국 이 애노테이션이 스프링 부트로 앱을 구성하게 된다.
@SpringBootApplication과 그 내부의 자동 구성 @EnableAutoConfiguration 기능 덕분에 전체 애플리케이션 컴포넌트를 식별한다.
우선 클래스 패스를 조사해서 spring-boot-starter-web 스타터가 선언된 것을 인지한 스프링 부트는 앱 애플리케이션을 구성한다.
따라서 @RequestMapping이 달린 메서드가 있고 @Controller 애노테이션이 달린 클래스는 웹 컨트롤러로 보고, 톰캣 서버는 spring-boot-starter-web의 의존체 중 하나이므로 톰캣으로 앱을 띄운다.
@Configuration
@EnableAutoConfiguration
@ComponentScan
*/
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
