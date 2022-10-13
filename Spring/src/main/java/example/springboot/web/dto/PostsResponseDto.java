package example.springboot.web.dto;

import example.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String contetn;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.contetn = entity.getContent();
        this.author = entity.getAuthor();
    }
}
