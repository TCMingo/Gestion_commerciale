package com.app.gestion.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.app.gestion.dao.TvaRepository;
import com.app.gestion.entities.Tva;
import com.app.gestion.imetier.ITvaMetier;

@Service
@Transactional
public class TvaMetierImpl implements ITvaMetier {
	@Autowired
	private TvaRepository tvaRep;

	@Override
	public List<Tva> getTvas() {
		// TODO Auto-generated method stub
		return tvaRep.findAll();
	}

	@Override
	public Page<Tva> getTvas(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Tva> getTvasByDesignation(String designation, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tva getTva(Long code) {
		// TODO Auto-generated method stub
		return tvaRep.findById(code).get();
	}

	@Override
	public Tva saveTva(Tva tva) {
		// TODO Auto-generated method stub
		return tvaRep.save(tva);
	}

	@Override
	public boolean deleteTva(Long code) {
		// TODO Auto-generated method stub
		Tva tva = getTva(code);
		if (tva == null)
			return false;
		tvaRep.delete(tva);
		return true;
	}

}
