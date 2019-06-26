package com.sofka.billingrest.application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sofka.billingrest.domain.model.EntityBill;
import com.sofka.billingrest.domain.service.BillService;

@RestController
@RequestMapping("bills")
public class InvoiceController {
	
	@Autowired
	@Qualifier("service")
	protected BillService billService;

	private EntityBill bill;
	

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<EntityBill> save(@RequestBody @Valid EntityBill bill) {
		
		 return ResponseEntity.ok(billService.saveNewBill(bill));
		 
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<EntityBill> getAllBills(){
		
		return this.billService.findAll();
	}
	
	@RequestMapping(value = "/{idBill}", method = RequestMethod.GET)
	public ResponseEntity<EntityBill> getByIdBill(@PathVariable String idBill) {
		
		bill=this.billService.findByIdBillClient(idBill);
		
		return ResponseEntity.ok(bill);
	}

	@RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity< Void > updateBillClient (@RequestBody @Valid EntityBill bill) {

        billService.updateByIdBill(bill);

        return ResponseEntity.noContent().build();
    }

	
	@RequestMapping(value = "/{idBill}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteBillById (@PathVariable String idBill) {

		billService.deleteByIdBill(idBill);

        return ResponseEntity.noContent().build();

	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map < String, String > handleValidationExceptions(MethodArgumentNotValidException exception){
        
        Map < String, String > errors = new HashMap<>();

        exception.getBindingResult().getAllErrors().forEach((error) ->{
            String fieldName = ((FieldError)error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
