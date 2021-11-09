package com.hoseong.book.ex1.springboot.domain.posts;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//왠만하면 Entity의 PK는 Long타입의 Auto increment를 추천
//FK를 맺을 때 다른 테이블에서 복합키 전부를 갖고 있거나, 중간 테이블을 하나 더 둬야 하는 상황이 발생합니다.
//인덱스에 좋은 영향을 끼치지 못합니다.
//@NoArgsConstructor 기본생성자 자동 추가 public Post() {} 와 같은 효과
//@Getter     클래스 내 모든 필드의 Getter 메소드를 자동생성
//@Builder    해당 클래스의 빌더 패턴 클래스를 생성, 생성자 상단에 생성자에 포함된 필드만 빌더에 포함

@Getter
@NoArgsConstructor
@Entity  //테이블과 링크될 클래스임을 나타냄
public class Posts {

    @Id //해당 테이블의 pk 필드를 나타냅니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성규칙을 나타냅니다.
    private Long id;

    @Column(length = 500, nullable = false) // 테이블의 칼럼을 나타내며 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 칼럼이 됩니다.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column
    private String author;

    //
//    public Posts() {};

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

