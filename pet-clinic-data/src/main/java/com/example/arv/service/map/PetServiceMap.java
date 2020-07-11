package com.example.arv.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.arv.model.Pet;
import com.example.arv.service.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Pet save(Pet object) {
		super.save(object.getId(), object);
		return object;
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

}
