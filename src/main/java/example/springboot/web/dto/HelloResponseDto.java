package example.springboot.web.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter //모든 필드의 get 메소드 생성
@RequiredArgsConstructor//선언된 모든 final 필드가 포함된 생성자를 생성
                        //final이 없는 필드는 생성자에 포함 x
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
