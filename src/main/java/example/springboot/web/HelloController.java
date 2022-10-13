package example.springboot.web;
import example.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //컨트롤러를 JSON으로 반환하는 컨트롤러
                //예전에는 @ResponseBody를 각 매소드 마다 선언 했던 것을 한번에 사용할수 있게 해줌
public class HelloController {
    @GetMapping("/hello")//HTTP Method인 Get의 요청을 받을 수 있는 API 생성
                            //hello를 요청하면 hello를 반환
    public String hello() {
        return "hello";
    }
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        //외부에서 API로 넘긴 파라미터를 가져옴
        //외부에서 name(@RequestParam("name))이란 이름으로 넘긴 파라미터를 메소드 파라미터 name(String name)에 저장
        return new HelloResponseDto(name, amount);
    }

}

