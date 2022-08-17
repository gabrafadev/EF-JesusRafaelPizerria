package com.idat.EFJesusRafaelPizzarria.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "pizerria")
public class Pizerria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPizerria;
	private String direccion;
	private String sede;
}
	
