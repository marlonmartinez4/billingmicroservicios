package com.sofka.billingrest.domain.service;

import java.util.List;

import com.sofka.billingrest.domain.model.EntityBill;


public interface BillService {
	
	List< EntityBill > findAll();
	
    EntityBill findByIdBillClient (String idBillClient);

    EntityBill saveNewBill (EntityBill entityBill);

    void updateByIdBill (EntityBill entityBill);

    void deleteByIdBill (String idBillClient);

}
