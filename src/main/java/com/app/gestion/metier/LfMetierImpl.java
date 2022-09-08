package com.app.gestion.metier;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.app.gestion.dao.LfRepository;
import com.app.gestion.entities.LigneFacture;
import com.app.gestion.imetier.ILfMetier;
 

@Service
@Transactional
public class LfMetierImpl implements ILfMetier
{ 
	@Autowired
	private LfRepository lnfRep;

	@Override
	public LigneFacture getLigneFacture(Long id) {
		// TODO Auto-generated method stub
		return lnfRep.findById(id).get();
	}

	@Override
	public LigneFacture saveLigneFacture(LigneFacture lc) {
		// TODO Auto-generated method stub
		return lnfRep.save(lc);
	}

	@Override
	public boolean deleteLigneFacture(Long id) {
		// TODO Auto-generated method stub
		LigneFacture lc = lnfRep.findById(id).get();
		if(lc==null) return false;
		lnfRep.delete(lc);
		return true;
	}

	@Override
	public Page<LigneFacture> getLignesFacture(Date d1, Date d2) {
		return lnfRep.findAllBetween(d1,d2,PageRequest.of(0, 10));
	}
 
 
 
}
