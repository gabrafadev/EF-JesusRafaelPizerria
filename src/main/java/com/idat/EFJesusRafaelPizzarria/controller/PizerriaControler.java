package com.idat.EFJesusRafaelPizzarria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.EFJesusRafaelPizzarria.entity.Pizerria;
import com.idat.EFJesusRafaelPizzarria.service.PizerriaService;


@RestController
@RequestMapping("/api/pizerria/v1")
public class PizerriaControler {

	@Autowired
	private PizerriaService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Pizerria pizerria) {
		service.guardar(pizerria);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarAlumnosAaula() {
		service.asignarPizerria();
	}
}