package com.sofka.billingrest;

import javax.annotation.Resource;

import com.sofka.billingrest.application.InvoiceController;
import com.sofka.billingrest.domain.model.EntityBill;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ModelMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Resource
	private InvoiceController invoiceController;

	@Test
	public void contextLoads() {
	}

	@Test
	public void saveNewBillTest() {
		EntityBill entityBill = new EntityBill();
		entityBill.setIdBillClient("3");
		entityBill.setNameClient("sura");
		entityBill.setCompanyLeader("tanos");
		entityBill.setTelephoneClient("1111");
		entityBill.setAddressClient("envigado");
		entityBill.setCityClient("medellin");
		entityBill.setCurrencyToPay("pesos");
		entityBill.setDescriptionProduct("software facturacion");
		entityBill.setAmountHoursWorked("550");
		entityBill.setDiscount("0");
		entityBill.setFullPayment("55000000");
		
		ModelMap model = new ModelMap();
		
	invoiceController.save (entityBill);
	Assert.assertEquals(false, model.containsAttribute("futuraAccion"));
	
}

	@Test
	public void getAllsbillsTest() {
		EntityBill entityBill = new EntityBill();
		entityBill.getIdBillClient();
		entityBill.getNameClient();
		entityBill.getCompanyLeader();
		entityBill.getTelephoneClient();
		entityBill.getAddressClient();
		entityBill.getCityClient();
		entityBill.getCurrencyToPay();
		entityBill.getDescriptionProduct();
		entityBill.getAmountHoursWorked();
		entityBill.getDiscount();
		entityBill.getFullPayment();
		
		ModelMap model = new ModelMap();
		
	invoiceController.getAllBills();
	Assert.assertEquals(false, model.containsAttribute("futuraAccion"));
	
}

	@Test
	public void  getIdBillClientTest() {
		EntityBill entityBill = new EntityBill();
		entityBill.getIdBillClient();
		entityBill.getNameClient();
		entityBill.getCompanyLeader();
		entityBill.getTelephoneClient();
		entityBill.getAddressClient();
		entityBill.getCityClient();
		entityBill.getCurrencyToPay();
		entityBill.getDescriptionProduct();
		entityBill.getAmountHoursWorked();
		entityBill.getDiscount();
		entityBill.getFullPayment();
		
		ModelMap model = new ModelMap();
		
	invoiceController.getByIdBill("2");
	Assert.assertEquals(false, model.containsAttribute("futuraAccion"));
	
}

@Test
public void updateIdBillClientTest(){
	EntityBill entityBill = new EntityBill();
		entityBill.setIdBillClient("2");
		entityBill.setNameClient("coordinadora");
		entityBill.setCompanyLeader("tanos");
		entityBill.setTelephoneClient("1333");
		entityBill.setAddressClient("envigado");
		entityBill.setCityClient("medellin");
		entityBill.setCurrencyToPay("pesos");
		entityBill.setDescriptionProduct("software facturacion");
		entityBill.setAmountHoursWorked("550");
		entityBill.setDiscount("0");
		entityBill.setFullPayment("55000000");
	
	ModelMap model = new ModelMap();
	
	invoiceController.updateBillClient(entityBill);
	Assert.assertEquals(false, model.containsAttribute("futuraAccion"));
}
 
@Test
public void deleteBillByIdTest() throws Exception {
	EntityBill entityBill = new EntityBill();
	entityBill.setIdBillClient("2");
	ModelMap model = new ModelMap();
	invoiceController.deleteBillById("2");
	Assert.assertEquals(false, model.containsAttribute("futuraAccion"));
}


}
