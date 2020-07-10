package com.example.arv.service;

import java.util.Set;

import com.example.arv.model.Owner;

public interface OwnerService {

	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
