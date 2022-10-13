package example.springboot.domain.posts;

import lombok.Builder; // lombok의 어노테이션들은 코드 변경량을 줄여줌
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //필드 내 모든 필드의 Getter 자동생설
@NoArgsConstructor// 기본 생성자 자동 추가
                  // public Posts와 같은 기능
@Entity // 테이블과 연결될 클래스
        // 기본값으로 카멜 -> 언더스코어 네이밍으로 이름 매칭
public class Posts { // Entity 클래스에서는 Setter 메소드 사용 x-> 불가능은 x

    @Id // PK 필드
    @GeneratedValue(strategy =  GenerationType.IDENTITY)// PK의 생성 규칙
    private Long id;

    @Column(length = 500,nullable = false) // 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용
                                            // 문자여르이 경우 VARCHAR이 기본-> 사이즈를 늘이거나 타입울 변경할 때 사용
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스를 생성
            // 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title,String content,String author){
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}