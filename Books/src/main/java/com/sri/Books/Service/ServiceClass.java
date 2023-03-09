package com.sri.Books.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.Books.Entity.Books;
import com.sri.Books.Repos.Repos;

@Service

public class ServiceClass {

	@Autowired
	private Repos repo;
	
	public Books savedetails(Books s)
    {
   	 return repo.save(s);
    }
    
    public ArrayList<Books> getAllDetails()
    {
   	 List<Books> arr = new ArrayList<>();
   	 arr=repo.findAll();
   	 return (ArrayList<Books>) arr;  
   	 }

    public void deleteDepartmentById(int id)
    {
   	 repo.deleteById(id);
    }
    
//  public  Books update(int id,Books s) {
//	   return repo.saveAndFlush(s);
//  }
    
    public Books updateDet(int id,Books s)
    {
    	return repo.saveAndFlush(s);
    }

}
