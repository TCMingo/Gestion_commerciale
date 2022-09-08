package com.app.gestion.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.app.gestion.dao.ReductionRepository;
import com.app.gestion.entities.Reduction;
import com.app.gestion.imetier.IReductionMetier;

@Service
@Transactional
public class ReductionMetierImpl implements IReductionMetier {
	@Autowired
	private ReductionRepository regRep;

	@Override
	public List<Reduction> getReductions() {
		// TODO Auto-generated method stub
		return regRep.findAll();
	}

	@Override
	public Page<Reduction> getReductions(int page, int size) {
		// TODO Auto-generated method stub
		return regRep.findAll(PageRequest.of(page, size));
	}

	@Override
	public Reduction getReduction(Long id) {
		// TODO Auto-generated method stub
		return regRep.findById(id).get();
	}

	@Override
	public Reduction saveReduction(Reduction reglement) {
		// TODO Auto-generated method stub
		return regRep.save(reglement);
	}

	@Override
	public boolean deleteReduction(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
