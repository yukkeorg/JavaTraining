package com.s_giken.training.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.s_giken.training.webapp.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    // SprintBootでは、リポジトリアクセス用のインターフェースを定義する際に
    // 特殊な命名ルールがあります。詳細は以下の参考先URLを確認して下さい。
    // https://docs.spring.io/spring-data/jpa/docs/1.11.1.RELEASE/reference/html/#jpa.query-methods
    public List<Member> findByNameLikeOrMailLike(String name, String mail);
}
