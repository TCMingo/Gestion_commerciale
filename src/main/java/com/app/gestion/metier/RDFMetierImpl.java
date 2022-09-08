package com.app.gestion.metier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.gestion.dao.ReductionFactureRepository;
import com.app.gestion.entities.ReductionFacture;
import com.app.gestion.imetier.IRDFMetier;

@Service
@Transactional
public class RDFMetierImpl implements IRDFMetier {
	@Autowired
	private ReductionFactureRepository rdfRep;

	@Override
	public ReductionFacture getReductionFacture(Long id) {
		// TODO Auto-generated method stub
		return rdfRep.findById(id).get();
	}

	@Override
	public ReductionFacture saveReductionFacture(ReductionFacture reglementFacture) {
		// TODO Auto-generated method stub
		return rdfRep.save(reglementFacture);
	}

	@Override
	public boolean deleteReductionFacture(Long id) {
		// TODO Auto-generated method stub
		ReductionFacture rdf = rdfRep.findById(id).get();
		if (rdf == null)
			return false;
		rdfRep.delete(rdf);
		return true;
	}

}
