package com.app.gestion.imetier;

import com.app.gestion.entities.ReglementFacture;

public interface IRGFMetier {
	public ReglementFacture getReglementFacture(Long id);

	public ReglementFacture saveReglementFacture(ReglementFacture reglementFacture);

	public boolean deleteReglementFacture(Long id);
}
