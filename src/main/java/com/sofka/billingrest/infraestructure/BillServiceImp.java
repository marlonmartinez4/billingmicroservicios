package com.sofka.billingrest.infraestructure;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sofka.billingrest.domain.model.EntityBill;
import com.sofka.billingrest.domain.repository.BillRepository;
import com.sofka.billingrest.domain.service.BillService;

@Service("service")
public class BillServiceImp implements BillService {

	@Autowired
	@Qualifier("repository")
	protected BillRepository billRepository;

	@Override
	public List<EntityBill> findAll() {

		return this.billRepository.findAll();
	}

	@Override
	public EntityBill findByIdBillClient(String idBillClient) {
		Optional< EntityBill > bill = billRepository.findByIdBillClient (idBillClient);

		return bill.get();
	}

	@Override
	public EntityBill saveNewBill(EntityBill entityBill) {
		
		return this.billRepository.save(entityBill);
	}

	@Override
	public void updateByIdBill(EntityBill entityBill) {
		
		this.billRepository.save(entityBill);
		
	}

	@Override
	public void deleteByIdBill(String idBillClient) {
		
		this.billRepository.deleteById(idBillClient);
		
	}

}
