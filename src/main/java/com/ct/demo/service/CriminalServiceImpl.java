package com.ct.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.demo.entity.Criminal;
import com.ct.demo.repo.CriminalRepo;

@Service
public class CriminalServiceImpl implements CriminalService {

	@Autowired
	CriminalRepo Crepo;

	public CriminalServiceImpl(CriminalRepo Crepo) {
		super();
		this.Crepo = Crepo;
	}

	@Override
	public List<Criminal> allCriminals() {

		return Crepo.findAll();
	}

	@Override
	public Criminal saveCriminalDetails(Criminal criminal) {

		return Crepo.save(criminal);
	}

	@Override
	public Criminal getCriminalById(Long id) {

		return Crepo.findById(id).get();
	}

	@Override
	public Criminal updateCriminal(Criminal criminal) {

		return Crepo.save(criminal);
	}

	@Override
	public void deleteCriminal(Long id) {

		Crepo.deleteById(id);

	}

}
