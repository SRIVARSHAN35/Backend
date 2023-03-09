package com.sri.Books.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sri.Books.Entity.Books;

public interface Repos extends JpaRepository<Books,Integer> {

}
