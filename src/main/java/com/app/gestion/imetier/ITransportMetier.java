package com.app.gestion.imetier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.app.gestion.entities.Transport;

public interface ITransportMetier {
	public List<Transport> findAllTransports();

	public Page<Transport> findAllTransports(int page, int size);

	public Transport getTransport(Long code);

	public Transport saveTransport(Transport transport);

	public boolean deleteTransport(Long ref);
}
