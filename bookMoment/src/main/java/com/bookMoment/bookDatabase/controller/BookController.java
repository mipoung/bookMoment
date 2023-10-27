package com.bookMoment.bookDatabase.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookMoment.bookDatabase.domain.Book;
import com.bookMoment.bookDatabase.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/books")
public class BookController {
	// 
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping
	public String listBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		log.info("결과 :"+ bookRepository.findAll());
		return "index";
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBook(@PathVariable Long id){
		Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            return ResponseEntity.ok(optionalBook.get());  
        } else {
            return ResponseEntity.notFound().build();  
        }
		
	}
	

}
