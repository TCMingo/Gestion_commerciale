package com.app.gestion.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Transport 
{
	@Id @GeneratedValue
	private Long id;
	
	@Size(min=2, max=50)
	private String type; 
	
	public Transport() {} 
	  
	public Transport(Long id, String type) {
		super();
		this.id = id;
		this.type = type; 
	}
	
	public Transport(String type) {
		super(); 
		this.type = type; 
	}

	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	
}
