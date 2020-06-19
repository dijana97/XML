package com.agentApp.app.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agentApp.app.dto.PorukaDTO;
import com.agentApp.app.models.Poruka;
import com.agentApp.app.repository.PorukaRepository;
import com.agentApp.app.repository.ZahtevRepository;

@Service
public class PorukaService {

	
	@Autowired
	private PorukaRepository porukaRepository;
	
	@Autowired
	private ZahtevRepository zahtevRepository;
	
	
	public boolean create(PorukaDTO porukaDTO, String username) {
		
		if(  porukaDTO.getSadrzaj()==null || porukaDTO.getZahtev()==null) {
		
		return false;
		}		
			LocalDateTime lt  = LocalDateTime.now();
			System.out.println(lt);
			Poruka p=new Poruka();
			p.setDatum(lt);
			p.setSadrzaj(porukaDTO.getSadrzaj());
			p.setZahtev(porukaDTO.getZahtev());
			p.setIznm(porukaDTO.isIznm());
			p.setDat(lt.toString());
			p.setKreator(username);
			porukaRepository.save(p);
			
		System.out.println("Dobro je");
		return true;
		
	}


	public Poruka findByZahtev(Long id) {
		List<Poruka> poruke=this.porukaRepository.findAll();
		for(Poruka pp:poruke) {
			if(pp.getZahtev()==id) {
				return pp;
			}
		}
		return null;
	}

	public List<Poruka> findByZahtevList(Long id) {
		List<Poruka> poruke=this.porukaRepository.findAll();
		List<Poruka> vrati=new ArrayList<Poruka>();
		for(Poruka pp:poruke) {
			if(pp.getZahtev()==id) {
				vrati.add(pp);
				System.out.println(pp.getDatum());
			}
		}
		return vrati;
	}

	


	
}