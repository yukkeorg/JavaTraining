package com.s_giken.traning.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import com.s_giken.traning.webapp.exception.DataNotFoundException;
import com.s_giken.traning.webapp.model.Charge;
import com.s_giken.traning.webapp.model.ChargeSearchCondition;
import com.s_giken.traning.webapp.service.ChargeService;


@Controller
@RequestMapping("/charge")
public class ChargeController {
	@Autowired
	private ChargeService chargeService;
	
	@GetMapping("/search")
	public String showSearchCondition(Model model) {
		var chargeSearchCondition = new ChargeSearchCondition();
		model.addAttribute("chargeSearchCondition", chargeSearchCondition);
		return "charge_search_condition";
	}

	@PostMapping("/search")
	public String searchAndListing(@ModelAttribute("chargeSearchCondition") ChargeSearchCondition chargeSearchCodition,
								   Model model) {
		var result = chargeService.findAll();
		model.addAttribute("result", result);
		return "charge_search_result";
	}

	@GetMapping("/edit/{id}")
	public String editCharge(@PathVariable int id, Model model) {
		var charge = chargeService.findById(id);
		if(!charge.isPresent()) {
			throw new DataNotFoundException("");
		}
		model.addAttribute("charge", charge);
		return "charge_edit";
	}

	@GetMapping("/add")
	public String addCharge(Model model) {
		var charge = new Charge();
		model.addAttribute("charge", charge);
		return "charge_edit";
	}

	@PostMapping("/save")
	public String saveCharge(@Validated Charge charge, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "charge_edit";
		}
		
		chargeService.save(charge);
		return "redirect:/charge/search";
	}

	@GetMapping("/delete/{id}")
	public String deleteCharge(@PathVariable int id) {
		if (!chargeService.findById(id).isPresent()) {
			throw new DataNotFoundException("");
		}
		chargeService.deleteById(id);
		return "redirect:/charge/search";
	}
}