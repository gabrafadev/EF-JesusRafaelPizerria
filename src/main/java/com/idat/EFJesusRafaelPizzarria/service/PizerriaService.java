package com.idat.EFJesusRafaelPizzarria.service;

import com.idat.EFJesusRafaelPizzarria.entity.Pizerria;

public interface PizerriaService {
	
	Pizerria obtenerId(Integer id);
	
	void guardar(Pizerria pizerria);

	
	void asignarPizerria();
}
