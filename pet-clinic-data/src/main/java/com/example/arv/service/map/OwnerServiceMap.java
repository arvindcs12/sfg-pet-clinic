package com.example.arv.service.map;

import java.util.Set;

import com.example.arv.model.Owner;
import com.example.arv.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		super.save(object.getId(), object);
		return object;
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

}
