package com.hoseong.book.ex1.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//보통 ibatis 나 MyBatis 등 에서 Dao 라고 불리는 DB Layer 접근자입니다.
//단순히 인터페이스를 생성 후 ,JpaRepository<Entity 클래스, PK타입>를 상속하면 기본적인 CRUD 메소드가 자동으로 생성됩니다.
public interface PostsRepository extends JpaRepository<Posts, Long> {

}