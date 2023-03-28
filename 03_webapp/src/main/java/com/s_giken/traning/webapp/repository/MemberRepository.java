package com.s_giken.traning.webapp.repository;

import com.s_giken.traning.webapp.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  MemberRepository extends JpaRepository<Member, Integer> {
}
