package com.app.gestion.imetier;

import com.app.gestion.entities.ReductionFacture;

public interface IRDFMetier {
	public ReductionFacture getReductionFacture(Long id);

	public ReductionFacture saveReductionFacture(ReductionFacture reglementFacture);

	public boolean deleteReductionFacture(Long id);
}
