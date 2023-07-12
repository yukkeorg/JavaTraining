package com.s_giken.training.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.s_giken.training.webapp.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    // 参考
    // https://docs.spring.io/spring-data/jpa/docs/1.11.1.RELEASE/reference/html/#jpa.query-methods
    public List<Member> findByNameLikeAndMailLike(String name, String mail);
}
