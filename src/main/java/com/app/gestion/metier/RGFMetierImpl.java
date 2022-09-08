package com.app.gestion.metier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.gestion.dao.ReglementFactureRepository;
import com.app.gestion.entities.ReglementFacture;
import com.app.gestion.imetier.IRGFMetier;

@Service
@Transactional
public class RGFMetierImpl implements IRGFMetier {
	@Autowired
	private ReglementFactureRepository regRep;

	@Override
	public ReglementFacture getReglementFacture(Long id) {
		// TODO Auto-generated method stub
		return regRep.findById(id).get();
	}

	@Override
	public ReglementFacture saveReglementFacture(ReglementFacture reglementFacture) {
		// TODO Auto-generated method stub
		return regRep.save(reglementFacture);
	}

	@Override
	public boolean deleteReglementFacture(Long id) {
		// TODO Auto-generated method stub
		ReglementFacture rgf = regRep.findById(id).get();
		if (rgf == null)
			return false;
		regRep.delete(rgf);
		return true;
	}

}
