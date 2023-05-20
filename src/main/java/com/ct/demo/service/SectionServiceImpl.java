package com.ct.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.demo.entity.Section;
import com.ct.demo.repo.SectionRepo;

@Service
public class SectionServiceImpl implements SectionService{
	
	@Autowired
	SectionRepo repo;
	
	public SectionServiceImpl(SectionRepo repo) {
		super();
		this.repo = repo;
	}

	

	@Override
	public List<Section> allCriminals() {
		
		return repo.findAll();
	}

	@Override
	public Section saveSectionDetails(Section section) {
		
		return repo.save(section);
	}

	@Override
	public Section getCriminalById(Long id) {
		
		return repo.findById(id).get();
	}

	@Override
	public Section updateCriminal(Section section) {
		
		return repo.save(section);
	}

	@Override
	public void deleteCriminal(Long id) {
		repo.deleteById(id);
		
	}

}
