package com.springia.init.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springia.init.service.AsistenteMedicoService;

@RestController
public class AsistenteController {
	
	private final AsistenteMedicoService informationService;

	public AsistenteController(AsistenteMedicoService informationService) {
		super();
		this.informationService = informationService;
	}

	@GetMapping("info")
	public ResponseEntity<String> obtenerInfo(@RequestParam("consulta") String consulta){
		return new ResponseEntity<>(informationService.infoLlm(consulta), HttpStatus.OK);
		 
	}
	
	
	

}
