package com.idat.EFJesusRafaelPizzarria.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="detalle_pizerria_pizza")
public class PizerriaDetalle {
	
	@Id
	private PizzaPizerriaFK fk =new PizzaPizerriaFK();

	public PizzaPizerriaFK getFk() {
		return fk;
	}

	public void setFk(PizzaPizerriaFK fk) {
		this.fk = fk;
	}
	

}