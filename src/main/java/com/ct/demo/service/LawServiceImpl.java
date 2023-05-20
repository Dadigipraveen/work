package com.ct.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.demo.entity.Law;
import com.ct.demo.repo.LawRepo;

@Service
public class LawServiceImpl implements LawService {

	@Autowired
	LawRepo Lrepo;

	public LawServiceImpl(LawRepo Lrepo) {
		super();
		this.Lrepo = Lrepo;
	}

	@Override
	public List<Law> allLaws() {

		return Lrepo.findAll();
	}

	@Override
	public Law saveLawDetails(Law law) {

		return Lrepo.save(law);
	}

	@Override
	public Law getLawById(Long id) {

		return Lrepo.findById(id).get();
	}

	@Override
	public Law updatelaw(Law law) {

		return Lrepo.save(law);
	}

	@Override
	public void deleteLaw(Long id) {
		Lrepo.deleteById(id);

	}

}
