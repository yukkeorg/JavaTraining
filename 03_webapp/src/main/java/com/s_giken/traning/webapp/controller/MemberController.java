package com.s_giken.traning.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.s_giken.traning.webapp.exception.DataNotFoundException;
import com.s_giken.traning.webapp.model.Member;
import com.s_giken.traning.webapp.model.MemberSearchCondition;
import com.s_giken.traning.webapp.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/search")
	public String showSearchCondition(Model model) {
		var memberSearchCondition = new MemberSearchCondition();
		model.addAttribute("memberSearchCondition", memberSearchCondition);
		return "member_search_condition";
	}

	@PostMapping("/search")
	public String searchAndListing(@ModelAttribute("memberSearchCondition") MemberSearchCondition memberSearchCodition,
								   Model model) {
		var result = memberService.findAll();
		model.addAttribute("result", result);
		return "member_search_result";
	}

	@GetMapping("/edit/{id}")
	public String editMember(@PathVariable int id, Model model) {
		var member = memberService.findMemberById(id);
		if(!member.isPresent()) {
			throw new DataNotFoundException("");
		}
		model.addAttribute("member", member);
		return "member_edit";
	}

	@GetMapping("/add")
	public String addMember(Model model) {
		var member = new Member();
		model.addAttribute("member", member);
		return "member_edit";
	}
}