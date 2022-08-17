package com.idat.EFJesusRafaelPizzarria.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class PizzaPizerriaFK implements Serializable{
	

	private static final long serialVersionUID = 4417214286334278899L;

	@Column(name="idPizerria", nullable = false, unique = true)
	private Integer idPizerria;
	
	@Column(name="idPizza", nullable = false, unique = true)
	private Integer idPizza;

	
	
}