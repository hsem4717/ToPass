package example.springboot.web;

import example.springboot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) //JUnit에 내장된 실행자 외에 다른 실행자를 실행
//SpringRunner이라는 스프링 실행자 사용
//스프링 부트 테스트와 JUnit을 연결
@WebMvcTest(controllers = HelloController.class)//Web에 집중할수 있는 어노테이션
//@Controller, @ControllerAdvice 사용가능
//@Service, @Component, @Repository 사용 불가능
public class HelloControllerTest {
    @Autowired//스프링이 관리하는 빈을 주입받음
    // 빈 스프링 컨테이너에 의해 관리되는 자바 객체(POJO)를 의미

    private MockMvc mvc;//웹 API 테스트시 사용
    //스프링 MVC테스트의 시작지점
    //이 클래스를 통해 HTTP, GET, POST등에 대한 API테스트 가능

    @Test
    public void hello_리턴() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))//MockMvc를 통해 /hello 주소로 HTTP GET 요청
                //체이닝 지원 여러검증기능 이어서 선언 가능

                .andExpect(status().isOk()) //mvd.perform의 결과 검증
                //HTTP Header의 Status 검증 , 200인지 검사

                .andExpect(content().string(hello));
        //응답 본문의 내용 검증
        //Contorller에서 "hello"를 리탄히기에 이 값이 맞는지 검증
    }
    @Test
    public void helloDto가_리턴된다() throws Exception{
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("amount", String
                                .valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
    }
}
