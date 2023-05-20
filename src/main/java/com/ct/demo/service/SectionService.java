package com.ct.demo.service;

import java.util.List;

import com.ct.demo.entity.Section;

public interface SectionService {
	
List<Section> allCriminals();
	
	Section saveSectionDetails(Section section);
	
	Section getCriminalById(Long id);
	
	Section updateCriminal(Section section);
	
	void deleteCriminal(Long id);

}
