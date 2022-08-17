package com.idat.EFJesusRafaelPizzarria.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFJesusRafaelPizzarria.dto.Pizza;



@FeignClient(name="EF-JesusRafaelPizza", url="localhost:8090")
public interface OpenFeignClient {

	@GetMapping("/api/cliente/v1/listar")
	public List<Pizza> listarPizeria();
}
