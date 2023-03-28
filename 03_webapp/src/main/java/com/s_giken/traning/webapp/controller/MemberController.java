package com.s_giken.traning.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String search(@RequestParam(value = "name", defaultValue = "world") String name, 
	                     Model model) {
		model.addAttribute("name", name);
		return "top";
	}

	@GetMapping("/list")
	public String list(Model model) {
		var result = memberService.findAll();
		model.addAttribute("result", result);
		return "member_search_result";
	}
}