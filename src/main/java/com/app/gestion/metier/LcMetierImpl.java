package com.app.gestion.metier;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.gestion.dao.LcRepository;
import com.app.gestion.entities.LigneCommande;
import com.app.gestion.imetier.ILcMetier;
 

@Service
@Transactional
public class LcMetierImpl implements ILcMetier
{ 
	@Autowired
	private LcRepository lncRep;

	@Override
	public LigneCommande getLigneCommande(Long id) {
		// TODO Auto-generated method stub
		return lncRep.findById(id).get();
	}

	@Override
	public LigneCommande saveLigneCommande(LigneCommande lc) {
		// TODO Auto-generated method stub
		return lncRep.save(lc);
	}

	@Override
	public boolean deleteLigneCommande(Long id) {
		// TODO Auto-generated method stub
		LigneCommande lc = lncRep.findById(id).get();
		if(lc==null) return false;
		lncRep.delete(lc);
		return true;
	}

	@Override
	public LigneCommande getLigneCommandeByProduit(Long numeroCommande, String ref) {
		// TODO Auto-generated method stub
		return lncRep.findLcByProduit(numeroCommande,ref);
	}
 
 
}
