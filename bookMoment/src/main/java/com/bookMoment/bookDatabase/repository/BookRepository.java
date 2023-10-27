package com.bookMoment.bookDatabase.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookMoment.bookDatabase.domain.Book;

import lombok.extern.slf4j.Slf4j;

// Book 엔티티의 저장소이고 ID 형식이 Long임을 정의한 것
public interface BookRepository extends CrudRepository<Book, Long> {
	
	// 조건없이 모든 테이블의 전체 레코드 조회
	@Override
	List<Book> findAll();
	
	
	
	

}
