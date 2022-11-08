package net.code.java.Cap1.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.code.java.Cap1.models.Admin;
import net.code.java.Cap1.models.ResponseObject;
import net.code.java.Cap1.repository.AdminRepositiry;






@RestController
@RequestMapping(path = "/api/Admin")

public class AdminController {
	
	@Autowired
	private AdminRepositiry repository;
	
	
	//this request is: http://localhost:8080/api/Admin
	@GetMapping("")
	List<Admin> GetAllAdmin(){
		return repository.findAll();
	}

	//Get detail admin
	@GetMapping("get/{id}")
	ResponseEntity<ResponseObject>  findById(@PathVariable Long id ) {
		Optional<Admin> foundAdmin = repository.findById(id);
		if(foundAdmin.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new ResponseObject("Ok", "query product successfully",foundAdmin) 
					);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
					new ResponseObject("Failed", "Can not find product with id: " + id , "") 
					
					);
		}	
	}
	//insert new product with POST method
	//Post man: RAW, JSON
	
	@PostMapping("/insert")
	ResponseEntity<ResponseObject> insertAdmin(@RequestBody Admin newAdmin){
		/*
		List<Admin> foundAdmin = repository.findByFullNameAdmin(newAdmin.getFullNameAdmin().trim());
		if(foundAdmin.size()>0) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
					new ResponseObject("Failed", "Admin name already taken", "")
					);
		}
		return ResponseEntity.status(HttpStatus.OK).body(
				new ResponseObject("Ok", "Insert Admin successfully", repository.save(newAdmin)) 
				);
				*/
		
		return ResponseEntity.status(HttpStatus.OK).body(
				new ResponseObject("Ok", "Insert Admin successfully", repository.save(newAdmin)) 
				);		
	}
	
	//update , upsert =  update if found, otherwise insert
	 
	@PutMapping("put/{id}")
	    ResponseEntity<ResponseObject> updateAdmin(@RequestBody Admin newAdmin, @PathVariable Long id) {
	        Admin updateAdmin = repository.findById(id)
	                .map(Admin -> {
	                	Admin.setAdmin_ID(newAdmin.getAdmin_ID());
	                	Admin.setFullNameAdmin(newAdmin.getFullNameAdmin());
	                	Admin.setAddress_Admin(newAdmin.getAddress_Admin());
	                	Admin.setDatetime_Admin(newAdmin.getDatetime_Admin());
	                	Admin.setSex(newAdmin.getSex());
	                	Admin.setGmail(newAdmin.getGmail());
	                	Admin.setTelephone(newAdmin.getTelephone());
	                	Admin.setAdd_Wallet(newAdmin.getAdd_Wallet());
	                    return repository.save(Admin);
	                }).orElseGet(() -> {
	                    newAdmin.setAdmin_ID(id);
	                    return repository.save(newAdmin);
	                });
	        return ResponseEntity.status(HttpStatus.OK).body(
	                new ResponseObject("ok", "Update Product successfully", updateAdmin)
	        );
	    }
	
	//Delete a Product => DELETE method
    @DeleteMapping("delete/{id}")
    ResponseEntity<ResponseObject> deleteProduct(@PathVariable Long id) {
        boolean exists = repository.existsById(id);
        if(exists) {
            repository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("ok", "Delete product successfully", "")
            );
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
            new ResponseObject("failed", "Cannot find product to delete", "")
        );
    }
	    
	
}


	
