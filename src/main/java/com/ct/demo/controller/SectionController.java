package com.ct.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ct.demo.entity.Section;
import com.ct.demo.repo.SectionRepo;
import com.ct.demo.service.SectionServiceImpl;



@Controller
public class SectionController {
	
	@Autowired
	SectionServiceImpl service;
	
	
	public SectionController(SectionRepo repo) {
		super();
		this.service = service;
		
	}

	@GetMapping("/SectionView")
	public String SectionView(Model model) {
		List<Section> list = service.allCriminals();
		model.addAttribute("Sections", list);

		return "Section-view";

	}

	@GetMapping("/addSections")
	public String addSections(Model model) {
		Section section = new Section();
		model.addAttribute("Sections", section);
		return "add-Criminal";
	}

	@PostMapping("/saveCriminal")
	public String saveSection(@ModelAttribute("Section") Section section) {
		service.saveSectionDetails(section);

		return "redirect:/SectionView";

	}

	@GetMapping("/editCriminal/{id}")
	public String editCriminal(@PathVariable Long id, Model model) {
		Section section = service.getCriminalById(id);
		model.addAttribute("Section", section);

		return "edit-Criminal";
	}

	@PostMapping("/updateCriminal/{id}")
	public String updateCriminal(@PathVariable Long id, @ModelAttribute("Section") Section Section, Model model) {
		Section section= service.getCriminalById(id);
		section.setNo(Section.getNo());
		section.setName(Section.getName());
		section.setType(Section.getType());
		section.setDescription(Section.getDescription());

		return "redirect:/SectionView";
	}
	@GetMapping("/deleteCriminal/{id}")
	public String deleteCriminal(@PathVariable Long id) 
	{
		service.deleteCriminal(id);
		return "redirect:/SectionView";
	}

	
	
	

}
