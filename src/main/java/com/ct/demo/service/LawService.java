package com.ct.demo.service;

import java.util.List;

import com.ct.demo.entity.Law;

public interface LawService {

	List<Law> allLaws();

	Law saveLawDetails(Law law);

	Law getLawById(Long id);

	Law updatelaw(Law law);

	void deleteLaw(Long id);

}
