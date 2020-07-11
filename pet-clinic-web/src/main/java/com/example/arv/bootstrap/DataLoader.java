package com.example.arv.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.arv.model.Owner;
import com.example.arv.model.Vet;
import com.example.arv.service.OwnerService;
import com.example.arv.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Jordon");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Usain");
		owner2.setLastName("Bolt");

		ownerService.save(owner2);

		System.out.println("Loaded owners...");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Hukum");
		vet1.setLastName("Chand");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Vineesh");
		vet2.setLastName("Malik");
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
	}

}
