package com.oglas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oglas.dto.IzvestajDTO;
import com.oglas.model.Izvestaj;
import com.oglas.service.IzvestajService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/izvestaj")
public class IzvestajController {

	@Autowired
	private IzvestajService izvestajService;
	
	@GetMapping("/{id}/{zahtev}")
	public IzvestajDTO getIzvestaj(@PathVariable("id") Long id, @PathVariable("zahtev") Long zahtev) {
		Izvestaj i = izvestajService.getOneIzvestaj(id, zahtev);
		if(i == null) {
			return null;
		}else {
			return new IzvestajDTO(i);
		}
	}
	
	@PutMapping
	public ResponseEntity<?> save(@RequestBody IzvestajDTO izvestajDTO){
		Izvestaj i = this.izvestajService.sacuvajIzvestaj(izvestajDTO);
		
		if(i != null)
			return new ResponseEntity<>(HttpStatus.CREATED);
		
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
}
