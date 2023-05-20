package com.ct.demo.service;

import java.util.List;

import com.ct.demo.entity.Criminal;

public interface CriminalService {

	List<Criminal> allCriminals();

	Criminal saveCriminalDetails(Criminal criminal);

	Criminal getCriminalById(Long id);

	Criminal updateCriminal(Criminal criminal);

	void deleteCriminal(Long id);

}
