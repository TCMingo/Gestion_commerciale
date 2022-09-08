package com.app.gestion.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.app.gestion.dao.ReglementRepository;
import com.app.gestion.entities.Reglement;
import com.app.gestion.imetier.IReglementMetier;

@Service
@Transactional
public class ReglementMetierImpl implements IReglementMetier {
	@Autowired
	private ReglementRepository regRep;

	@Override
	public List<Reglement> getReglements() {
		// TODO Auto-generated method stub
		return regRep.findAll();
	}

	@Override
	public Page<Reglement> getReglements(int page, int size) {
		// TODO Auto-generated method stub
		return regRep.findAll(PageRequest.of(page, size));
	}

	@Override
	public Reglement getReglement(Long id) {
		// TODO Auto-generated method stub
		return regRep.findById(id).get();
	}

	@Override
	public Reglement saveReglement(Reglement reglement) {
		// TODO Auto-generated method stub
		return regRep.save(reglement);
	}

	@Override
	public boolean deleteReglement(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
