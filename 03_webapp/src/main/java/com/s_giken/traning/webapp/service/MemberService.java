package com.s_giken.traning.webapp.service;

import java.util.List;
import java.util.Optional;

import com.s_giken.traning.webapp.model.Member;
import com.s_giken.traning.webapp.model.MemberSearchCondition;

public interface MemberService {
    Optional<Member> getMemberById(int memberId);
    List<Member> findAll();
    List<Member> findMembers(MemberSearchCondition memberSearchCondition);
}
