package com.example.arv.service;

import java.util.Set;

import com.example.arv.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
