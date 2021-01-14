package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//디스패쳐 서블릿 필터
//http://localhost:8000/

//디스패쳐 서블릿 필터에서 com.example.demo 이하의 모든 패키지를 컴포넌트 스캔한다.
//모든 클래스중에 @Controller or @RestController 가 있는 어노테이션 클래스를 모두 메모리에 띄우고
//그 클래스에서 /주소로 매핑된 메서드가 있는지 리플렉션 한다.
//= @GetMapping, @PostMapping, @putMapping, @DeleteMapping
//if = GET으로 했으면 GetMapping이 걸려있는 함수만 찾아내서 /로 주소가 걸려있는 함수를 invoke해준다.
// 어딘가에 뜸. heap을 가르키는 힙 --> 힙을 관리하는 곳 IoC컨테이너 힙에 뜬것을 스프링이 관리
// Inversion of Controll = 제어의 역전

@Controller
@RestController
public class indexController {
//  http://localhost:8080/start/index
	@GetMapping("/index")
	public void index() {
		System.out.println("index() 호출됨");
	}
}
