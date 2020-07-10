package com.example.arv.service;

import java.util.Set;

import com.example.arv.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
	
}
