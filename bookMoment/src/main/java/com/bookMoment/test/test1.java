package com.bookMoment.test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookMoment.bookDatabase.domain.Book;
import com.bookMoment.bookDatabase.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class test1 {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
    	log.info("getAllBooks 실행 결과 : "+bookRepository.findAll());
        return bookRepository.findAll();
    }
    
    public Book getBookById(Long id) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	if (optionalBook.isPresent()) {
    		return optionalBook.get();
    	} else {
    		return null;
    	}
    	
		
    }
}