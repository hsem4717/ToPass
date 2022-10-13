package example.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//스프링 부트의 기능 자동 설정
public class Application {
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);//SpringApplication.run으로 내장WAS 실행 = 톰캣설치 필요 x jar파일로 실행
    }
}
