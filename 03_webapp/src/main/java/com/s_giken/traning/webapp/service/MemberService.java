package com.s_giken.traning.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s_giken.traning.webapp.model.Member;
import com.s_giken.traning.webapp.repository.MemberRepository;

@Service
public class MemberService {

    @Autowired
    private  MemberRepository memberRepository;


    public List<Member> findAll() {
        return memberRepository.findAll();
    }    
}
