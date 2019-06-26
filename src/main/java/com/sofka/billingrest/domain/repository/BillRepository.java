package com.sofka.billingrest.domain.repository;

import java.util.Optional;

import com.sofka.billingrest.domain.model.EntityBill;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository("repository")
public interface BillRepository extends MongoRepository<EntityBill, String>{
	
	@SuppressWarnings("unchecked")
	EntityBill save(EntityBill entityBill);
	
	Optional< EntityBill > findByIdBillClient(String idBillClient);
}
