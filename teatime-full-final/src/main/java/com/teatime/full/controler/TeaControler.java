package com.teatime.full.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.teatime.full.dao.TeaDAO;
import com.teatime.full.entity.Tea;
import com.teatime.full.service.TeaService;

@Controller
@RequestMapping("/tea")
public class TeaControler {
	
	@Autowired
	private TeaService teaService;
	
	@RequestMapping("/list")
	public String listTea(Model theModel) {
		
		List<Tea> theTeas = teaService.getTea();
		
		theModel.addAttribute("teas", theTeas);
		
		return "list-tea";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Tea theTea = new Tea();
		
		theModel.addAttribute("tea", theTea);
		return ("tea-form");
	}
	
	@PostMapping("/saveTea")
	public String saveTea(@ModelAttribute("tea") Tea theTea) {
		
		teaService.saveTea(theTea);
		
		return "redirect:/tea/list";	
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("teaId") int theId, Model theModel){
		
		Tea theTea = teaService.getTea(theId);
		
		theModel.addAttribute("tea", theTea);
		
		return ("tea-form");
		
	}
	
	
	@GetMapping("/delete")
	public String deleteTea(@RequestParam("teaId")int theId, Model theModel) {
		
		teaService.deleteTea(theId);
		
		return("redirect:/tea/list");
		
	}
	

}
