package com.app.gestion.conversions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.app.gestion.entities.Client;
import com.app.gestion.imetier.IClientMetier;

public final class ClientConverter implements Converter<String, Client> {

	@Autowired
	private IClientMetier mc;

	public ClientConverter(IClientMetier mc) {
		this.mc = mc;
	}

	@Override
	public Client convert(String id) {
		return mc.getClient(id);
	}
}