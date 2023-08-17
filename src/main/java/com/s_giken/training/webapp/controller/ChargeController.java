package com.s_giken.training.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.s_giken.training.webapp.exception.NotFoundException;
import com.s_giken.training.webapp.model.Charge;
import com.s_giken.training.webapp.model.ChargeSearchCondition;
import com.s_giken.training.webapp.service.ChargeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

/**
 * 課金情報コントローラ
 */
@Controller
@RequestMapping("/charge")
public class ChargeController {
	private final ChargeService chargeService;

	/**
	 * コンストラクタ
	 * 
	 * @param chargeService 課金情報サービスオブジェクト(Springから自動的にインスタンスが渡される)
	 */
	public ChargeController(ChargeService chargeService) {
		this.chargeService = chargeService;
	}

	/**
	 * 検索条件画面表示
	 * 
	 * @param model Thymeleafに渡すデータを保持するオブジェクト
	 * @return 検索条件画面のテンプレート名
	 */
	@GetMapping("/search")
	public String showSearchCondition(Model model) {
		var chargeSearchCondition = new ChargeSearchCondition();
		model.addAttribute("chargeSearchCondition", chargeSearchCondition);
		return "charge_search_condition";
	}

	/**
	 * 検索結果画面表示
	 * 
	 * @param chargeSearchCodition 検索条件
	 * @param model Thymeleafに渡すデータを保持するオブジェクト
	 * @return 検索結果画面のテンプレート名
	 */
	@PostMapping("/search")
	public String searchAndListing(
			@ModelAttribute("chargeSearchCondition") ChargeSearchCondition chargeSearchCodition,
			Model model) {
		var result = chargeService.findByCondition(chargeSearchCodition);
		model.addAttribute("result", result);
		return "charge_search_result";
	}

	/**
	 * 課金情報編集画面表示
	 * 
	 * @param id 課金情報ID
	 * @param message メッセージ
	 * @param model Thymeleafに渡すデータを保持するオブジェクト
	 * @return 課金情報編集画面のテンプレート名
	 */
	@GetMapping("/edit/{id}")
	public String edit(
			@PathVariable int id,
			Model model) {
		var charge = chargeService.findById(id);
		if (!charge.isPresent()) {
			throw new NotFoundException("chargeId is not found.");
		}
		model.addAttribute("chargeId", id);
		model.addAttribute("charge", charge);
		return "charge_edit";
	}

	/**
	 * 課金情報追加画面表示
	 * 
	 * @param model Thymeleafに渡すデータを保持するオブジェクト
	 * @return 課金情報追加画面のテンプレート名
	 */
	@GetMapping("/add")
	public String add(Model model) {
		var charge = new Charge();
		model.addAttribute("charge", charge);
		return "charge_edit";
	}

	/**
	 * 課金情報保存
	 * 
	 * @param charge バリデーション済み課金情報
	 * @param bindingResult バインド結果
	 * @param redirectAttributes リダイレクト先に渡すデータを保持するオブジェクト
	 * @return リダイレクト先のURL
	 */
	@PostMapping("/save")
	public String save(
			@Validated Charge charge,
			BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			return "charge_edit";
		}
		chargeService.save(charge);
		redirectAttributes.addFlashAttribute("message", "保存しました");
		return "redirect:/charge/edit/" + charge.getChargeId();
	}

	/**
	 * 課金情報削除
	 * 
	 * @param id 課金情報ID
	 * @param redirectAttributes リダイレクト先に渡すデータを保持するオブジェクト
	 * @return リダイレクト先のURL
	 */
	@GetMapping("/delete/{id}")
	public String delete(
			@PathVariable int id,
			RedirectAttributes redirectAttributes) {
		if (!chargeService.findById(id).isPresent()) {
			throw new NotFoundException("");
		}

		chargeService.deleteById(id);

		redirectAttributes.addFlashAttribute("message", String.format("Id:%d を削除しました", id));

		return "redirect:/charge/search";
	}
}
