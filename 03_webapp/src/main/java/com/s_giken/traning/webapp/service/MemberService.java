package com.s_giken.traning.webapp.service;

import java.util.List;
import java.util.Optional;

import com.s_giken.traning.webapp.model.Member;
import com.s_giken.traning.webapp.model.MemberSearchCondition;

public interface MemberService {
    List<Member> findAll();

    Optional<Member> findById(int memberId);

    List<Member> findByConditions(MemberSearchCondition memberSearchCondition);
}
