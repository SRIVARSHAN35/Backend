package com.sri.Books.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sri.Books.Entity.Books;
import com.sri.Books.Service.ServiceClass;

@CrossOrigin
@RestController
public class ControllerClass {
	
	@Autowired
	private ServiceClass ser;
	
	@GetMapping("/show")
	public List<Books> getBooks()
	{
		return ser.getAllDetails()
;	}
	
	@PostMapping("/addStudent")
	public Books postDetails(@RequestBody Books s) {
		return ser.savedetails(s);
		
	}
	
	@DeleteMapping ("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		ser.deleteDepartmentById(id);
	}
//	@PutMapping("/update/{id}")
//      public  Books  update(@PathVariable int id,@RequestBody Books s) {
//    	  return ser.update(id,s);
//      }
	@PutMapping("/update/{id}")
	public Books update(@PathVariable("id") int id ,@RequestBody Books s  )
	{
		return ser.updateDet(id, s);
	}
	

 
}
